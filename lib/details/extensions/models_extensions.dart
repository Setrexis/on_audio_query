part of on_audio_query;

/// Used to convert a [List<dynamic>] into a Model.
///
/// ModelTypes:
///
///   * [SongModel].
///   * [AlbumModel].
///   * [PlaylistModel].
///   * [ArtistModel].
///   * [GenreModel].
///
/// Usage:
///
/// * This method can be used any time, but it's more required when using
/// [queryWithFilters]. This method will return a [List<dynamic>] and to make
/// life easy you can use this method to convert into any model.
extension OnModelFormatter on List<dynamic> {
  /// Used to convert a [List dynamic] into a [List SongModel].
  List<SongModel> toSongModel() => this.map((e) => SongModel(e)).toList();

  /// Used to convert a [List dynamic] into a [List AlbumModel].
  List<AlbumModel> toAlbumModel() => this.map((e) => AlbumModel(e)).toList();

  /// Used to convert a [List dynamic] into a [List PlaylistModel].
  List<PlaylistModel> toPlaylistModel() =>
      this.map((e) => PlaylistModel(e)).toList();

  /// Used to convert a [List dynamic] into a [List ArtistModel].
  List<ArtistModel> toArtistModel() => this.map((e) => ArtistModel(e)).toList();

  /// Used to convert a [List dynamic] into a [List GenreModel].
  List<GenreModel> toGenreModel() => this.map((e) => GenreModel(e)).toList();
}
