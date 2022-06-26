package com.list.playlist;

import java.util.ArrayList;

public class Album {

    private static ArrayList<Song> album;

    public Album() {
        album = new ArrayList<>();
    }

    public boolean addAlbum(String title, String duration) {
        Song checkAlbum = new Song(title, duration);
        if(findSong(checkAlbum))
            return false;
        else {
            album.add(checkAlbum);
            return true;
        }
    }

    public boolean removeAlbum(String title, String duration) {
        Song checkAlbum = new Song(title, duration);
        if(findSong(checkAlbum)) {
            album.remove(checkAlbum);
            return true;
        }
        else
            return false;
    }

    public static boolean findSong(Song checkSong) {
        ArrayList<Song> checkAlbums = getAlbum();
        for (Song checkEachSong : checkAlbums) {
            if (checkEachSong.getTitle().equals(checkSong.getTitle()) &&
                    checkEachSong.getDuration().equals(checkSong.getDuration()))
                return true;
        }
        return false;
    }

    public static ArrayList<Song> getAlbum() {
        return album;
    }

}
