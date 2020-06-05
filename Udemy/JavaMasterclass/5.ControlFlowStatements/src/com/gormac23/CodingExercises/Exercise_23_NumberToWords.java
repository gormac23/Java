package com.gormac23.CodingExercises;

public class Exercise_22_NumberToWords {


    public static void numberToWords(int n) {

    }


    public static boolean getDigitCount(int n) {

    }


    public static int reverse(int n) {

        int reverseNumber = 0;

        while(n != 0) {
            int lastDigit = n % 10;
            reverseNumber *= 10;
            reverseNumber += lastDigit;
        }
    }
}
