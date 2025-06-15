package com.ps;

public class Main {
    public static void main(String[] args) {
        Car gasPoweredCar = Car.getCar("Toyota", "Gas  Powered Car");
        gasPoweredCar.drive();

        System.out.println("-----\n");

        Car electricCar = Car.getCar("Tesla", "Electric Car");
        electricCar.drive();

        System.out.println("-----\n");

        Car hybridCar = Car.getCar("Honda", "Hybrid Car");
        hybridCar.drive();

        System.out.println("-----\n");

        Car spotCar = Car.getCar("Nissan", "Spot Car");
        spotCar.drive();
    }
}