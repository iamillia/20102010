package com.company;
import java.util.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.TreeSet;

import static java.util.Comparator.*;
public class Main {


    public static void main(String[] args) {
    song song1 = new song(1, 1, "besttrack1", "tracker1");
    song song2 = new song(10, 2, "besttrack2", "tracker2");
    song song3 = new song(100, 3, "besttrack3", "tracker3");
    song song4 = new song(1000, 4, "besttrack4", "4");

        List<videoclip> vclips3 = getVideoclip();
        vclips3.stream()
               // .map(Main::apply)
                .filter(videoclip::isEven)
                .filter(videoclip::isBiggerThanThree)
                .forEach(System.out::println);
        vclips3
                .stream()
                .map(check::new)
                .forEach(System.out::println);

    }

    private static List<soundtrack> getSoundtrack() {
        List<soundtrack> tracks = new ArrayList<>();
        soundtrack track1 = new soundtrack(1000, 5, "besttrack", "tracker", false, 100000000);
        soundtrack track2 = new soundtrack(100, 8, "besttrack", "tracker", false, 100000000);
        soundtrack track3 = new soundtrack(10, 3, "besttrack", "tracker", false, 100000000);
        soundtrack track4 = new soundtrack(1, 1, "besttrack", "tracker", false, 100000000);
        tracks.add(track1);
        tracks.add(track2);
        tracks.add(track3);
        tracks.add(track4);
        return tracks;
    }

    private static List<videoclip> getVideoclip(){
        videoclip pobeda1 = new videoclip(19, 5, "Victory Day", "Haritonow", true, 200, "victoria");
        videoclip pobeda2 = new videoclip(194, 8, "Victory Day", "Haritonow", true, 206, "prima");
        videoclip pobeda3 = new videoclip(19, 3, "Victory Day", "Haritonow", true, 204, "geroyam");
        videoclip pobeda4 = new videoclip(1944, 1, "Victory Day", "Haritonow", true, 202, "slava");
        videoclip pobeda5 = new videoclip(1948, 1, "Victory Day", "Haritonow", true, 203, null);
        List<videoclip> clips = new ArrayList<>();
        clips.add(pobeda1);
        clips.add(pobeda2);
        clips.add(pobeda3);
        clips.add(pobeda4);
        clips.add(pobeda5);
        return clips;

    }


    private static videoclip apply(videoclip track5) {
        return new videoclip(9, 5, "Victory Day", "Haritonow", true, 200, "victoria");
    }

    private static videoclip apply2(videoclip s) {
        return new videoclip(13, 7, "Victory Days", "Haritonow", true, 250, "victoria");
    }

}