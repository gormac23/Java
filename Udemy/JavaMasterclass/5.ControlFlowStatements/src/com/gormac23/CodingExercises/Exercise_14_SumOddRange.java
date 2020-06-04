package com.gormac23.CodingExercises;


//NOTE: To check solution in Udemy, delete "Exercise_[Number] in-front of class name
public class Exercise_14_SumOddRange {

    public static boolean isOdd(int number) {
        if(number < 0) {
            return false;
        } else if (number % 2 != 0) {
            return true;
        } else {
            return false;
        }
    }

    public static int sumOdd(int start, int end) {
        int total = 0;
        if((start < 0 || end < 0) || (end < start)) {
            return -1;
        } else {
            for(int i = start; i <= end; i ++) {
                if(isOdd(i)) {
                    total += i;

                }
            }
            return total;
        }
        //return -1 ;
    }
}
