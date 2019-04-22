package com.company;

import java.util.Comparator;

public class videoclip extends song {
    //videoclip.VideoC VideoC = new videoclip.VideoC();
    boolean video;
    Integer numberOflooking;
    String album;
    public int getNumberOflooking() {
        return numberOflooking;
    }

    public boolean isVideo() {
        return video;
    }

    public String getAlbum() {
        return album;
    }

    public videoclip(int kachestvo, int time, String name, String author, boolean video, Integer numberOflooking, String album) {
        super(kachestvo, time, name, author);
        this.video = video;
        this.numberOflooking = numberOflooking;
        this.album = album;

    }

    public videoclip(int kachestvo, int time, String name, String author, boolean video, Integer numberOflooking) {
        super(kachestvo, time, name, author);
        this.video = video;
        this.numberOflooking = numberOflooking;
    }

    @Override
    public String toString() {
        return "videoclip kachestvo: " + getKachestvo() + " "
                + getAuthor() + " " + getName() + " "
                + " time: " + getTime() + " " +
                "videoc: " + video + " numb of looking: " + numberOflooking + " album: " + album;

    }
}

