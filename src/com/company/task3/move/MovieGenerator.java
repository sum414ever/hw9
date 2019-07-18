package com.company.task3.move;

import com.company.task3.move.utilit.Genre;
import com.company.task3.move.utilit.Name;
import com.company.task3.move.utilit.Price;

import java.util.ArrayList;
import java.util.List;

public class MovieGenerator {
    public static List<Movie> generateMoves(int numbersOfMovies) {
        List<Movie> movies = new ArrayList<>();
        for (int i = 0; i < numbersOfMovies; i++) {
            movies.add(new Movie(Name.getName(numbersOfMovies), Genre.generateGenre(), Price.getPrice()));
        }
        return movies;
    }
}
