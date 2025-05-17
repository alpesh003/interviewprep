package com.helwatkar.interview.preparations.collectionsframework;

public class MovieComparable implements Comparable<MovieComparable> {
    private String title;
    private String director;
    private int releaseYear;

    public MovieComparable(String title, String director, int releaseYear) {
        this.title = title;
        this.director = director;
        this.releaseYear = releaseYear;
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
    public int compareTo(MovieComparable other) {
        return Integer.compare(this.releaseYear, other.releaseYear);
    }
}
