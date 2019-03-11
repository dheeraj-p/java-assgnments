package com.learning_java.day7;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> numbers=  new ArrayList<>();
        for (int i=0; i< 10; i++){
            numbers.add(i);
        }

        ListIterator listIterator = new ListIterator(numbers);

        while (listIterator.hasNext()){
            System.out.println(listIterator.next());
        }

        //It will throw a NoSuchElementException
        listIterator.next();
    }
}
