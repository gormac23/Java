package com.gormac23;

// Primitive Type Lesson
public class FloatDouble {

    public static void main(String[] args) {

        // Float
        float myMinFloatValue = Float.MIN_VALUE;
        float myMaxFloatValue = Float.MAX_VALUE;
        System.out.println("Float Min Val = " + myMinFloatValue);
        System.out.println("Float Max  Val = " + myMaxFloatValue);

        // Double
        double myMinDoubleValue = Double.MIN_VALUE;
        double myMaxDoubleValue = Double.MAX_VALUE;
        System.out.println("Double Min Val = " + myMinDoubleValue);
        System.out.println("Double Max  Val = " + myMaxDoubleValue);

        // When decalring floats and doubles,
        // it is good practise to use 'f' and 'd' respectively
        float myFloatVal = 5.25f;
        float myOtherFloatVal = (float) 5.25;
        double myDoubleVal = 5.25;
        double myOtherDoubleVal = 5.25d;
        // NOTE: Double is the preferred value

    }
}
