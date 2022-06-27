package com.list.playlist;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {

    private static Scanner scan = new Scanner(System.in);
    private static Album album = new Album("Devotion");
    private static Playlist playlist = new Playlist();

    public static void main(String[] args) {

        printOptions();
        while (true) {
            System.out.print("Enter your choice in the album: ");
            int choice = scan.nextInt();

            switch (choice) {
                case 0 -> printOptions();
                case 1 -> addSongToAlbum();
                case 2 -> removeSongFromAlbum();
                case 3 -> addSongToPlaylist();
                case 4 -> removeSongFromPlaylist();
                case 5 -> listAlbum();
                case 6 -> listPlaylist();
                case 7 -> playlist.playMusic(playlist.getPlaylists());
                case 8 -> {
                    System.out.println("Thank you. Hope you enjoyed!!!");
                    System.exit(0);
                }
                default -> System.out.println("Enter a valid choice :( :(");
            }
        }

    }

    private static void printOptions() {
        System.out.println("0. Print option in the album");
        System.out.println("1. Add album song.");
        System.out.println("2. Remove album song.");
        System.out.println("3. Add an existing song to the playlist.");
        System.out.println("4. Remove a song from the playlist.");
        System.out.println("5. List the songs in the album.");
        System.out.println("6. List the songs in the playlist.");
        System.out.println("7. Play music");
        System.out.println("8. Exit");
    }

    public static void addSongToAlbum() {
        System.out.println("Enter title & duration of the song to add: ");
        scan.nextLine();
        String title = scan.nextLine();
        String duration = scan.nextLine();
        if(album.addAlbum(title, duration))
            System.out.println("Song with title: " + title + " & with duration: " + duration +
                    " has added to album");
        else
            System.out.println("Song with title: " + title + " & with duration: " + duration +
                    " has already exist in the album");
    }

    public static void removeSongFromAlbum() {
        System.out.println("Enter title & duration of the song to add: ");
        scan.nextLine();
        String title = scan.nextLine();
        String duration = scan.nextLine();
        if(album.removeAlbum(title, duration))
            System.out.println("Song with title: " + title + " & with duration: " + duration +
                    " has been removed from the album");
        else
            System.out.println("Song with title: " + title + " & with duration: " + duration +
                    " cannot be removed from the album since, it is not exist in the album");
    }

    public static void addSongToPlaylist() {
        System.out.println("Enter title & duration of the song to add: ");
        scan.nextLine();
        String title = scan.nextLine();
        String duration = scan.nextLine();
        if(playlist.addSongToPlaylist(title, duration))
            System.out.println("Song with title: " + title + " & with duration: " + duration +
                    " has been added to playlist");
        else
            System.out.println("Song with title: " + title + " & with duration: " + duration +
                    " cannot be added to the playlist");
    }

    public static void removeSongFromPlaylist() {
        System.out.println("Enter title & duration of the song to add: ");
        scan.nextLine();
        String title = scan.nextLine();
        String duration = scan.nextLine();
        if(playlist.removeSongFromPlaylist(title, duration))
            System.out.println("Song with title: " + title + " & with duration: " + duration +
                    " has been removed from playlist");
        else
            System.out.println("Song with title: " + title + " & with duration: " + duration +
                    " cannot be removed from playlist since, it does not exist in the playlist");
    }

    public static void listAlbum() {
        ArrayList<Song> albumList = Album.getAlbum();
        for (Song inAlbum : albumList) {
            System.out.println("Title: " + inAlbum.getTitle() + " -> Duration: " + inAlbum.getDuration());
        }
    }

    public static void listPlaylist() {
        LinkedList<Song> PlaylistList = playlist.getPlaylists();
        for (Song inPlaylist : PlaylistList) {
            System.out.println("Title: " + inPlaylist.getTitle() + " -> Duration: " + inPlaylist.getDuration());
        }
    }

}
