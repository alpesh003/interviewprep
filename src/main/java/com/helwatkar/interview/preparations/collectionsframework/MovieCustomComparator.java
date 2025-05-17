package com.helwatkar.interview.preparations.collectionsframework;

import java.util.Comparator;

public class MovieCustomComparator implements Comparator<MovieCustomComparator> {
    private String title;
    private String director;
    private int releaseYear;

    public MovieCustomComparator(String title, String director, int releaseYear) {
        this.title = title;
        this.director = director;
        this.releaseYear = releaseYear;
    }

    public MovieCustomComparator() {
    }

    public String getTitle() {
        return title;
    }

    public String getDirector() {
        return director;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    @Override
    public int compare(MovieCustomComparator o1, MovieCustomComparator o2) {
//        return Integer.compare(o1.releaseYear, o2.releaseYear);
        return o1.title.compareTo(o2.title);
    }
}
