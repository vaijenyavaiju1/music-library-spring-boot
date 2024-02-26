// Write your code here
package com.example.song;

import java.util.*;

public interface SongRepository {
    ArrayList<Song> getSongs();

    Song getSongId(int songId);

    Song addSong(Song song);

    Song updatedSong(int songId, Song song);

    void deleteSong(int songId);
}
