package com.oops;
import java.util.Comparator;
public class Rectangle extends Figure {
    private int perimeter;
    String kind;
    int diagonal;
    public Rectangle(String name, double square, int perimeter, String kind, int diagonal) {
        super(name, square);
        this.perimeter = perimeter;
        this.kind = kind;
        this.diagonal = diagonal;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "perimeter=" + perimeter +
                ", kind='" + kind + '\'' +
                ", name='" + name + '\'' +
                ", diagonal='" + diagonal + '\'' +
                ", Square=" + Square +
                '}';
    }
    static class RecComp implements Comparator<Rectangle> {
        @Override
        public int compare(Rectangle r1, Rectangle r2) {
            if (r1.perimeter == r2.perimeter) {
                return 0;
            }
            if (r1.perimeter > r2.perimeter) {
                return 1;
            }
            else {
                return -1;
            }
        }
    }
}
