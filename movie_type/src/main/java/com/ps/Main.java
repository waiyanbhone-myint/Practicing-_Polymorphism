package com.ps;

public class Main {
    public static void main(String[] args) {
        Movie movie = Movie.getMovie("Science", "Star Wars");
        movie.watchMovie();
    }
}