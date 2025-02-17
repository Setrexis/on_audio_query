package com.lucasjosino.on_audio_query.query

import android.content.ContentResolver
import android.content.Context
import android.provider.MediaStore
import android.net.Uri
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.lucasjosino.on_audio_query.OnAudioQueryPlugin
import com.lucasjosino.on_audio_query.query.helper.OnAudioHelper
import com.lucasjosino.on_audio_query.types.checkPlaylistsUriType
import com.lucasjosino.on_audio_query.types.sorttypes.checkGenreSortType
import com.lucasjosino.on_audio_query.utils.playlistProjection
import io.flutter.plugin.common.MethodCall
import io.flutter.plugin.common.MethodChannel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

/** OnPlaylistQuery */
class OnPlaylistQuery : ViewModel() {

    //Main parameters
    private val helper = OnAudioHelper()

    // None of this methods can be null.
    private lateinit var uri: Uri
    private lateinit var resolver: ContentResolver
    private lateinit var sortType: String

    /**
     * Method to "query" all playlists.
     *
     * Parameters:
     *   * [context]
     *   * [result]
     *   * [call]
     */
    fun queryPlaylists(context: Context, result: MethodChannel.Result, call: MethodCall) {
        resolver = context.contentResolver

        // Sort: Type and Order.
        sortType = checkGenreSortType(
            call.argument<Int>("sortType")!!,
            call.argument<Int>("orderType")!!
        )
        // Check uri:
        //   * [0]: External.
        //   * [1]: Internal.
        uri = checkPlaylistsUriType(call.argument<Int>("uri")!!)

        // Query everything in background for a better performance.
        viewModelScope.launch {
            // Request permission status from the main method.
            val hasPermission = OnAudioQueryPlugin().onPermissionStatus(context)
            // Empty list.
            var resultPlaylistList = ArrayList<MutableMap<String, Any?>>()

            // We cannot "query" without permission so, just return a empty list.
            if (hasPermission) {
                // Start querying
                resultPlaylistList = loadPlaylists()
            }

            //Flutter UI will start, but, information still loading
            result.success(resultPlaylistList)
        }
    }

    //Loading in Background
    private suspend fun loadPlaylists(): ArrayList<MutableMap<String, Any?>> =
        withContext(Dispatchers.IO) {
            // Setup the cursor with [uri] and [projection].
            val cursor = resolver.query(uri, playlistProjection, null, null, null)
            // Empty list.
            val playlistList: ArrayList<MutableMap<String, Any?>> = ArrayList()

            // For each item(playlist) inside this "cursor", take one and "format"
            // into a [Map<String, dynamic>].
            while (cursor != null && cursor.moveToNext()) {
                val playlistData: MutableMap<String, Any?> = HashMap()
                for (playlistMedia in cursor.columnNames) {
                    playlistData[playlistMedia] = helper.loadPlaylistItem(playlistMedia, cursor)
                }
                val playlistMembersAudioIds: ArrayList<String> = ArrayList()
                val cursor2 = resolver.query(MediaStore.Audio.Playlists.Members.getContentUri("external",cursor.getLong(1)),arrayOf(MediaStore.Audio.Playlists.Members.AUDIO_ID),null,null,null)
                while(cursor2 != null && cursor2.moveToNext()){
                    playlistMembersAudioIds.add(cursor2.getString(0))
                }
                playlistData["memberIDs"] = playlistMembersAudioIds
                playlistList.add(playlistData)
                cursor2?.close()
            }
            cursor?.close()
            return@withContext playlistList
        }
}

//Extras:

//I/OnPlaylistCursor[All/Audio]: [
// _data
// _id
// date_added
// date_modified
// name
// ]
