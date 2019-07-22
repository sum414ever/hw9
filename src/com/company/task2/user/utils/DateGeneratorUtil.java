package com.company.task2.user.utils;

import java.time.LocalDate;
import java.util.Random;

public class DateGeneratorUtil {
    public static LocalDate generateDate() {
        return LocalDate.now().minusDays(new Random().nextInt(30));
    }
}
