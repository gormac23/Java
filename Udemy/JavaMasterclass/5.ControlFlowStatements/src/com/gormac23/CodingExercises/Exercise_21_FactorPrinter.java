package com.gormac23.CodingExercises;


//NOTE: To check solution in Udemy, delete "Exercise_[Number] in-front of class name
public class Exercise_21_FactorPrinter {

    public static void printFactors(int n) {
        if(n < 1) System.out.println("Invalid Value");

        for(int i = 1; i <= n; i++) {
            if(n % i == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.print("\n");
    }
}
