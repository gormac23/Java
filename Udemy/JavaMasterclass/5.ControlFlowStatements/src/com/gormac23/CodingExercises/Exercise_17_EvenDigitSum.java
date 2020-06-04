package com.gormac23.CodingExercises;


//NOTE: To check solution in Udemy, delete "Exercise_[Number] in-front of class name
public class Exercise_17_EvenDigitSum {

    public static int getEvenDigitSum(int n) {
        if(n < 0) return -1;

        int sum = 0;


        while(n > 0) {
            // Grabs last digit
            int lastDigit = n % 10;
            // Checks if even
            if(lastDigit % 2 == 0) {
                // Then add to the total sum
                sum += lastDigit;
            }
            // Remove last digit and continue loop
            n /= 10;
        }

        return sum;
    }
}
