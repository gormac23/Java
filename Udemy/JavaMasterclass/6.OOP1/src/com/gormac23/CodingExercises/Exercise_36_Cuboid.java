package com.gormac23.CodingExercises;

public class Exercise_36_Cuboid extends Exercise_36_Rectangle {

    // instance variable
    private double height;

    // Constructor and initialization of fields

    public Exercise_36_Cuboid(double width, double length, double height) {
        super(width, length);
        if(height < 0) {
            this.height = 0;
        } else {
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
