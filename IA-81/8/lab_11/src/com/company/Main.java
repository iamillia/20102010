package com.company;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {


        Smartphone smartphone = new Smartphone("samsung", 1.3, 1.2, 90, 100, "red");
        Smartphone smartphone1 = new Smartphone("samsung", 1.3, 1.2, 30, 10, "red");
        Smartphone smartphone2 = new Smartphone("lg", 1.3, 1.2, 80, 2000, "red");
        Smartphone smartphone3 = new Smartphone("lg", 1.3, 2, 40, 50, "blue");

        Arrays.asList(smartphone, smartphone1, smartphone2, smartphone3)
                .stream()
                .filter(Smartphone::onlyRead)
                .filter(Telephone::onlyLg)
                .forEach(System.out::println);

        Arrays.asList("samsung","samsung", "samsung", "lg")
                .stream()
                .map(Telephone::new)
                .forEach(System.out::println);
    }
}