## [2.0.0] - [08.05.2021]
### Release
- `[2.0.0]` release.

See all development [changes](https://github.com/LucasPJS/on_audio_query/blob/main/CHANGELOG.md):
- [2.0.0-beta.3](#200-beta3---08172021---github-only)
- [2.0.0-beta.2](#200-beta2---08152021)
- [2.0.0-beta.1](#200-beta1---08142021)
- [2.0.0-beta.0](#200-beta0---08132021)
- [2.0.0-alpha.1](#200-alpha1---08082021---github-only)
- [2.0.0-alpha.0](#200-alpha0---08052021---github-only)
- [2.0.0-dev.1](#200-dev1---08052021---internal)
- [2.0.0-dev.0](#200-dev0---08022021---internal)

## [2.0.0-beta.3] - [08.17.2021] - [GitHub Only]
### Features
#### Android
- Now **ALL** methods will only `"query"` if has permission to `READ`.

### Fixes
#### Android
- Fixed no value returning when using `[requestPermission]`.

### Documentation
- Updated `README` documentation.
- Added more documentation to `Android` platform.

## [2.0.0-beta.2] - [08.15.2021]
### Features
#### IOS
- Now **ALL** methods will only `"query"` if has permission to `Library`.
- Added `[addToPlaylist]`.

#### Dart
- Added `[author]` and `[desc]` arguments to `[createPlaylist]`. **(IOS only)**

### Fixes
#### IOS
- Fixed crash when using `[queryArtwork]`.
- Fixed wrong `[id]` value returning from `[PlaylistModel]`.

### Documentation
- Updated `README` documentation.

## [2.0.0-beta.1] - [08.14.2021]
### Features
#### IOS
- Added `[queryArtwork]`.

### Fixes
#### Android
- Fixed `error` when building to `[Android]`.

#### IOS
- Fixed wrong `[duration]`, `[dateAdded]` and `[bookmark]` values returning from `[SongModel]`.

### Documentation
- Updated `on_audio_query` documentation.
- Updated `README` documentation.
- Updated `DEPRECATED` documentation.
- Added documentation to `IOS` platform.

### ⚠ Important Changes
#### @Deprecated
- `[artwork]` from `[QueryArtworkWidget]`.
- `[deviceSDK]` from `[QueryArtworkWidget]`.
- `[requestPermission]` from `[QueryArtworkWidget]`.

## [2.0.0-beta.0] - [08.13.2021]
### Features
#### on_audio_query
- Added a [`DART ANALYZER`](https://github.com/axel-op/dart-package-analyzer/) to `PULL_REQUEST` and `PUSH`.

### Documentation
- Updated `on_audio_query` documentation.
- Updated `README` documentation.
- Updated `DEPRECATED` documentation.
- Created [`PLATFORMS`](https://github.com/LucasPJS/on_audio_query/blob/2.0.0-dev/PLATFORMS.md) file.

### ⚠ Important Changes
#### Dart
- Now **ALL** methods has `Named Optional` arguments.
- Changed `[queryArtworks]` to `[queryArtwork]`.

#### @Deprecated
- `[requestPermission]` argument from **ALL** methods.
- `[queryAudios]`.
- `[artwork]` from `[SongModel]`.
- `[path]` from `[querySongs]`.

## [2.0.0-alpha.1] - [08.08.2021] - [GitHub Only]
### Features
#### Dart
- Added `[artwork]` to `[PlaylistModel]` as `[Uint8List]`
- Added `[numOfTracks]` to `[PlaylistModel]`
- Added `[playlistAuthor]` and `[playlistDesc]` parameter to `[createPlaylist]` (IOS only)
- Added `[OnModelFormatter]` extension.
    - Added `[toSongModel]`.
    - Added `[toAlbumModel]`.
    - Added `[toPlaylistModel]`.
    - Added `[toArtistModel]`.
    - Added `[toGenreModel]`.

#### IOS
- Added `[queryWithFilters]` method.
- Added `[createPlaylist]` method.
- Added `[queryPlaylists]` method.
- Added `[queryAudiosFrom]` method.

### ⚠ Important Changes
#### Dart
- Now `[dateAdded]` from `[PlaylistModel]` return a `[int]`.
- Now `[dateModified]` from `[PlaylistModel]` return a `[int]`.

#### @Deprecated
- `[queryAudiosOnly]`
- `[AudiosOnlyType]`
- `[queryAudiosBy]`
- `[AudiosByType]`

### Dev Changes
#### Dart
- ~~Added checker to all `[int]` from `[PlaylistModel]`.~~
    - Temporary

## [2.0.0-alpha.0] - [08.05.2021] - [GitHub Only]
### Release
- `[2.0.0-alpha.0]` release.

## [2.0.0-dev.1] - [08.05.2021] - [Internal]
### Features
#### IOS
- Added `[queryArtists]` and `[queryGenres]`.

### ⚠ Important Changes
#### @Deprecated
- Removed `[artwork]` from `[ArtistModel]`.
- Removed `[artwork]` from `[GenreModel]`.

### Dev Changes
#### Dart
- ~~Added a checker to all int items from `[ArtistModel]`.~~
    - Temporary
- ~~Added a checker to all int items from `[GenreModel]`.~~
    - Temporary

## [2.0.0-dev.0] - [08.02.2021] - [Internal]
### Features
#### on_audio_query
- The plugin now supports `[IOS]`. **(Not 100%)**

#### IOS
- Added `[querySongs]` and `[queryAlbums]`.

#### Dart
- Added `[model]` to `[DeviceModel]`.

### Changes
#### Dart
- Now `[sdk]` are `[version]`.
- Now `[deviceType]` are `[type]`.

### ⚠ Important Changes
#### Dart
- Now `[artwork]` from `[SongModel]` return a `[Uint8list]`.
- ~~Now all `[int]` from `[SongModel]` can be `[null]`.~~
- Now `[artwork]` from `[AlbumModel]` return a `[Uint8list]`.

#### @**Deprecated**
- `[numOfSongsArtists]` from `[AlbumModel]`.
- `[maxyear]` from `[AlbumModel]`.
- `[minyear]` from `[AlbumModel]`.
- `[release]` from `[DeviceModel]`.
- `[code]` from `[DeviceModel]`.
- `[year]` from `[SongModel]`.
- `[is_alarm]` from `[SongModel]`.
- `[is_music]` from `[SongModel]`.
- `[is_notification]` from `[SongModel]`.
- `[is_ringtone]` from `[SongModel]`.
- `[is_podcast]` from `[SongModel]`.
- `[file_parent]` from `[SongModel]`.
- `[firstYear]` from `[AlbumModel]`.
- `[lastYear]` from `[AlbumModel]`.

### Dev Changes
#### Dart
- Now `[queryDeviceInfo]` will return Map instead of List.
- ~~Added a checker to all int items from `[SongModel]`.~~
    - Temporary.
- ~~Added a checker to all int items from `[AlbumModel]`.~~
    - Temporary.

## [1.2.0] - [07.30.2021]
### Features
- Added `[path]` parameter to `[querySongs]` and `[queryAudio]`.
- Added `[getMap]` to:
    * `[SongModel]`.
    * `[AlbumModel]`.
    * `[ArtistModel]`.
    * `[GenreModel]`.
    * `[PlaylistModel]`.
    * `[DeviceModel]`.

### Documentation
- Updated `README` documentation.

## [1.1.3+1] - [07.19.2021]
### Fixes
#### Android
- Fixed `[Kotlin]` issue when installing the plugin.

### Documentation
- Updated `README` documentation.

### Changes
#### Android
- Downgraded some `[Kotlin]` dependencies.

## [1.1.3] - [07.18.2021]
### Fixes
#### Android
- Fixed `[cursor]` problem when using `[AudiosFromType.GENRE_NAME]` or `[AudiosFromType.GENRE_ID]` on `[queryAudiosFrom]`. - [Fixed #16](https://github.com/LucasPJS/on_audio_query/issues/16) and [Fixed #12](https://github.com/LucasPJS/on_audio_query/issues/12)

### Documentation
- Updated `README` documentation.

### Changes
#### Android
- Updated some `[Kotlin]` dependencies.

## [1.1.2] - [07.07.2021]
### Fixes
#### Android
- ~~Fixed `[cursor]` problem when using `[AudiosFromType.GENRE_NAME]` or `[AudiosFromType.GENRE_ID]` on `[queryAudiosFrom]`.~~

### Documentation
- Updated `README` documentation.

## [1.1.1] - [06.23.2021]
### Features
#### Dart/Android
- Added `[uri]` to `[SongModel]`. - [Added #10](https://github.com/LucasPJS/on_audio_query/issues/10)

### Fixes
#### Android
- Fixed `java.lang.Integer cannot be cast to java.lang.Long` from `[queryArtworks]`. - [Fixed #11](https://github.com/LucasPJS/on_audio_query/issues/11)

### Documentation
- Updated `README` documentation.
- Created `DEPRECATED` file/history.

### Changes
#### Dart
- Changed from `[deviceInfo]` to `[deviceSDK]` on `[QueryArtworkWidget]`.

### ⚠ Important Changes
#### Dart
- Deprecated `[deviceInfo]` from `[QueryArtworkWidget]`.

## [1.1.0] - [06.03.2021]
### Features
#### Dart/Android
- Added `[queryDeviceInfo]`.
- Added `[dateModified]` to `[SongModel]`.
- Added `[querySongsBy]` and `[SongsByType]`.

### Fixes
#### Android
- Fixed incompatibility with `[permission_handler]`. - [Fixed #3](https://github.com/LucasPJS/on_audio_query/issues/3) - Thanks [@mvanbeusekom](https://github.com/mvanbeusekom)

#### Dart
- Fixed wrong name. From `[dataAdded]` to `[dateAdded]`.

### Documentation
- Updated `README` documentation.
- Updated `[OnAudioQueryExample]` to add new `[queryDeviceInfo]` and `[QueryArtworkWidget]` methods.

### Changes
#### Android
- Updated some `[Kotlin]` dependencies.
- Changed some `[Kotlin]` methods.

### ⚠ Important Changes
#### Dart
- Now `[getDeviceSDK]`, `[getDeviceRelease]` and `[getDeviceCode]` are part of `[queryDeviceInfo]`.
- Now `[QueryArtworkWidget]` support Android above and below 29/Q/10.
- Now `[size]`, `[albumId]`, `[artistId]`, `[dataAdded]`, `[dataModified]`, `[duration]`, `[track]` and `[year]` from `[SongModel]` will return `[int]`.

## [1.0.8] - [05.19.2021]
### Features
#### Dart
- Added `[artworkClipBehavior]`, `[keepOldArtwork]`, `[repeat]` and `[scale]` to `[QueryArtworkWidget]`.
- Added comments to `[QueryArtworkWidget]`.

### Fixes
#### Android
- Now `[queryArtworks]` will return null. - [Fixed #6](https://github.com/LucasPJS/on_audio_query/issues/6)

### Documentation
- Updated `README` documentation.

### ⚠ Important Changes
#### Dart
- Now `[queryArtworks]` return `[Uint8List?]`.

## [1.0.7] - [05.18.2021]
### Features
#### Dart/Android
- Added `[queryFromFolder]`.
- Added `[queryAllPath]`.
- Added `[_display_name_wo_ext]` (`[displayName]` without extension) to `[SongModel]`. - [Added #5](https://github.com/LucasPJS/on_audio_query/issues/5)
- Added `[file_extension]` (Only file extension) to `[SongModel]`.
- Added `[file_parent]` (All the path before file) to `[SongModel]`.
- Added `[Genre]` to `[queryAudiosFrom]`.
- Added `[ALBUM_ID]`, `[ARTIST_ID]` and `[PLAYLIST_ID]` to `[AudiosFromType]`. - [Added #2](https://github.com/LucasPJS/on_audio_query/issues/2)

### Documentation
- Updated `README` documentation.

### Changes
#### Dart/Android
- Now `[queryAudiosFrom]` supports `[name]` and `[id]`.
- Now `[albumId]` from `[AlbumModel]` return a `[int]`.

#### Android
- Now all `[Kotlin]` checks will throw a `[Exception]` if value don't exist.
- Updated some `[Kotlin]` dependencies.

### ⚠ Important Changes
#### Dart/Android
- Changed `[ALBUM]`, `[ARTIST]` and `[PLAYLIST]` to `[ALBUM_NAME]`, `[ARTIST_NAME]` and `[PLAYLIST_NAME]` in `[AudiosFromType]`.

## [1.0.6] - [04.08.2021]
### Fixes
#### Android
- Fixed `[queryArtwork]` returning null album image in Android 11. - [Fixed #1](https://github.com/LucasPJS/on_audio_query/issues/1)

### Documentation
- Updated `README` documentation.

### Changes
#### Android
- Removed unnecessary code from `[WithFiltersType]`.
- Updated some `[Kotlin]` dependencies.

## [1.0.5] - [03.31.2021]
### Features
#### Dart/Android
- Added `[queryAudiosOnly]`.
- Added `[queryWithFilters]`.
- Added `[AudiosOnlyType]` and `[WithFiltersType]`.
- Added `[SongsArgs]`, `[AlbumsArgs]`, `[PlaylistsArgs]`, `[ArtistsArgs]`, `[GenresArgs]`.
- Added `[EXTERNAL]` and `[INTERNAL]` parameters for some query methods.

### Documentation
- Updated `README` documentation.

### Changes
#### Dart/Android
- Now `[querySongs]`, `[queryAlbums]`, `[queryArtists]`, `[queryPlaylists]` and `[queryGenres]` have `[UriType]` as parameter.

#### Android
- Updated some `[Kotlin]` dependencies.

## [1.0.3] - [03.28.2021]
### ⚠ Important Changes
#### Dart
- Migrate to null safety.

## [1.0.2] - [03.27.2021]
### Fixes
#### Dart
- Fixed flutter example.

#### Android
- Fixed `[audiosFromPlaylist]` [**Now this method is part of queryAudiosFrom**]
- Fixed `"count(*)"` error from `[addToPlaylist]`. [**Permission bug on Android 10 still happening**]

### Documentation
- Updated `README` documentation.

### Changes
#### Dart
- Now `[Id]` in models return `[int]` instead `[String]`.

### ⚠ Important Changes
#### Dart/Android
- Removed `[ALBUM_KEY]`, `[ARTIST_KEY]` from all query audio methods.

#### Android
- Moved `[audiosFromPlaylist]` to `[queryAudiosFrom]`.

## [1.0.0] - [03.24.2021]
### Release

- `[on_audio_query]` release.

## [0.5.0] - [03.23.2021]
### Features
#### Dart/Android
- Changed some methods structure.
- Added `[moveItemTo]` method to Playlist.
- Added `[Size]` and `[Format]` parameters to `[queryArtwork]`.
- Added `[getDeviceSDK]`, `[getDeviceRelease]` and `[getDeviceCode]`.
- Added `[retryRequest]` parameter to `[permissionsRequest]`.

#### Dart
- Added `[QueryArtworkWidget]`.

### Fixes
- Added parameter `[AudioId]` to `[addToPlaylist]` and `[removeFromPlaylist]`.

### Documentation
- Updated `README` documentation.
- Added more comments to `[Kotlin]` and `[Dart]` code.

### Changes
- Now Playlist methods parameters request `[id]` instead Name.
- Now `[renamePlaylist]` add more information -> `[Date_Modified]`.
- Now when `[requestPermission]` parameter is set to true or `[permissionsRequest]` method is called, both `[READ]` and `[WRITE]` is requested.

## [0.4.0] - [03.18.2021]
### Features
#### Dart/Android
- Changed some methods structure.
- Added `[renamePlaylist]`.
- Added separate option for sortType order `[ASC_OR_SMALLER]` and `[DESC_OR_GREATER]`.
- Added `[permissionsStatus]` and `[permissionsRequest]`.

### Documentation
- Updated `README` documentation.
- Added some comments to `[Kotlin]` and `[Dart]` code.

### Changes
- Now `[createPlaylist]`, `[removePlaylist]`, `[addToPlaylist]` and `[removeFromPlaylist]` return bool.

## [0.3.0] - [03.16.2021]
### Features
#### Dart/Android
- Added `[createPlaylist]`, `[removePlaylist]`, `[addToPlaylist]` and `[removeFromPlaylist]`.

#### Dart
- Updated the `[Example]` application.

### Documentation
- Updated `README` documentation.

## [0.2.5] - [03.11.2021]
### Features
#### Dart/Android
- Added `[queryArtworks]` and `[queryAudiosFrom]`.

### Fixes
- Added a better performance for query images.

### Documentation
- Updated `README` documentation.

## [0.2.0] - [03.10.2021]
### Features
#### Dart/Android
- Added `[queryArtists]`, `[queryPlaylists]` and `[queryGenres]`.
- Added `[ArtistSortType]`, `[PlaylistsSortType]` and `[GenreSortType]`.

#### Android
- Now all methods use `Kotlin Coroutines` for query in background, adding a better performance.

### Documentation
- Updated `README` documentation.
- Updated `pubspec.yaml`.
- Created `README` translation section.
- Created `README` translation for `pt-BR` [Portuguese].

## [0.1.5] - [03.08.2021]
### Features
#### Dart/Android
- Added `[querySongs]`, `[queryAudio]` and `[queryAlbums]`.
- Added `[AudioSortType]` and `[AlbumSortType]`.

#### Android
- Added `[Optional]` and `[Built-in]` Write and Read Storage Permission.

### Documentation
- Created a `README` documentation.

## [0.0.1] - [02.16.2021]
### Features
#### Dart/Android
- Created the base for the plugin.

<!-- 
## [Version] - [Date]
### Features
- TODO

### Fixes
- TODO

### Documentation
- TODO

### Changes
- TODO

### ⚠ Important Changes
#### @**Deprecated**
- TODO
 -->

<!-- 
 - [Added #Issue](Link)
 - [Fixed #Issue](Link)
 - [Changed #Issue](Link)
-->
