package com.learning_java.day7;

import java.util.List;
import java.util.NoSuchElementException;

public class ListIterator {

    private final List list;
    private Integer currentIndex;
    public ListIterator(List list) {
        this.list = list;
        this.currentIndex = 0;
    }

    public boolean hasNext(){
        return this.currentIndex < list.size();
    }

    public Object next() throws NoSuchElementException {
        if (!this.hasNext()){
            throw new NoSuchElementException();
        }
        return list.get(currentIndex++);
    }
}
