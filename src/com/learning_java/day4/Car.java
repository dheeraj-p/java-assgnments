package com.learning_java.day4;

public class Car extends Vehicle {
    private String gearMode;
    private Integer doors;

    public Car(String manufacturer, Integer doors, String gearMode) {
        super(manufacturer, 4);
        this.gearMode = gearMode;
        this.doors = doors;
    }

    public void steerLeft() {
        System.out.println("Steering Left");
    }

    public void steerRightt() {
        System.out.println("Steering Right");
    }

    public void  changeGearTo(Integer gearNumber){
        if(this.gearMode == "Automatic"){
            return;
        }
        System.out.println("Gear changed to" + gearNumber);
    }
}
