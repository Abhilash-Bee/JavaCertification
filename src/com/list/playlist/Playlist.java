package com.list.playlist;

import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

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
        if (Album.findSong(song) == -1) {
            System.out.println("Song doesn't exists in album");
            return false;
        }
        else {
            if (findSong(song) >= 0) {
                System.out.println("Song repeated in the playlist");
                return false;
            } else {
                playlists.add(song);
                return true;
            }
        }
    }

    public boolean removeSongFromPlaylist(String title, String duration) {
        int remove = findSong(new Song(title, duration));
        if (remove == -1)
            return false;
        else {
            playlists.remove(remove);
            return true;
        }
    }

    public void playMusic(LinkedList<Song> playlists) {
        ListIterator<Song> listIterator = playlists.listIterator();
        if(playlists.size() == 0)
            System.out.println("No songs in the playlist");
        else
            System.out.println("Now playing " + listIterator.next().toString());

        printOptions();
        Scanner scan = new Scanner(System.in);
        out: while(true) {
            System.out.print("Enter your choice: ");
            int choice = scan.nextInt();
            switch (choice) {
                case 0 -> printOptions();
                case 1 -> {
                    if (isForward && listIterator.hasPrevious()) {
                        System.out.println("Now playing " + listIterator.previous().toString());
                        isForward = false;
                    } else if (!isForward && listIterator.hasNext()) {
                        System.out.println("Now playing " + listIterator.next().toString());
                        isForward = true;
                    }
                }
                case 2 -> {
                    if(!isForward) {
                        if(listIterator.hasNext())
                            listIterator.next();
                        isForward = true;
                    }
                    if(listIterator.hasNext())
                        System.out.println("Now playing " + listIterator.next().toString());
                    else {
                        System.out.println("Reached end of the playlist");
                        isForward = false;
                    }
                }
                case 3 -> {
                    if (isForward) {
                        if (listIterator.hasPrevious())
                            listIterator.previous();
                        isForward = false;
                    }
                    if (listIterator.hasPrevious())
                        System.out.println("Now playing " + listIterator.previous().toString());
                    else {
                        System.out.println("Reached starting of the playlist");
                        isForward = true;
                    }
                }
                case 4 -> { break out; }
                default -> System.out.println("Enter a valid option: ");
            }
        }
    }

    private void printOptions() {
        System.out.println("0. Print playlist options");
        System.out.println("1. Replay the current playlist");
        System.out.println("2. Skip to next song");
        System.out.println("3. Skip to previous song");
        System.out.println("4. Stop playing music");
    }


    private int findSong(Song song) {
        LinkedList<Song> checkAlbums = getPlaylists();
        for (int i=0; i<checkAlbums.size(); i++) {
            Song check = checkAlbums.get(i);
            if (check.getTitle().equals(song.getTitle()) &&
                    check.getDuration().equals(song.getDuration()))
                return i;
        }
        return -1;
    }

}
