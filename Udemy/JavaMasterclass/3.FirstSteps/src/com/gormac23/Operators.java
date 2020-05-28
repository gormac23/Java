package com.gormac23;

public class Operators {

    public static void main(String[] args) {

        // Mathematical Operators
        int result = 1 + 2; // 1 + 2 = 3
        int previousResult = result;
        System.out.println("1 + 2 = " + result);
        result = result - 1; // 3 - 1 = 2
        System.out.println("3 - 2 = " + result);
        System.out.println("Previous Result = " + previousResult);

        result = result * 2; // 2 * 2 = 4
        previousResult = result;
        System.out.println("2 * 2 = " + result);
        result = result / 4; // 4 / 4 = 1
        System.out.println("4 / 4 = " + result);
        System.out.println("Previous Result = " + previousResult);

        result = 10 % 3; // gives remainder
        System.out.println("10 % 3 = " + result);

        //result = result + 1
        result ++;
        System.out.println("Result ++ = " + result);

        //result = result - 1
        result --;
        System.out.println("Result -- = " + result);

        // NOTE: result++ and ++result are different.
        // placement of this unary operator is important
        // result++ does the operation after the variable
        //
        // EXAMPLE
        // int result = 10;
        // System.out.println(result++); Outputs 10 then assigns result = 11
        // System.out.println(++result); Outputs 11 then assigns result = 11
    }
}
