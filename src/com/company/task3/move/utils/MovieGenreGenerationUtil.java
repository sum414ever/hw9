package com.company.task3.move.utils;

import java.util.Random;

public class MovieGenreGenerationUtil {

    private static String[] genres = {"Action", "Adventure", "Comedy", "Crime", "Fantasy"};

    public static String generateGenre() {
        return genres[new Random().nextInt(genres.length)];
    }

    public static String getGenre(int genre) {
        return genres[genre];
    }
}
