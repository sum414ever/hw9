package com.company.task3;

import com.company.task3.move.Movie;
import com.company.task3.move.MovieGenerator;
import com.company.task3.move.utilit.Genre;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MovieProcessing {
    public static void processingMovies() {
        List<Movie> first = MovieGenerator.generateMoves(50);
        List<Movie> second = MovieGenerator.generateMoves(50);

        Map<String, List<Movie>> movies = Stream.concat(
                first.stream(),
                second.stream())
                .collect(Collectors.groupingBy(Movie::getGenre));

        double actionAveragePrice = movies.get(Genre.getGenre(0)).stream()
                .mapToInt(Movie::getPrice)
                .average()
                .getAsDouble();

        double adventureAveragePrice = movies.get(Genre.getGenre(1)).stream()
                .mapToInt(Movie::getPrice)
                .average()
                .getAsDouble();

        double comedyAveragePrice = movies.get(Genre.getGenre(2)).stream()
                .mapToInt(Movie::getPrice)
                .average()
                .getAsDouble();

        double crimeAveragePrice = movies.get(Genre.getGenre(3)).stream()
                .mapToInt(Movie::getPrice)
                .average()
                .getAsDouble();

        double fantasyAveragePrice = movies.get(Genre.getGenre(4)).stream()
                .mapToInt(Movie::getPrice)
                .average()
                .getAsDouble();

        System.out.println("The average price in " + movies.get(Genre.getGenre(0)).size() + " films by genre " + Genre.getGenre(0) + " is " + (int) (actionAveragePrice) + " UAH");
        System.out.println("The average price in " + movies.get(Genre.getGenre(1)).size() + " films by genre " + Genre.getGenre(1) + " is " + (int) (adventureAveragePrice) + " UAH");
        System.out.println("The average price in " + movies.get(Genre.getGenre(2)).size() + " films by genre " + Genre.getGenre(2) + " is " + (int) (comedyAveragePrice) + " UAH");
        System.out.println("The average price in " + movies.get(Genre.getGenre(3)).size() + " films by genre " + Genre.getGenre(3) + " is " + (int) (crimeAveragePrice) + " UAH");
        System.out.println("The average price in " + movies.get(Genre.getGenre(4)).size() + " films by genre " + Genre.getGenre(4) + " is " + (int) (fantasyAveragePrice) + " UAH");
    }
}
