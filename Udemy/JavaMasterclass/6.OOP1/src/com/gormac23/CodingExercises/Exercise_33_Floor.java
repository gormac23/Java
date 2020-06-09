package com.gormac23.CodingExercises;


//NOTE: To check solution in Udemy, delete "Exercise_[Number] in-front of class name
// One class of three for this exercise
public class Exercise_33_Floor {

    private double width;
    private double length;

    public Exercise_33_Floor(double width, double length) {
        // if width or length < 0, set to 0. Else, initialize both fields
        if (width < 0) this.width = 0;
        else this.width = width;
        if (length < 0) this.length = 0;
        else this.length = length;
        }

    public double getArea() {
        return this.length * this.width;
    }
}
