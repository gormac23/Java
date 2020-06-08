package com.gormac23.CodingExercises;

import java.util.Scanner;


//NOTE: To check solution in Udemy, delete "Exercise_[Number] in-front of class name
public class Exercise_27_InputCalculator {

    public static void inputThenPrintSumAndAverage() {

        // Set up scanner
        Scanner scanner = new Scanner(System.in);

        // Initialize variables for sum, avg and set up boolean flag to test input
        int sum= 0;
        int count = 0;
        boolean isInt = scanner.hasNextInt();

        // While
        while (isInt) {
            sum += scanner.nextInt();
            scanner.nextLine();

            count++;
            isInt = scanner.hasNextInt();
        }
        // NOTE: Without casting double to sum and count first before dividing results in an error rounding
        long avg = Math.round((double)(sum) / (double)(count));
        System.out.println("SUM = " + sum + " AVG = " + avg);

        scanner.close();
    }
}
