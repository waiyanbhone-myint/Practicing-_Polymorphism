package com.ps;

public class ElectricCar extends Car{

    private double avgKmPerCharge;
    private int batterySize;

    public ElectricCar(String description){
        super(description);
    }

    @Override
    public void drive() {
        super.drive();
        System.out.printf("..%s%n".repeat(3),
                "Silently powering on",
                "Electric current flows through motors",
                "Glides forward with a hum");


    }

}
