package com.gormac23;

public class WhileLoop {

    public static void main(String[] args) {
        int count = 0;
        while(count != 6) {
            System.out.println("Count value is " + count);
            count++;
        }

        // Two different ways to use the while loop
        // These but have the same output
        count = 0;
        while(true) {
            if(count == 6) {
                break;
            }
            System.out.println("Count value is " + count);
            count++;
        }

        // There is also a do while loop
        // This always gets executed at least once even if the first expression
        // equals to false
        count = 0;
        do {
            System.out.println("Count value is " + count); // This line always prints
            count++;
        } while(count != 6);


        // WHILE LOOP CHALLENGE
        System.out.println("\nWHILE LOOP CHALLENGE\n");

        count = 0;
        int number = 4;
        int finish =  20;

        while(number <= finish) {
            number++;
            if(!isEvenNumber(number)) {
                continue;
            }

            System.out.println("Even number " + number);
            count++;
            if(count == 5) {
                System.out.println("5 Evens found... exiting loop");
                break;
            }

        }
    }



    private static boolean isEvenNumber(int n) {
        return (n % 2 == 0);
    }
}
