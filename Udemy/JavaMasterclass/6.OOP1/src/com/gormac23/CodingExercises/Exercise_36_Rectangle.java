package com.gormac23.CodingExercises;

public class Exercise_36_Rectangle {

    // instance variables
    private double width;
    private double length;

    // Constructor and initialization
    public Exercise_36_Rectangle(double width, double length) {
        if(width < 0) {
            this.width = 0;
        } else {
            this.width = width;
        }
        if(length < 0) {
            this.length = 0;
        } else {
            this.length = length;
        }
    }

    // Methods
    public double getWidth() {
        return width;
    }

    public double getLength() {
        return length;
    }

    public double getArea() {
        return width * length;
    }
}
