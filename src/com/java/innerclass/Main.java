package com.java.innerclass;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        ArrayList<Album> albums = new ArrayList<>();

        Album album = new Album("Stormbringer", "Deep Purple");
        album.addSong("Stormbringer", 4.6);
        album.addSong("Love don't mean a thing", 4.22);
        album.addSong("Holy man", 4.3);
        album.addSong("Hold on", 5.6);
        album.addSong("Lady double dealer", 3.21);
        album.addSong("You can't do it right", 6.23);
        album.addSong("High ball shooter", 4.27);
        album.addSong("The gypsy", 4.2);
        album.addSong("Soldier of fortune", 3.13);
        albums.add(album);

        album = new Album("For those about to rock", "AC/DC");
        album.addSong("For those about to rock", 5.44);
        album.addSong("I put the finger on you", 3.25);
        album.addSong("Lets go", 3.45);
        album.addSong("Inject the venom", 3.33);
        album.addSong("Snowballed", 4.51);
        album.addSong("Evil walks", 3.45);
        album.addSong("C.O.D.", 5.25);
        album.addSong("Breaking the rules", 5.32);
        album.addSong("Night of the long knives", 5.12);
        albums.add(album);

        LinkedList<Song> playList = new LinkedList<Song>();
        albums.get(0).addToPlayList("You can't do it right", playList);
        albums.get(0).addToPlayList("Holy man", playList);
        albums.get(0).addToPlayList("Speed king", playList);  // Does not exist
        albums.get(0).addToPlayList(9, playList);
        albums.get(1).addToPlayList(3, playList);
        albums.get(1).addToPlayList(2, playList);
        albums.get(1).addToPlayList(24, playList);

        Scanner scan = new Scanner(System.in);

        playTheSong(scan, playList);

    }

    private static void playTheSong(Scanner scan, LinkedList<Song> playlist) {

        ListIterator<Song> songListIterator = playlist.listIterator();
        boolean forward = true;

        if (playlist.size() == 0)
            System.out.println("No songs in the playlist.");
        else {
            System.out.println("==================================================================");
            System.out.println("Now playing ---> " + songListIterator.next().toString());
            System.out.println("==================================================================");

            printOptions();
            out: while (true) {
                System.out.print("Enter your choice: ");
                int choice = scan.nextInt();
                System.out.println("==================================================================");

                switch (choice) {
                    case 1 -> {
                        if(!forward) {
                            if(songListIterator.hasNext()) {
                                songListIterator.next();
                            }
                            forward = true;
                        }
                        if(songListIterator.hasNext()) {
                            System.out.println("==================================================================");
                            System.out.println("Now playing ---> " + songListIterator.next().toString());
                            System.out.println("==================================================================");
                        }
                        else {
                            System.out.println("==================================================================");
                            System.out.println("Reached end of the playlist");
                            System.out.println("==================================================================");
                            forward = false;
                        }
                    }
                    case 2 -> {
                        if(forward) {
                            if(songListIterator.hasPrevious()) {
                                songListIterator.previous();
                            }
                            forward = false;
                        }
                        if(songListIterator.hasPrevious()) {
                            System.out.println("==================================================================");
                            System.out.println("Now playing ---> " + songListIterator.previous().toString());
                            System.out.println("==================================================================");
                        }
                        else {
                            System.out.println("==================================================================");
                            System.out.println("Reached starting of the playlist");
                            System.out.println("==================================================================");
                            forward = true;
                        }
                    }
                    case 3 -> {
                        if(forward && songListIterator.hasPrevious()) {
                            System.out.println("==================================================================");
                            System.out.println("Now playing ---> " + songListIterator.previous().toString());
                            System.out.println("==================================================================");
                        }
                        else if(!forward && songListIterator.hasNext()) {
                            System.out.println("==================================================================");
                            System.out.println("Now playing ---> " + songListIterator.next().toString());
                            System.out.println("==================================================================");
                        }
                        else {
                            System.out.println("Cannot repeat start/end of playlist");
                        }
                    }
                    case 4 -> {
                        System.out.println("Hope you enjoyed!!! Bye, Take care");
                        break out;
                    }
                    default -> System.out.println("Enter a valid choice :(");
                }
            }
        }

    }

    private static void printOptions() {
        System.out.println("==================================================================");
        System.out.println("1. Skip to the next song.");
        System.out.println("2. Skip to previous song.");
        System.out.println("3. Replay the current song.");
        System.out.println("4. Remove current song.");
        System.out.println("4. Exit from playing song.");
    }


}
