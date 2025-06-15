package com.ps;

public class HybridCar extends Car{

    private double avgKmPerLitre;
    private int batterySize;
    private int cylinders;

    public HybridCar(String description){
        super(description);
    }

    @Override
    public void drive() {
        super.drive();
        System.out.printf("..%s%n".repeat(3),
                "Starting silently on electric power",
                "Switching to gas engine at higher speed",
                "Balancing efficiency and performance");


    }
}
