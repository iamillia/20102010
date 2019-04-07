package com.oops;

import java.util.Comparator;

public class Circle extends Figure {
    double Length;
    private int Radius;


    public Circle(String name, double square, int radius, double length) {
        super(name, square);
        this.Length = length;
        this.Radius = radius;
    }


    @Override
    public String toString() {
        return "Circle{" +
                "Length=" + Length +
                ", Radius=" + Radius +
                ", name='" + name + '\'' +
                ", Square=" + Square +
                '}';
    }

    class CircleComp implements Comparator<Circle> {
        @Override
        public int compare(Circle c1, Circle c2) {
            if (c1.Radius == c2.Radius) {
                return 0;
            }
            if (c1.Radius > c2.Radius) {
                return 1;
            }
            else {
                return -1;
            }
        }
    }
}
