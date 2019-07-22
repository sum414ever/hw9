package com.company.task3;

import com.company.task3.move.Movie;
import com.company.task3.move.MovieGenerator;
import com.company.task3.move.utils.MovieGenreGenerationUtil;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MovieProcessing {
    final static int ACTION = 0;
    final static int ADVENTURE = 1;
    final static int COMEDY = 2;
    final static int CRIME = 3;
    final static int FANTASY = 4;

    public static void processingMovies() {

        List<Movie> first = MovieGenerator.generateMoves(50);
        List<Movie> second = MovieGenerator.generateMoves(50);

        Map<String, List<Movie>> movies = Stream.concat(
                first.stream(),
                second.stream())
                .collect(Collectors.groupingBy(Movie::getGenre));

        System.out.println("The average price in " + movies.get(MovieGenreGenerationUtil.getGenre(ACTION)).size() + " films by genre " + MovieGenreGenerationUtil.getGenre(ACTION) + " is " + (int) (countAveragePriceByGenre(movies, ACTION)) + " UAH");
        System.out.println("The average price in " + movies.get(MovieGenreGenerationUtil.getGenre(ADVENTURE)).size() + " films by genre " + MovieGenreGenerationUtil.getGenre(ADVENTURE) + " is " + (int) (countAveragePriceByGenre(movies, ADVENTURE)) + " UAH");
        System.out.println("The average price in " + movies.get(MovieGenreGenerationUtil.getGenre(COMEDY)).size() + " films by genre " + MovieGenreGenerationUtil.getGenre(COMEDY) + " is " + (int) (countAveragePriceByGenre(movies, COMEDY)) + " UAH");
        System.out.println("The average price in " + movies.get(MovieGenreGenerationUtil.getGenre(CRIME)).size() + " films by genre " + MovieGenreGenerationUtil.getGenre(CRIME) + " is " + (int) (countAveragePriceByGenre(movies, CRIME)) + " UAH");
        System.out.println("The average price in " + movies.get(MovieGenreGenerationUtil.getGenre(FANTASY)).size() + " films by genre " + MovieGenreGenerationUtil.getGenre(FANTASY) + " is " + (int) (countAveragePriceByGenre(movies, FANTASY)) + " UAH");
    }

    public static double countAveragePriceByGenre(Map<String, List<Movie>> listMovies, int genre) {
        return listMovies.get(MovieGenreGenerationUtil.getGenre(genre)).stream()
                .mapToInt(Movie::getPrice)
                .average()
                .getAsDouble();
    }
}
