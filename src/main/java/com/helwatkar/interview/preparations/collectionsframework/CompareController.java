package com.helwatkar.interview.preparations.collectionsframework;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@RestController
@RequestMapping("/api/v1/compare")
@Slf4j
public class CompareController {


    @GetMapping("/welcomeCompareController")
    public String welcome() {
        return "Welcome to Compare Controller";
    }

    @GetMapping("/sortByYear")
    public List sortByReleaseYear() {
        // Example usage of MovieComparable
        MovieComparable movie1 = new MovieComparable("Inception", "Christopher Nolan", 2010);
        MovieComparable movie2 = new MovieComparable("The Matrix", "Lana Wachowski, Lilly Wachowski", 1999);
        MovieComparable movie3 = new MovieComparable("Interstellar", "Christopher Nolan", 2014);
        List<MovieComparable> movies = new ArrayList<>();
        movies.add(movie1);
        movies.add(movie2);
        movies.add(movie3);

        // Print all elements in the list
        movies.forEach(movie -> log.info(movie.getTitle() + " - " + movie.getReleaseYear()));

        // Sort the list using the compareTo method
        Collections.sort(movies);

        // Print sorted elements
        movies.stream().forEach(movie -> log.info(movie.getTitle() + " - " + movie.getReleaseYear()));

        return movies;

    }

    @GetMapping("/sortByTitle")
    public List sortByTitle() {
        // Example usage of MovieCustomComparator
        MovieCustomComparator movie1 = new MovieCustomComparator("Inception", "Christopher Nolan", 2010);
        MovieCustomComparator movie2 = new MovieCustomComparator("The Matrix", "Lana Wachowski, Lilly Wachowski", 1999);
        MovieCustomComparator movie3 = new MovieCustomComparator("Interstellar", "Christopher Nolan", 2014);
        List<MovieCustomComparator> movies = new ArrayList<>();
        movies.add(movie1);
        movies.add(movie2);
        movies.add(movie3);

        movies.stream().forEach(movie -> log.info(movie.getTitle() + " - " + movie.getReleaseYear()));

        Collections.sort(movies, new MovieCustomComparator());

        movies.stream().forEach(movie -> log.info(movie.getTitle() + " - " + movie.getReleaseYear()));

        return movies;
    }
}
