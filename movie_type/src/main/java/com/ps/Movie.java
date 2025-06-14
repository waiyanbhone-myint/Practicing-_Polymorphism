package com.ps;

public class Movie {

    private String title;

    public Movie(String title){
        this.title = title;
    }

    public void watchMovie(){
        String instanceType = this.getClass().getSimpleName();
        System.out.println(this.title + " is a " + instanceType + " film");
    }

    public static Movie getMovie(String type, String title){

        return switch (type.toUpperCase().charAt(0)){
            case 'A' -> new Adventure(title);
            case 'C' -> new Comedy(title);
            case 'D' -> new Documentary(title);
            case 'S' -> new ScienceFiction(title);
            default -> new Movie(title);
        };
    }
}
