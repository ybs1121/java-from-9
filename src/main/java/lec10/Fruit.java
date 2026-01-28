package lec10;

import java.time.LocalDate;

// 다른 클래스 상송 불가, 인터페이스 구현 가능
public record Fruit(
        String name,
        int price,
        LocalDate date
) {

    // Compact Construction
    public Fruit {
        System.out.println("TEST");
    }

    public static final double DISCOUNT_RATE = 0.3;

    public int getDiscountPrice() {
        return (int) (price * (1.0 - DISCOUNT_RATE));
    }

}
