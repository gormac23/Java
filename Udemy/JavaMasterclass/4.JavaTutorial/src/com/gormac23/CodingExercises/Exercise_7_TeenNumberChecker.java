package com.gormac23.CodingExercises;


//NOTE: To check solution in Udemy, delete "Exercise_[Number] in-front of class name
public class Exercise_7_TeenNumberChecker {

    public static boolean isTeen(int age) {

        if((age >= 13 && age <= 19)) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean hasTeen(int a, int b, int c) {

        if(isTeen(a) || (isTeen(b)) || (isTeen(c))) {
            return true;
    } else {
            return false;
        }


    }
}