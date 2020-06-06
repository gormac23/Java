package com.gormac23.CodingExercises;


//NOTE: To check solution in Udemy, delete "Exercise_[Number] in-front of class name
public class Exercise_19_LastDigitChecker {

    public static boolean hasSameLastDigit(int x, int y, int z) {
        if(!isValid(x) || !isValid(y) || !isValid(z)) {
            return false;
        }

        int xLast = x % 10;
        int yLast = y % 10;
        int zLast = z % 10;

        return (xLast == yLast || xLast == zLast || yLast == zLast);
    }


    public static boolean isValid(int n) {
        if (n < 10 || n > 1000) {
            return false;
        } else return true;

    }
}
