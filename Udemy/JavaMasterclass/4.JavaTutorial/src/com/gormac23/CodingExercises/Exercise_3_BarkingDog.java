package com.gormac23.CodingExercises;

//NOTE: To check solution in Udemy, delete "Exercise_[Number] in-front of class name
public class Exercise_3_BarkingDog {

    public static boolean shouldWakeUp(boolean barking, int hourOfDay) {

        if((hourOfDay < 0) || (hourOfDay > 23)) {
            return false;
        }

        if(((hourOfDay < 8 ) && (barking)) || (hourOfDay > 22) && !barking) {
            return true;
        } else {
            return  false;
        }
    }
}
