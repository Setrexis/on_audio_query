package com.lucasjosino.on_audio_query.query

import android.content.ContentResolver
import android.content.Context
import android.net.Uri
import android.provider.MediaStore
import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.lucasjosino.on_audio_query.types.checkAudiosUriType
import com.lucasjosino.on_audio_query.types.checkPlaylistsUriType
import com.lucasjosino.on_audio_query.types.sorttypes.checkGenreSortType
import io.flutter.plugin.common.MethodCall
import io.flutter.plugin.common.MethodChannel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

/** OnPlaylistQuery */
class OnPlaylistQuery : ViewModel() {

    //Main parameters
    private lateinit var uri: Uri
    private lateinit var resolver: ContentResolver
    private lateinit var sortType: String

    //Query projection
    private val projection = arrayOf(
            MediaStore.Audio.Playlists.DATA,
            MediaStore.Audio.Playlists._ID,
            MediaStore.Audio.Playlists.DATE_ADDED,
            MediaStore.Audio.Playlists.DATE_MODIFIED,
            MediaStore.Audio.Playlists.NAME
    )

    //
    fun queryPlaylists(context: Context, result: MethodChannel.Result, call: MethodCall) {
        resolver = context.contentResolver

        //SortType: Type and Order
        sortType = checkGenreSortType(call.argument<Int>("sortType")!!, call.argument<Int>("orderType")!!)
        uri = checkPlaylistsUriType(call.argument<Int>("uri")!!)

        //Query everything in the Background it's necessary for better performance
        viewModelScope.launch {
            //Start querying
            val resultPlaylistList = loadPlaylists()

            //Flutter UI will start, but, information still loading
            result.success(resultPlaylistList)
        }
    }

    //Loading in Background
    private suspend fun loadPlaylists() : ArrayList<MutableMap<String, Any>> = withContext(Dispatchers.IO) {
        val cursor = resolver.query(uri, projection, null, null, null)
        val playlistList: ArrayList<MutableMap<String, Any>> = ArrayList()
        while (cursor != null && cursor.moveToNext()) {
            val playlistData: MutableMap<String, Any> = HashMap()
            for (playlistMedia in cursor.columnNames) {
                if (cursor.getString(cursor.getColumnIndex(playlistMedia)) != null) {
                    playlistData[playlistMedia] = cursor.getString(cursor.getColumnIndex(playlistMedia))
                } else playlistData[playlistMedia] = ""
            }
            val playlistMembersAudioIds: ArrayList<String> = ArrayList()
            val cursor2 = resolver.query(MediaStore.Audio.Playlists.Members.getContentUri("external",cursor.getLong(1)),arrayOf(MediaStore.Audio.Playlists.Members.AUDIO_ID),null,null,null)
            while(cursor2 != null && cursor2.moveToNext()){
                playlistMembersAudioIds.add(cursor2.getString(0))
            }
            playlistData["memberIDs"] = playlistMembersAudioIds;
            playlistList.add(playlistData)
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
