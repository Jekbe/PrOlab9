package zad5;

import java.util.Iterator;
import java.util.List;

public record Song(String title, String artist, double duration) {

    @Override
    public String toString() {
        return "Song{" + "title='" + title + '\'' + ", artist='" + artist + '\'' + ", duration=" + duration + '}';
    }
}

class SongIterator implements Iterator<Song> {
    private final List<Song> songs;
    private int position = 0;

    public SongIterator(List<Song> songs) {
        this.songs = songs;
    }

    @Override
    public boolean hasNext() {
        return position < songs.size();
    }

    @Override
    public Song next() {
        if (!hasNext()) throw new IllegalStateException("No more songs available");
        return songs.get(position++);
    }
}
