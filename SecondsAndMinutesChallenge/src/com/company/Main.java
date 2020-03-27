package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here
        System.out.println(getDurationString (129,50));
        System.out.println(getDurationString (5034));
    }

    public static String getDurationString (long minutes, long seconds){
        if (minutes < 0 || seconds < 0 || seconds > 59){
            return "Invalid Value";
        }
        long hours = minutes / 60;
        long remainingMinutes = minutes % 60;
        return  hours + "H " + remainingMinutes + "m " + seconds + "s";
    }
    public static String getDurationString (long seconds){
        if (seconds < 0){
            return "Invalid Value";
        }
        long minutes = seconds / 60;
        long remainingSeconds = seconds % 60;
        return getDurationString(minutes, remainingSeconds);
    }
}
