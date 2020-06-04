package com.gormac23;

public class DigitSumChallenge {

    // Create a method to sum the digits of a number
    // i.e. 125 returns 1 + 2 + 5 = 8

    public static void main(String[] args) {

        System.out.println(sumDigits(125));
        System.out.println(sumDigits(2048));
        System.out.println(sumDigits(10));
        System.out.println(sumDigits(5));
        System.out.println(sumDigits(-1));

    }


    private static int sumDigits(int n) {
        // Doesn't accept negative numbers
        // or single digit numbers
        if(n < 10) {
            return -1;
        }

        int sum = 0;

        while(n >= 1) {
            // extract least-significant digit and drop it
            sum += n % 10;
            n /= 10;
        }

        return sum;
    }
}
