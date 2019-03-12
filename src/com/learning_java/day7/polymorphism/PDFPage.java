package com.learning_java.day7.polymorphism;

public class PDFPage implements Renderable {
    @Override
    public String getContent() {
        return "Rendering PDF page...";
    }
}
