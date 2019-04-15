package com.company;

public class song implements Comparable<song> {
    private int kachestvo;
    private int time;
    private String name;
    private String author;
    //private int numberOflooking;

    public int getKachestvo() {
        return kachestvo;
    }

    public  void setKachestvo(int kachestvo) {
        this.kachestvo = kachestvo;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }


    @Override
    public String toString() {
        return "song{" +
                "kachestvo:" + kachestvo +
                ", time:" + time +
                ", name:'" + name + '\'' +
                ", author:" + author;
    }

    public song(int kachestvo, int time, String name, String author) {
        this.kachestvo = kachestvo;
        this.author = author;
        this.time = time;
        this.name = name;
    }


    @Override
    public int compareTo(song o) {
        return this.time - o.time;
    }


    }


