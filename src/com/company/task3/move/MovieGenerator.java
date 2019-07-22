package com.company.task3.move;

import com.company.task3.move.utils.MovieGenreGenerationUtil;
import com.company.task3.move.utils.MovieNameGenerationUtil;
import com.company.task3.move.utils.PriceGenerationUtil;

import java.util.ArrayList;
import java.util.List;

public class MovieGenerator {

    public static List<Movie> generateMoves(int numbersOfMovies) {

        List<Movie> movies = new ArrayList<>();
        for (int i = 0; i < numbersOfMovies; i++) {

            movies.add(new Movie(MovieNameGenerationUtil.getName(numbersOfMovies), MovieGenreGenerationUtil.generateGenre(), PriceGenerationUtil.getPrice()));
        }
        return movies;
    }
}
