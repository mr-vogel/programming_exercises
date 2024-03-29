package com.mikevogel;

public class Main {

    public static final String INVALID_VALUE_MESSAGE = "Invalid value";

    public static void main(String[] args) {
        System.out.println(getDurationString(65, 45));
        System.out.println(getDurationString(3945));
        System.out.println(getDurationString(-41));
        System.out.println(getDurationString(65, 9));


    }

    public static String getDurationString(int minutes, int seconds) {
        if ((minutes < 0) || (seconds < 0) || (seconds > 59)) {
            return INVALID_VALUE_MESSAGE;
        }
        int hours = minutes / 60;
        int remainingMinutes = minutes % 60;

        String hoursString = hours + "h";
        if (hours < 10){
            hoursString = "0" + hoursString;
        }

        String minutesString = remainingMinutes + "m";
        if (remainingMinutes < 10){
            minutesString = "0" + minutesString;
        }

        String secondsString = seconds + "s";
        if (seconds < 10){
            secondsString = "0" + secondsString;
        }
        return hoursString + " " + minutesString + " " + secondsString;

    }

    public static String getDurationString(int seconds) {
        if (seconds < 0) {
            return INVALID_VALUE_MESSAGE;
        }
        int minutes = seconds / 60;
        int remainingSeconds = seconds % 60;

        return getDurationString(minutes, remainingSeconds);

    }

}

// Create a method called getDurationString with two parameters, first parameter minutes and 2nd parameter seconds
// Validate that the first param minutes is >=0
// Validate that the second param seconds is >=0 and <=59
// The method should return "Invalid value" in the method if either of the above are not true
// If the parameters are valid then calculate how many hours minutes and seconds equal the
// minutes and seconds passed to this method and return that value as string in format
// "XXh YYm ZZs"


// Create a 2nd method of the same name but with only one parameter seconds
// Validate that it is >=0, and return "Invalid value" if it is not true
// If it is valid, then calculate how many minutes are in the seconds value and then call
// the other overloaded method passing the correct minutes and seconds calculated so that it can calculate correctly

// Call both methods to print values to the console.

// Tips
// Use int or long for your number data types
// 1 minute = 60 seconds and 1 hour = 60 mins or 3600 seconds
// Methods should be static as we have used previously

// Bonus
// for the input 61 minutes output should be 01h 01m 00s, but it is ok if it is 1h 1m 0s (Tip: use if-else)
// Create a new console project and call it SecondsAndMinutesChallenge