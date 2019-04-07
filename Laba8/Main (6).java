package com.oops;

import java.util.Arrays;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Rectangle figure1 = new Rectangle("Petya", 32, 32, "Шось таке", 7);
        Rectangle figure2 = new Rectangle("Sasha", 45, 30, "Шось не таке",9);
        Rectangle.RecComp rc = new Rectangle.RecComp();
        TreeSet<Rectangle> ts1 = new TreeSet<>(rc);

        Circle figure3 = new Circle("O-R", 16 * 3.14, 7, 26);
        Circle figure4 = new Circle("Another circle", 23, 4, 26);
        Circle.CircleComp cc = new Circle(null, 0, 0, 0).new CircleComp();
        TreeSet<Circle> ts2 = new TreeSet<>(cc);

        RecTree(figure1, figure2, ts1, rc);

        CircleTree(figure3, figure4, ts2);

    }
    static void RecTree(Rectangle r1, Rectangle r2, TreeSet<Rectangle> ts1, Rectangle.RecComp rc) {
        Rectangle[] arrrec = new Rectangle[2];
        arrrec[0] = r1;
        arrrec[1] = r2;
        Arrays.sort(arrrec, rc);
        ts1.add(arrrec[0]);
        ts1.add(arrrec[1]);
        System.out.println(ts1);
    }
    static void CircleTree(Circle c1, Circle c2, TreeSet<Circle> ts2) {
        ts2.add(c1);
        ts2.add(c2);
        System.out.println(ts2);
    }
}
