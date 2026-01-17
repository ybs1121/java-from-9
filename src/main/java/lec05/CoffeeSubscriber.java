package lec05;

import java.util.concurrent.Flow;

public class CoffeeSubscriber implements Flow.Subscriber<String> {

    private Flow.Subscription subscription;
    private int cnt = 0;

    @Override
    public void onSubscribe(Flow.Subscription subscription) {
        this.subscription = subscription;
        subscription.request(1L);

    }

    @Override
    public void onNext(String item) {
        System.out.println("수신: " + item);
        cnt += 1;

        if (cnt < 2) {
            subscription.request(1L);
        }

    }

    @Override
    public void onError(Throwable throwable) {
        System.out.println("에러");

    }

    @Override
    public void onComplete() {
        System.out.println("전달 완료");
    }
}
