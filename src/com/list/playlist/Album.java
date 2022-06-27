package com.list.playlist;

import java.util.ArrayList;

public class Album {

    private String albumName;
    private static ArrayList<Song> album;

    public Album(String albumName) {
        this.albumName = albumName;
        album = new ArrayList<>();
    }

    public boolean addAlbum(String title, String duration) {
        Song checkAlbum = new Song(title, duration);
        if(findSong(checkAlbum) >= 0)
            return false;
        else {
            album.add(checkAlbum);
            return true;
        }
    }

    public boolean removeAlbum(String title, String duration) {
        Song checkAlbum = new Song(title, duration);
        int removeIndex = findSong((checkAlbum));
        if(removeIndex >= 0) {
            album.remove(removeIndex);
            return true;
        }
        else
            return false;
    }

    public static int findSong(Song checkSong) {
        ArrayList<Song> checkAlbums = getAlbum();
        for (int i=0; i<checkAlbums.size(); i++) {
            Song check = checkAlbums.get(i);
            if (check.getTitle().equals(checkSong.getTitle()) &&
                    check.getDuration().equals(checkSong.getDuration()))
                return i;
        }
        return -1;
    }

    public static ArrayList<Song> getAlbum() {
        return album;
    }

}
