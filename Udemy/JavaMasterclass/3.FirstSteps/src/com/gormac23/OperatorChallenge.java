package com.gormac23;

public class OperatorChallenge {

   // Serious of arithmetic tasks to solve for this problem
    public static void main(String[] args) {

        double num1 = 20.0d;
        double num2 = 80.0d;

        double result = (num1 + num2) * 100d;
        double result2 = result % 40.0d;

        // Good use of the Ternary Operator
        boolean remainderTest = (result2 == 0) ? true : false;
        System.out.println(remainderTest);

        if (!remainderTest) {
            System.out.println("Got some remainder");
        }
    }
}
