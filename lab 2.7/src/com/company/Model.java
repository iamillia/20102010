package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Model {

    public int max(Basa basa) {
        int max = 0;
        for (Film s : basa.getFilms()) {
            if (s.getListActor().size() > max) {
                max = s.getListActor().size();
            }
        }
        return max;
    }
    public List InOneFilm(String actor,Basa basa) {
        ArrayList<String> list = new ArrayList<>();
        for (Film s : basa.getFilms()) {
            if (s.getListActor().contains(actor)) {
                list.addAll(s.getListActor());
                list.remove(actor);
            }
        }
        return list;
    }
    public boolean NoFilm(Basa basa) {
        boolean actor = false;
        for (Actor s2 : basa.getActors()) {
            for (Film s : basa.getFilms()) {
                if (s.getListActor().contains(s2.getName())) {
                    break;
                } else {
                    actor = true;
                }
            }
        }
        return actor;
    }
}
