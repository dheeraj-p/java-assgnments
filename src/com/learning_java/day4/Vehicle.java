package com.learning_java.day4;

public class Vehicle {
    private Integer wheels;
    private String manufacturer;

    public Vehicle(String manufacturer, Integer wheels) {
        this.wheels = wheels;
        this.manufacturer = manufacturer;
    }

    public void speedUp(){
        System.out.println("Speeding up");
    }

    public void slowDown(){
        System.out.println("Slowing down");
    }
}
