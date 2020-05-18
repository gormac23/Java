package com.gormac23;

// Primitive Type Lesson
public class ByteShortIntLong {

    public static void main(String[] args) {

        // Integer
        int myMinIntValue = Integer.MIN_VALUE;
        int myMaxIntValue = Integer.MAX_VALUE;
        System.out.println("Integer Min Val = " + myMinIntValue);
        System.out.println("Integer Max  Val = " + myMaxIntValue);

        System.out.println("Overflow = " + (myMinIntValue + 1));
        System.out.println("Underflow = " + (myMaxIntValue - 1));

        // Byte
        byte minByteValue = Byte.MIN_VALUE;
        byte maxByteValue = Byte.MAX_VALUE;
        System.out.println("Byte Min Val = " + minByteValue);
        System.out.println("Byte Max  Val = " + maxByteValue);

        // Short
        short minShortValue = Short.MIN_VALUE;
        short maxShortValue = Short.MAX_VALUE;
        System.out.println("Short Min Val = " + minShortValue);
        System.out.println("Short Max  Val = " + maxShortValue);

        // Long
        // NOTE: long values need a L at the end
        long longValue = 100L;

        long minLongValue = Long.MIN_VALUE;
        long maxLongValue = Long.MAX_VALUE;
        System.out.println("Long Min Val = " + minLongValue);
        System.out.println("Long Max  Val = " + maxLongValue);

        // Casting Types
        byte newByteVal = (byte)(maxByteValue / 2);
    }
}
