package com.gormac23;

public class StringDataType {

    // String is technically a class, hence thte capital 'S'
    public static void main(String[] args) {

        // String is a 'string' of characters. It can be used to store lines of text/numbers etc.
        String myString = "This is a string";
        System.out.println("myString is equal to " + myString);

        String numberString = "250.552";
        numberString = numberString + "49.95";
        System.out.println(numberString); //OUTPUT = 250.5549.95
        //NOTE: Sting treats the numbers as textual representations of the data

        String anotherNumString = "10";
        int num = 50;
        anotherNumString = anotherNumString + num;
        System.out.println(anotherNumString); //OUTPUT: 2050
        // NOTE: Strings have a 'higher priority'. It will convert int to text. A cast would be needed to add 10 + 50 here

        // Strings are immutable
        // cannot be changed. a new String must be created
    }
}
