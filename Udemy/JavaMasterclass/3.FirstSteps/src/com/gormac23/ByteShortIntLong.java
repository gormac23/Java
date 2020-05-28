package com.gormac23;

// Primitive Type Lesson
public class ByteShortIntLong {

    public static void main(String[] args) {

        // Integer
        int myMinIntValue = Integer.MIN_VALUE;
        int myMaxIntValue = Integer.MAX_VALUE;
        System.out.println("Integer Min Value = " + myMinIntValue);
        System.out.println("Integer Max  Value = " + myMaxIntValue);

        System.out.println("Overflow = " + (myMinIntValue + 1));
        System.out.println("Underflow = " + (myMaxIntValue - 1));

        // Byte
        byte minByteValue = Byte.MIN_VALUE;
        byte maxByteValue = Byte.MAX_VALUE;
        System.out.println("Byte Min Value = " + minByteValue);
        System.out.println("Byte Max  Value = " + maxByteValue);

        // Short
        short minShortValue = Short.MIN_VALUE;
        short maxShortValue = Short.MAX_VALUE;
        System.out.println("Short Min Value = " + minShortValue);
        System.out.println("Short Max  Value = " + maxShortValue);

        // Long
        // NOTE: long values need a L at the end
        long longValue = 100L;

        long minLongValue = Long.MIN_VALUE;
        long maxLongValue = Long.MAX_VALUE;
        System.out.println("Long Min Value = " + minLongValue);
        System.out.println("Long Max  Value = " + maxLongValue);

        // Casting Types
        byte newByteVal = (byte)(maxByteValue / 2);
    }
}
