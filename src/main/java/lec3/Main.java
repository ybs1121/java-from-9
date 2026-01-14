package lec3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    @SafeVarargs
    public static <T> List<T> flatten(List<T>... list) {
        List<T> result = new ArrayList<>();

        for (List<T> t : list) {
            result.addAll(t);
        }

        return result;
    }

    public static void main(String[] args) {
        List<Integer> list1 = Arrays.asList(1, 2, 3);
        List<Integer> list2 = Arrays.asList(4, 5, 6);

        List<Integer> result = flatten(list1, list2);
        System.out.println(result);
    }
}
