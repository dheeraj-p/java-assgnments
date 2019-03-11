package com.learning_java.day4;

public class Main {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle("Maruti", 4);
        Car car = (Car) new Vehicle("Ferrari", 4);

        car.changeGearTo(3);
    }
}
