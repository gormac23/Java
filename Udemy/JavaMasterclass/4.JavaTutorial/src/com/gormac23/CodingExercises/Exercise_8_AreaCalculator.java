package com.gormac23.CodingExercises;


//NOTE: To check solution in Udemy, delete "Exercise_[Number] in-front of class name
public class Exercise_8_AreaCalculator {

    public static double area(double radius) {
         if(radius < 0) {
             return -1;
         } else {
             double area = Math.pow(radius, 2) * Math.PI;
             return area;
         }
    }

    public static double area(double x, double y) {
        if(x < 0 || y < 0) {
            return -1;
        } else {
            double area = x * y;
            return area;
        }
    }
}
