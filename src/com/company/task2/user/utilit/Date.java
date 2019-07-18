package com.company.task2.user.utilit;

import java.time.LocalDate;
import java.util.Random;

public class Date {
    public static LocalDate generateDate() {
        return LocalDate.now().minusDays(new Random().nextInt(30));
    }
}
