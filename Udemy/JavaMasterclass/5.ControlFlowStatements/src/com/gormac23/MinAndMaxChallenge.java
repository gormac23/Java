package com.gormac23;

import java.util.Scanner;

public class MinAndMaxChallenge {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int min = 0;
        int max = 0;
        boolean first = true; // first number flag to set min/max to first value

        while(true) {
            System.out.print("Enter number: ");

            boolean isInt = scanner.hasNextInt();

            if (isInt) {
                int number = scanner.nextInt();

                if(first) {
                    first = false;
                    min = number;
                    max = number;
                }

                if (number > max) {
                    max = number;
                } else if (number < min) {
                    min = number;
                }

            } else {
                break;
            }
            scanner.nextLine();
        }
        System.out.println("Max = " + max);
        System.out.println("Min = " + min);

        scanner.close();
    }
}
