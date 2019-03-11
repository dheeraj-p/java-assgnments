package com.learning_java.day6;

public class Sorting {
    public static void main(String[] args) {
        int[] numbers = {2,4,46,23,6,2,34,6,23,157,8,23,3,5};
        int[] sortedNumbers = sort(numbers);

        for (int i = 0; i < sortedNumbers.length; i++) {
            System.out.println(sortedNumbers[i]);
        }
    }

    public static int[] sort(int[] integers){
        for (int i = 0; i < integers.length; i++) {
            for (int j=0; j < integers.length - 1; j++){
                if(integers[j] > integers[j+1]){
                    int temp = integers[j];
                    integers[j] = integers[j+1];
                    integers[j+1] = temp;
                }
            }
        }
        return integers;
    }
}
