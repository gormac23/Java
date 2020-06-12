package com.gormac23.CodingExercises;

public class Exercise_35_Cylinder extends Exercise_35_Circle {

    // instance variable
    private double height;

    // Constructor and idealization of fields
    public Exercise_35_Cylinder(double radius, double height) {
        super(radius);
        if(height < 0) {
            this.height = 0;
        } else{
            this.height = height;
        }

    }

    // Methods
    public double getHeight() {
        return height;
    }

    public double getVolume() {
        return getArea() * height;
    }
}

