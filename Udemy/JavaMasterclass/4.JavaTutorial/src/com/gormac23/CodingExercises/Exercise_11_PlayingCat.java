package com.gormac23.CodingExercises;


//NOTE: To check solution in Udemy, delete "Exercise_[Number] in-front of class name
public class Exercise_11_PlayingCat {

    public static boolean isCatPlaying(boolean summer, int temperature) {
        if (! summer && (temperature >= 25 && temperature <= 35)) {
            return true;
        } else if (summer && (temperature >= 25 && temperature <= 45)) {
            return true;
        } else {
            return false;
        }
    }
}
