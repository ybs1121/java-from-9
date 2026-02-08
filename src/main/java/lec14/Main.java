package lec14;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        int a = Math.clamp(10, 5, 15);
        System.out.println(a);

        List<Integer> nubmers = new ArrayList<>(List.of(1, 2, 3, 4));
        nubmers.get(nubmers.size() -1);
        nubmers.getLast();


        List<Integer> reversed = nubmers.reversed();
//        nubmers.add(6)
        nubmers.add(6);
        System.out.println(reversed);


    }
}
