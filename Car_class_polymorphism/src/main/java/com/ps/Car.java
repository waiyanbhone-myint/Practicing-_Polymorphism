package com.ps;

public class Car {

    private String description;

    public Car(String description) {
        this.description = description;
    }

    public void drive(){
        var instanceType = this.getClass().getSimpleName();
        System.out.println(this.description + " is " + instanceType + ".");
        System.out.println(this.description + " is starting engine.");
    }

    protected void runEngine(){
        System.out.println(this.description + " engine start running.");
    }

    //Building Factory Method
    public static Car getCar(String description, String carType){

        return switch (carType.toUpperCase().charAt(0)){

            case 'G' -> new GasPoweredCar(description);
            case 'H' -> new HybridCar(description);
            case 'E' -> new ElectricCar(description);
            default -> new Car(description);
        };
    }


}
