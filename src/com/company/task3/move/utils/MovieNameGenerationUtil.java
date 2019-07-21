package com.company.task3.move.utils;

import java.util.Random;

public class MovieNameGenerationUtil {
    public static String getName(int numbersOfMovies) {
        return "MovieName" + new Random().nextInt(numbersOfMovies);
    }
}
