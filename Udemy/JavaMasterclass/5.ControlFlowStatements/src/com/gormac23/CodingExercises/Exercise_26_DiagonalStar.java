package com.gormac23.CodingExercises;

public class Exercise_26_DiagonalStar {

    public static void printSquareStar(int number) {
        if(number < 5) {
            System.out.println("Invalid Value");
        } else {

            int currentRow = 1;
            while(currentRow <= number) {
                int currentColumn = 1;

                if (currentRow == 1 || currentRow == number) {
                    // Print a full row of stars
                    for (int i = 0; i < number; i++) {
                        System.out.print("*");
                    }
                } else {
                    while (currentColumn <= number) {
                        // prints a full column of stars
                        if (currentColumn == 1 || currentColumn == number) {
                            System.out.print("*");
                            // prints the diagonal
                        } else if (currentColumn == currentRow || currentColumn == number - currentRow + 1) {
                            System.out.print("*");
                            // prints the space in-between where no stars go
                        } else {
                            System.out.print(" ");
                        }
                        currentColumn++;
                    }
                }


                System.out.println();
                currentRow++;
            }
        }
    }
}
