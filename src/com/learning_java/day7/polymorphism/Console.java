package com.learning_java.day7.polymorphism;

public class Console implements Displayable {
    @Override
    public void display(String text) {
        System.out.println(text);
    }
}
