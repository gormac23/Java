package com.gormac23.CodingExercises;

public class Exercise_35_Circle {

    // instance variable
    private double radius;

    // Constructor and idealization of fields
    public Exercise_35_Circle(double radius) {
        if(radius < 0) {
            this.radius = 0;
        } else {
            this.radius = radius;
        }
    }

    // Methods
    public double getRadius() {
        return radius;
    }

    public double getArea() {
        return (radius * radius * Math.PI);
    }
}
