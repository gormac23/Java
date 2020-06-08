package com.gormac23.CodingExercises;

//NOTE: To check solution in Udemy, delete "Exercise_[Number] in-front of class name
public class Exercise_25_LargestPrime {

    public static int getLargestPrime(int n) {
        if(n<2) return -1;

        int largestPrime = 0;

        for(int i = 2; i < Math.sqrt(n); i++) {
            // Loop through checking if i divides
            while(n % i == 0) {
                n /= i;
                largestPrime = i;
            }


        }
        // if the decremented number cannot be divided anymore but is larger than the largest prime.
        // then n becomes the largest prime
        //
        return n > largestPrime? n : largestPrime;

    }


//    ***Only one method is allowed***

//    public static boolean isPrime(int n) {
//
//        if (n == 1) {
//            return false;
//        }
//
//        for (int i = 2; i <= n / 2; i++) {
//            if (n % i == 0) {
//                return false;
//            }
//        }
//
//        return true;
//    }
}
