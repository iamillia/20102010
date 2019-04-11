package com.company;

import java.util.Arrays;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {
        soundtrack gimn = new soundtrack(1939, 3, "Gimn of Ukraine", "Pavlo Chubinskiy", false, 440000000);
        System.out.println(gimn);
        videoclip pobeda1 = new videoclip(1, 4, "Victory Day", "Haritonow", true, 200);
        videoclip pobeda2 = new videoclip(19, 3, "Victory Day", "Haritonow", true, 200);
        videoclip pobeda3 = new videoclip(194, 2, "Victory Day", "Haritonow", true, 200);
        videoclip pobeda4 = new videoclip(1944, 1, "Victory Day", "Haritonow", true, 200);
        videoclip[] clips = {pobeda1, pobeda2, pobeda3, pobeda4};
        for (videoclip p: clips){
            System.out.println(p);
        }
        Arrays.sort(clips,pobeda1.new VideoC());
        for (videoclip p: clips){
            System.out.println(p);
        }
        soundtrack track1 = new soundtrack(1000, 1, "besttrack", "tracker", false, 100000000);
        soundtrack track2 = new soundtrack(100, 2, "besttrack", "tracker", false, 100000000);
        soundtrack track3 = new soundtrack(10, 3, "besttrack", "tracker", false, 100000000);
        soundtrack track4 = new soundtrack(1, 4, "besttrack", "tracker", false, 100000000);
         soundtrack[] tracks = {track1, track2, track3, track4};
        Arrays.sort(tracks, new soundtrack.SoundC());
        for (soundtrack s: tracks){
            System.out.println(s);
        }


        song song1 = new song(1, 4, "scho1", "Ya1", 123 );
        song song2 = new song(12, 3, "scho2", "Ya2", 1234 );
        song song3 = new song(123, 2, "scho3", "Ya3", 12345 );
        song song4 = new song(1234, 1, "scho4", "Ya4", 123456 );

        TreeSet<song> songs = new TreeSet<song>();
        songs.add(song1);
        songs.add(song2);
        songs.add(song3);
        songs.add(song4);
        for (song song: songs){
            System.out.println(song);
        }
}
}
