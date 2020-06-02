package com.gormac23.CodingExercises;


//NOTE: To check solution in Udemy, delete "Exercise_[Number] in-front of class name
public class Exercise_5_DecimalComparator {

    public static boolean areEqualByThreeDecimalPlaces(double num1, double num2) {

        double x = num1 * 1000;
        double y = num2 * 1000;


        if((int)x == (int)y) {
            return true;
        } else {
            return false;
        }
    }

}