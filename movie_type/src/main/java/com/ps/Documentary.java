package com.ps;

public class Documentary extends Movie{

    public Documentary(String title){
        super(title);
    }

    @Override
    public void watchMovie() {
        super.watchMovie();
        System.out.printf("..%s%n".repeat(3),
                "Documentary Starting",
                "Something happening",
                "Documentary End");
    }
}
