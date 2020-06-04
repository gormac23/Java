package com.gormac23;

public class ForLoop {

    public static void main(String[] args) {
        System.out.println(calculateInterest(10000.0, 2.0));
        System.out.println(calculateInterest(10000.0, 3.0));
        System.out.println(calculateInterest(10000.0, 4.0));
        System.out.println(calculateInterest(10000.0, 5.0));

        // for statement or for loop is sued to loop through codes of code
        // for(init; termination; increment) {}
        // good code habit to start at 0
        for (int i = 0; i < 5; i++) {
            System.out.println("Loop " + i);
        }

        for (int i = 2; i < 9; i++) {
            System.out.println("10,000 at " + i + "% interest = " + calculateInterest(10000.0, i));
        }
        for (int i = 8; i > 1; i--) {
            System.out.println("10,000 at " + i + "% interest = " + calculateInterest(10000.0, i));
        }

        // ***FOR LOOP CHALLENGE ***
        System.out.println("\nFOR LOOP CHALLENGE\n");


        int count = 0;

        for(int i=10; i<50; i++) {

            if (isPrime(i)) {
                System.out.println("PRIME FOUND: " + i);
                count++;

                if(count == 3) {
                    System.out.println(count + " primes found... exiting loop");
                    break;
                }
            }
        }

    }



    public static boolean isPrime(int n) {

        if(n == 1) {
            return false;
        }

        for(int i=2; i <= n/2; i++) {
            if(n % i == 0) {
                return false;
            }
        }

        return true;
    }

    public static double calculateInterest(double amount, double interestRate) {
        return(amount * (interestRate/100));
    }
}
