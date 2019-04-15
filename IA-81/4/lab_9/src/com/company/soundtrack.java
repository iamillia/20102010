package com.company;

import java.util.Comparator;

public class soundtrack extends song {
    boolean video;
    Integer numberoflooking;
    public soundtrack(int kachestvo, int time, String name, String author, boolean video, Integer numberOflooking) {
        super(kachestvo, time, name, author);
        this.video = video;
        this.numberoflooking = numberOflooking;
    }
static class SoundC implements Comparator<soundtrack> {

    @Override
    public int compare(soundtrack track1, soundtrack track2) {
        return Integer.compare(track1.getTime(), track2.getTime());
    }
}
    @Override
    public String toString() {
        return "soundtrack kachestvo: " + getKachestvo() + " " +
                 "time: " + getTime() + " " + getName() + " "
                + getAuthor()  + " " + "video: " + video + " number of listening: " + numberoflooking ;
    }
}

