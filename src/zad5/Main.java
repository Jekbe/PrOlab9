package zad5;

import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        MusicPlaylist playlist = new MusicPlaylist();
        playlist.addSong(new Song("Song 1", "Artist A", 3.5));
        playlist.addSong(new Song("Song 2", "Artist B", 4.2));
        playlist.addSong(new Song("Song 3", "Artist C", 2.8));

        Iterator<Song> iterator = playlist.createIterator();
        while (iterator.hasNext()) System.out.println(iterator.next());
    }
}
