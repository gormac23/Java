package com.gormac23.CodingExercises;


//NOTE: To check solution in Udemy, delete "Exercise_[Number] in-front of class name
public class Exercise_22_PerfectNumber {

    // A perfect number is a positive integer which is equal to the sum of its positive divisors
    // (excluding the perfect number itself)
    public static boolean isPerfectNumber(int n) {
        if(n < 6) return false; // 6 is the first perfect number

        int sum = 0;
        for(int i = 1; i < n; i++) {
            if(n % i == 0) {
                sum += i;
            }
        }
        return sum == n;
    }
}
