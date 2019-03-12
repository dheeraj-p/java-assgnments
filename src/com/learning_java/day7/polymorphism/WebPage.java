package com.learning_java.day7.polymorphism;

public class WebPage implements Renderable, Displayable {
    @Override
    public void display(String text) {
        System.out.println(text);
    }

    @Override
    public String getContent() {
        return "Rendering Web Page...";
    }

    public void click(){
        System.out.println("Clicked on Web page.");
    }
}
