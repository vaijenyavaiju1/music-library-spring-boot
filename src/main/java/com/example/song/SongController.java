package com.example.song;

import org.springframework.web.bind.annotation.*;
import java.util.*;

import com.example.song.SongService;

// Write your code here

@RestController
public class SongController {
    SongService songService = new SongService();

    @GetMapping("/songs")
    public ArrayList<Song> getSongs() {
        return songService.getSongs();
    }

    @GetMapping("/songs/{songId}")
    public Song getSongId(@PathVariable("songId") int songId) {
        return songService.getSongId(songId);
    }

    @PostMapping("/songs")
    public Song addSong(@RequestBody Song song) {
        return songService.addSong(song);
    }

    @PutMapping("/songs/{songId}")
    public Song updatedSong(@PathVariable("songId") int songId, @RequestBody Song song) {
        return songService.updatedSong(songId, song);
    }

    @DeleteMapping("/songs/{songId}")
    public void deleteSong(@PathVariable("songId") int songId) {
        songService.deleteSong(songId);
    }
}