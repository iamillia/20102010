package com.company;

import java.util.Comparator;

public class soundtrack extends song {
    //soundtrack.SoundC SoundC = new soundtrack.SoundC();
    boolean video;
    public soundtrack(int kachestvo, int time, String name, String author, boolean video, int numberOflooking) {
        super(kachestvo, time, name, author, numberOflooking);
        this.video = video;
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
                + getAuthor()  + " " + "video: " + video + "number of listening: " + getNumberOflooking();
    }
}

