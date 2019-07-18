package com.company.task2.user.utilit;

import java.util.Random;

public class Email {
    public static String generateEmail(int numberOfUsers) {
        return "UserName" + new Random().nextInt(numberOfUsers) + "@gmail.com";
    }
}
