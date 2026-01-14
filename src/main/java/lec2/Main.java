package lec2;

import java.lang.reflect.Field;

public class Main {

    public static void main(String[] args) throws Exception {
        Lec02Person p = new Lec02Person();

        Class<Lec02Person> lec02PersonClass = Lec02Person.class;
        Field weight = lec02PersonClass.getDeclaredField("weight");
        weight.setAccessible(true);

        weight.set(p, 100);

        System.out.println("p = " + p.getWeight());
    }
}
