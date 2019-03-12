package com.learning_java.day7.polymorphism;

public class NonInteractiveWebPage extends WebPage {
    @Override
    public String getContent() {
        return "Rendering Non Interactive web page...";
    }

    @Override
    public void click() {
        System.out.println("clicking is not supported on non interactive web pages.");
    }
}
