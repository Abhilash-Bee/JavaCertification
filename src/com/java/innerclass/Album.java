package com.java.innerclass;

import java.util.ArrayList;
import java.util.LinkedList;

public class Album {

    private String name;
    private String artist;
    private SongList songs;


    public Album(String name, String artist) {
        this.name = name;
        this.artist = artist;
        this.songs = new SongList();
    }

    public boolean addSong(String title, double duration) {
        return songs.add(new Song(title, duration));
    }

    public boolean addToPlayList(int trackNumber, LinkedList<Song> playlist) {
        Song song = songs.findSong(trackNumber);
        if(song != null) {
            playlist.add(song);
            return true;
        }
        return false;
    }

    public boolean addToPlayList(String title, LinkedList<Song> playlist) {
        Song song = songs.findSong(title);
        if(song != null) {
            playlist.add(song);
            return true;
        }
        return false;
    }

    public static class SongList {
        private ArrayList<Song> songs;

        private SongList() {
            this.songs = new ArrayList<>();
        }

        private boolean add(Song song) {
            if(!songs.contains(song)) {
                songs.add(song);
                return true;
            }
            return false;
        }

        private Song findSong(int trackNumber) {
            if(trackNumber > 0 && trackNumber <= songs.size()) {
                return songs.get(trackNumber-1);
            }
            return null;
        }

        private Song findSong(String title) {
            for (Song song : songs) {
                if (song.getTitle().equals(title))
                    return song;
            }
            return null;
        }

    }

}
