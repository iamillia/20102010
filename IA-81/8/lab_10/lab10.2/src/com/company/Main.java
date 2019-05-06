package com.company;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {


        Smartphone smartphone = new Smartphone("samsung", 1.3, 1.2, 90, 100, "red");
        Smartphone smartphone1 = new Smartphone("samsung", 1.3, 1.2, 30, 10, "red");
        Smartphone smartphone2 = new Smartphone("samsung", 1.3, 1.2, 80, 2000, "red");
        Smartphone smartphone3 = new Smartphone("lg", 1.3, 2, 40, 50, "blue");

        ArrayList<Smartphone> list = new ArrayList<>();

        list.add(smartphone);
        list.add(smartphone1);
        list.add(smartphone2);
        list.add(smartphone3);
        list.forEach(System.out::println);

    }
}
