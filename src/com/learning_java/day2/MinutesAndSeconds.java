package com.learning_java.day2;


import java.util.Optional;

public class MinutesAndSeconds {

    public static void main(String[] args) {
        System.out.println(getDurationString(361));
        System.out.println(getDurationString(69, 23));
        System.out.println(getDurationString(-5,6));
        System.out.println(getDurationString(9,-3));
        System.out.println(getDurationString(9,64));
        System.out.println(getDurationString(9,9));
        System.out.println(getDurationString(61,0));
        System.out.println(getDurationString(61));
        System.out.println(getDurationString(48645900));
    }

    public static String getDurationString(int minutes, int seconds) {
        Optional<String> maybeString = Optional.ofNullable("dsf");
        if (minutes < 0 || seconds < 0 || seconds > 59) {
            return "Invalid Value";
        }

        int hoursDuration = minutes / 60;
        int minutesDuration = minutes % 60;

        return hoursDuration + "h " + minutesDuration + "m " + seconds + "s";
    }

    public static String getDurationString(int seconds){
        if(seconds < 0){
            return "Invalid Value";
        }

        int minutesDuration = seconds / 60;
        int secondsDuration = seconds % 60;

        return getDurationString(minutesDuration, secondsDuration);
    }
}
