package com.gormac23;

import java.util.Scanner;

public class ReadingUserInputChallenge {

    public static void main(String[] args) {

        // Set up the scanner for user input
        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        int count = 1;

        while(count <= 10) {

            // Ask user for inout
            System.out.print("Enter number #" + count + ": ");
            // Checks number validation
            boolean hasNextInt = scanner.hasNextInt();
            if(hasNextInt) {
                sum += scanner.nextInt();
                count++;
            } else {
                System.out.println("Invalid Number");
            }
            scanner.nextLine();

        }

        System.out.println("Your total = " + sum);
        scanner.close();
    }
}
