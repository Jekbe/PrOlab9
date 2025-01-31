package zad5;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

interface Playlist {
    Iterator<Song> createIterator();
}

class MusicPlaylist implements Playlist {
    private final List<Song> songs;

    public MusicPlaylist() {
        this.songs = new ArrayList<>();
    }

    public void addSong(Song song) {
        songs.add(song);
    }

    @Override
    public Iterator<Song> createIterator() {
        return new SongIterator(songs);
    }
}
