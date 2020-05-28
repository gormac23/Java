package com.gormac23;

public class PrimitiveChallenge {

    // Simple test of using proper Primitive types
    public static void main(String[] args) {

        byte byteVal = 5;
        short shortVal = 10;
        int intVal = 100;
        long longVal = 50000L + (byteVal + shortVal + intVal) * 10L;

        System.out.println(longVal);

    }
}
