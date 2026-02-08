package lec15;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Main2 {

    public static void main(String[] args) throws Exception {

        Thread t = Thread.ofVirtual()
                .start(() -> System.out.println("HI"));

        t.join();

        Thread t2 = Thread.startVirtualThread(
                () -> System.out.println("HI2")
        );


        try (ExecutorService executorService = Executors.newVirtualThreadPerTaskExecutor()) {
            Future<String> submit = executorService.submit(() -> "Hi3");
            System.out.println(submit.get());
        }

    }
}
