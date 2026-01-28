package lec10;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        Fruit banana = new Fruit("banana", 1000, LocalDate.of(2026, 11, 11));

        System.out.println(banana.name());
        System.out.println(banana.date());
        System.out.println(banana);
    }
}
