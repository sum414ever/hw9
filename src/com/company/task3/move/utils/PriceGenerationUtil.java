package com.company.task3.move.utils;

public class PriceGenerationUtil {

    public static Integer getPrice() {
        final int MIN_PRICE = 50;
        final int MAX_PRICE = 200;
        return (int) (MIN_PRICE + Math.random() * (MAX_PRICE + 1 - MIN_PRICE));
    }
}
