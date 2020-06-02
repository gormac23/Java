package com.gormac23.CodingExercises;


//NOTE: To check solution in Udemy, delete "Exercise_[Number] in-front of class name
public class Exercise_9_MinutesToYearsDaysCalculator {

    public static void printYearsAndDays(long minutes) {
        if(minutes < 0) {
            System.out.println("Invalid Value");
        } else {
            long hour = minutes / 60;
            long day = hour / 24;
            long year = day / 365;
            long remainingDays = day % 365;

            System.out.println(minutes + " min = " + year + " y and " + remainingDays + " d");
        }
    }
}
