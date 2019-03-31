package com.company;

import java.util.*;

public class Film {
    private String name;
    private List<String> listActor;

    public List<String> getListActor() {
        return listActor;
    }

    public Film(String name, List<String> listActor) {
        this.name = name;
        this.listActor = listActor;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Film{" +
                "name='" + name + '\'' +
                ", listActor=" + listActor +
                '}';
    }
}
