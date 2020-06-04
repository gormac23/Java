package com.gormac23.CodingExercises;


//NOTE: To check solution in Udemy, delete "Exercise_[Number] in-front of class name
public class Exercise_18_SharedDigit {

    public static boolean hasSharedDigit(int x, int y) {
        if((x < 10 || y < 10) || (x > 99 || y > 99 )) return false;

        int xLast = x % 10;
        int xFirst = x / 10;
        int yLast = y % 10;
        int yFirst = y / 10;

        return ((xFirst == yFirst) || (xFirst == yLast)) || ((xLast == yFirst) || (xLast == yLast));
    }

}
