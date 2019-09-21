package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here
        System.out.println(getDurationString (129,50));
    }

    public static String getDurationString (int minutes, int seconds){
        if (minutes < 0 || seconds < 0 || seconds > 59){
            return "Invalid Value";
        }
        int hours = minutes / 60;
        int remainingMinutes = minutes % 60;
        return  hours + "H " + remainingMinutes + "m " + seconds + "s";
    }
}
