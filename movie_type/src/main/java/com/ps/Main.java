package com.ps;

import java.util.Scanner;

public class Main {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        while(true){
            System.out.println("Enter type ( A for Adventure, C for Comedy, " +
                    "S for Science Fiction, D for Documentary or Q to quit): ");
            String type = scanner.nextLine();
            if("Qq".contains(type)){
                break;
            }
            System.out.println("Enter Movie Title: ");
            String title = scanner.nextLine();
            Movie movie = Movie.getMovie(type, title);
            movie.watchMovie();
        }

    }
}