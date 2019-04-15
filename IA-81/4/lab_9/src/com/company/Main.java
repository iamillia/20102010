package com.company;
import java.util.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.TreeSet;
import static java.util.Comparator.*;
public class Main {

    public static void main(String[] args) {
        System.out.println("first ex");
        List<soundtrack> stracks = getSoundtrack();
        stracks.forEach(System.out::println);
        System.out.println();
        stracks.sort((sound1, sound2) -> Integer.valueOf(sound1.getTime()).compareTo(Integer.valueOf(sound2.getTime())));
        stracks.forEach(System.out::println);
        System.out.println("second ex");

        List<videoclip> vclips = getVideoclip();
        vclips.forEach(System.out::println);
        System.out.println();
        Comparator<videoclip> comparator = comparing(song::getTime);
        vclips.sort(comparator.reversed());
        vclips.forEach(System.out::println);
        System.out.println("third ex");

        TreeSet<videoclip> vclips2 = new TreeSet<>(comparing(videoclip::getKachestvo).thenComparing(videoclip::getTime));
        vclips2.add(getVideoclip().get(0));
        vclips2.add(getVideoclip().get(1));
        vclips2.add(getVideoclip().get(2));
        vclips2.add(getVideoclip().get(3));
        vclips2.add(getVideoclip().get(4));
        vclips2.forEach(System.out::println);
        System.out.println("firth ex");


        List<videoclip> vclips3 = getVideoclip();
        vclips3.sort(comparing(videoclip::getAlbum,nullsLast(String::compareTo)));
        vclips3.forEach(System.out::println);

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
    videoclip pobeda2 = new videoclip(194, 8, "Victory Day", "Haritonow", true, 205, "prima");
    videoclip pobeda3 = new videoclip(19, 3, "Victory Day", "Haritonow", true, 201, "geroyam");
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


}