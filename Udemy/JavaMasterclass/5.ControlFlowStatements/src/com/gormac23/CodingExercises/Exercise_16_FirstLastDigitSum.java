package com.gormac23.CodingExercises;


//NOTE: To check solution in Udemy, delete "Exercise_[Number] in-front of class name
public class Exercise_16_FirstLastDigitSum {

    public static int sumFirstAndLastDigit(int number) {
        // Catch neg. numbers
        if(number < 0) {
            return -1;
        // Catch single digit numbers
        } else if(number < 10) {
            return number + number;
        }

        int lastDigit = number % 10;
        number /= 10;
        while(number >= 10) {
            number /=10;
        }
        int firstDigit = number;


        return firstDigit + lastDigit;
    }
}
