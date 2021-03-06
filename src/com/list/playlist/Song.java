package com.list.playlist;

public class Song {

    private String title;
    private String duration;

    @Override
    public String toString() {
        return title + " : " + duration;
    }

    public Song(String title, String duration) {
        this.title = title;
        this.duration = duration;
    }

    public String getTitle() {
        return title;
    }

    public String getDuration() {
        return duration;
    }

}
