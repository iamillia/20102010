package com.company;

import java.util.Comparator;

public class videoclip extends song {
    //videoclip.VideoC VideoC = new videoclip.VideoC();
    boolean video;

    public videoclip(int kachestvo, int time, String name, String author, boolean video, int numberOflooking) {
        super(kachestvo, time, name, author, numberOflooking);
        this.video = video;
    }
public class VideoC implements Comparator<videoclip> {

    @Override
    public int compare(videoclip pobeda1, videoclip pobeda2) {
        return Integer.compare(pobeda1.getTime(), pobeda2.getTime());
    }
}
    @Override
    public String toString() {
        return "videoclip kachestvo: " + getKachestvo() + " "
                + getAuthor() + " " + getName() + " "
                + " time: " + getTime() + " " +
                "videoc: " + video + "numb of looking: " + getNumberOflooking();

    }
}

