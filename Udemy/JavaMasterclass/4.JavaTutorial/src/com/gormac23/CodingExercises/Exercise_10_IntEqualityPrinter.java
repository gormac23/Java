package com.gormac23.CodingExercises;


//NOTE: To check solution in Udemy, delete "Exercise_[Number] in-front of class name
public class Exercise_10_IntEqualityPrinter {

    public static void printEqual( int x, int y, int z) {
        if(x < 0 || y < 0 || z < 0) {
            System.out.println("Invalid Value");
        } else if (x == y && y == z) {
            System.out.println("All numbers are equal");
        } else if (x != y && y != z && x != z) {
            System.out.println("All numbers are different");
        } else {
            System.out.println("Neither all are equal or different");
        }
    }
}
