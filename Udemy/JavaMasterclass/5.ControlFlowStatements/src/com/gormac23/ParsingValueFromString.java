package com.gormac23;

public class ParsingValueFromString {

    public static void main(String[] args) {
        String numberAsString = "2020";
        System.out.println("numberAsString =  " + numberAsString);

        // This is important to remember, this changes string to int
        // This is using a wrapper class.
        // NOTE: the capital letter in Integer and not in type int
        int number = Integer.parseInt(numberAsString);
        System.out.println("number = " + number);

        numberAsString += 1;
        number += 1;

        System.out.println("numberAsString = " + numberAsString);
        System.out.println("number = " + number );

        // Works the same with other data types, like double
        String doubleAsString = "2020.5";
        System.out.println("\ndoubleAsString =  " + doubleAsString);

        double decimalNum = Double.parseDouble(doubleAsString);
        System.out.println("Decimal number = " + decimalNum);
    }
}
