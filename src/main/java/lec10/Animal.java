package lec10;

public sealed abstract class Animal {
//        permits Dog {
}


final class Dog extends Animal {
    public String bark() {
        return "bark";
    }
}
