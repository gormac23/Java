package com.gormac23.CodingExercises;


//NOTE: To check solution in Udemy, delete "Exercise_[Number] in-front of class name
public class Exercise_20_GreatestCommonDivisor {

    // Method to find the Greatest Common Divisor... (without creating a list)
    public static int getGreatestCommonDivisor(int x, int y) {
        if(x < 10 || y < 10) return -1;

        int gcd = 1;

        for(int i = 2; (i < (x/2)) || (i < (y/2)); i++) {
            if ((x % i == 0) && (y % i == 0)) {
                gcd = i;
            }
        }
        return  gcd;
    }
}
