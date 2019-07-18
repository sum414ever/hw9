package com.company.task3.move.utilit;

import java.util.Random;

public class Name {
    public static String getName(int numbersOfMovies) {
        return "MovieName" + new Random().nextInt(numbersOfMovies);
    }
}
