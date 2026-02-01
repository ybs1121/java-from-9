package lec12;

import lec10.Animal;
import lec10.Cat;
import lec10.Dog;

public class Main {
    record Point(double x, double y) {
    }

    record Line(Point p1, Point p2) {
    }


    public static void find(Object o) {
        if (o instanceof Point p) {
            double dist = Math.hypot(p.x(), p.y());
            System.out.println("dist : " + dist);
        }

        if (o instanceof Point(double x, double y)) {
            double dist = Math.hypot(x, y);
            System.out.println("dist : " + dist);
        }

        if (o instanceof Line(Point(var x1, var x2), Point(var y1, var y2))) {
            double dist = Math.hypot(y1, y2);
            System.out.println("dist : " + dist);
        }
    }

    public String sound(Animal animal) {
        return switch (animal) {
            case Dog dog when dog.isQuite() -> "";
            case Dog dog -> dog.bark();
            case Cat dog -> dog.purr();
            default -> throw new IllegalArgumentException("NOT FOUND");
        };
    }


    static void main(String[] args) {

    }
}
