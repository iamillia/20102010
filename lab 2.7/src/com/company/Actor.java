package com.company;
import java.util.List;

public class Actor {

    private String name;
    private List<String> listFilm;

    public Actor(String name, List<String> listFilm) {
        this.name = name;
        this.listFilm=listFilm;
    }

    public List<String> getListFilm() {
        return listFilm;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Actor{" +
                "name='" + name + '\'' +
                ", listFilm=" + listFilm +
                '}';
    }
}