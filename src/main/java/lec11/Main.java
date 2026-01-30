package lec11;

import java.util.Comparator;
import java.util.List;
import java.util.random.RandomGeneratorFactory;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        String str = """
                저는 %s 입니다.
                """.formatted("홍길동");

        System.out.println(str);


        List<Integer> nums = List.of(1, 2, 5, 2, 30);


        Integer mid = nums.stream().collect(
                Collectors.teeing(
                        Collectors.minBy(Comparator.comparingInt(value -> value)),
                        Collectors.maxBy(Comparator.comparingInt(value -> value)),
                        (f1, f2) -> {
                            if (f1.isPresent()) {
                                System.out.println("min : " + f1.get());
                            }
                            if (f2.isPresent()) {
                                System.out.println("max : " + f2.get());
                            }


                            return (f1.get() + f2.get()) / 2;
                        }
                )
        );

        System.out.println("MID : " + mid);

        RandomGeneratorFactory.all()
                .forEach(f -> System.out.println(f.name()));

//        User user = new User();

        // Helpful NullPointException (어디서 NPE 발생했는지 알려준다)
//        User user = null;
//        boolean a = user.getName().isBlank();

    }


    public static class User {
        String name;

        public void setName(String name) {
            this.name = name;
        }

        public String getName() {
            return this.name;
        }
    }
}