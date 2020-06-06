package com.gormac23.CodingExercises;


//NOTE: To check solution in Udemy, delete "Exercise_[Number] in-front of class name
public class Exercise_23_NumberToWords {


    public static void numberToWords(int n) {
        if(n < 0) System.out.println("Invalid Value");

        // Count to catch numbers ending in zero
        int digitCount = getDigitCount(n);
        // Reverse number to get the correct order
        // As method prints the number starting with the last digit
        n = reverse(n);
        int reverseCount = getDigitCount(n);

        // Do-while catches if n = 0 as teh switch will print zero before n is tested
        do {
            // Extract the last digit
            int lastDigit = n % 10;

            switch(lastDigit) {
                case 0:
                    System.out.print("Zero ");
                    break;
                case 1:
                    System.out.print("One ");
                    break;
                case 2:
                    System.out.print("Two ");
                    break;
                case 3:
                    System.out.print("Three ");
                    break;
                case 4:
                    System.out.print("Four ");
                    break;
                case 5:
                    System.out.print("Five ");
                    break;
                case 6:
                    System.out.print("Six ");
                    break;
                case 7:
                    System.out.print("Seven ");
                    break;
                case 8:
                    System.out.print("Eight ");
                    break;
                case 9:
                    System.out.print("Nine ");
                    break;
            }

            // Removes last digit and decrements the while loop
            n /= 10;

        } while(n != 0);

        // If the two counts are equal then number has no ending zeros
        // else, print zero and increment reverseCount until the ending zero's are handled
        while(digitCount != reverseCount) {
            System.out.print("Zero ");
            reverseCount ++;
        }
        // Newline for next testcase
        System.out.println();
    }


    // Method to reverse number so to print the words in the right order
    public static int reverse(int n) {
        int reverseNumber = 0;
        // Stores the last digit and pushed it one place to the left by multiplying by 10
        while(n != 0) {
            int lastDigit = n % 10;
            reverseNumber *= 10;
            reverseNumber += lastDigit;
            n /= 10;
        }

        return reverseNumber;
    }


    // Counts the number of digits to catch any numbers ending with zero
    // (as they would be lost when reversed
    public static int getDigitCount(int n) {
        if(n < 0) return -1;

        int count = 0;
        do {
            count++;
            n /= 10;
        } while(n != 0);

        return count;
    }

}
