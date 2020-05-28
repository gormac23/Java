package com.gormac23;

// Convert pounds to kilograms
public class FloatChallenge {

    public static void main(String[] args) {

        double pounds = 200d;
        double kilograms = pounds * 0.45359237;

        System.out.println(pounds + "lbs in kilograms = "+ kilograms + "kg");

        //NOTE: If precise calculations are needed we use the BigDecimals class
    }
}
