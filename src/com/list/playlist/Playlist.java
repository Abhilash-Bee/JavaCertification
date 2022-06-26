package com.list.playlist;

import java.util.LinkedList;
import java.util.ListIterator;

public class Playlist {

    private static LinkedList<Song> playlists;

    private boolean isForward = true;

    public Playlist() {
        playlists = new LinkedList<>();
    }

    public LinkedList<Song> getPlaylists() {
        return playlists;
    }

    public boolean addSongToPlaylist(String title, String duration) {
        Song song = new Song(title, duration);
        if (!Album.findSong(song))
            return false;
        else {
            if(!findSong(song)) {
                playlists.add(new Song(title, duration));
                return true;
            }
            else
                return false;
        }
    }

    public boolean removeSongFromPlaylist(String title, String duration) {
        Song song = new Song(title, duration);
        if (!findSong(song))
            return false;
        else {
            playlists.remove(song);
            return true;
        }
    }

    public void replayTheSong(ListIterator<Song> songListIterator) {
        System.out.println("Need to do code.");
    }

    public void skipToNextSong(ListIterator<Song> songListIterator) {

        if (songListIterator.hasNext()) {
            Song song = songListIterator.next();
            System.out.println("Now playing song with title: " + song.getTitle() +
                    " and the duration is " + song.getDuration());
        } else {
            System.out.println("This was the last song in the playlist");
            isForward = false;
        }
    }

    public void skipToPreviousSong(ListIterator<Song> songListIterator) {
        if (!isForward) {
            if (songListIterator.hasPrevious()) {
                Song song = songListIterator.previous();
                System.out.println("Now playing song with title: " + song.getTitle() +
                        " and the duration is " + song.getDuration());
            } else {
                System.out.println("This was the first song in the playlist");
                isForward = true;
            }
        }
    }

    private boolean findSong(Song song) {
        LinkedList<Song> checkAlbums = getPlaylists();
        for (Song checkEachSong : checkAlbums) {
            if (checkEachSong.getTitle().equals(song.getTitle()) &&
                    checkEachSong.getDuration().equals(song.getDuration()))
                return true;
        }
        return false;
    }

}
