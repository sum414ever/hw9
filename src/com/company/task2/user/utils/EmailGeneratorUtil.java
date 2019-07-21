package com.company.task2.user.utils;

import java.util.Random;


public class EmailGeneratorUtil {

    public static final String DOMAIN = "@gmail.com";

    public static String generateEmail(int numberOfUsers) {
        return "UserName" + new Random().nextInt(numberOfUsers) + DOMAIN;
    }
}
