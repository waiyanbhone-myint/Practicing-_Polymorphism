package com.ps;

public class GasPoweredCar extends Car{

    private double avgKmPerLitre;
    private int cylinders;

    public GasPoweredCar(String description) {
        super(description);
    }

    @Override
    public void drive() {
        super.drive();
        System.out.printf("..%s%n".repeat(3),
                "Igniting cylinders with a loud roar",
                "Burning fuel rapidly",
                "Speeding up with vibration and noise");

    }
}
