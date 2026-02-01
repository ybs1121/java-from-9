package lec10;

import java.util.Random;

public final class Dog extends Animal {
    public String bark() {
        return "bark";
    }

    public boolean isQuite() {
        return (new Random()).nextBoolean();
    }

    public String getOwnerName() {

        return "Hong";
    }
}
