package com.gormac23.CodingExercises;


//NOTE: To check solution in Udemy, delete "Exercise_[Number] in-front of class name
public class Exercise_31_Wall {

    private double width;
    private double height;

    public Exercise_31_Wall() {
        this(0.0, 0.0);
    }

    public Exercise_31_Wall(double width, double height) {
        if(width < 0) {
            this.width = 0.0;
        } else {
            this.width = width;
        }
        if(height < 0) {
            this.height = 0.0;
        } else {
            this.height = height;
        }
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        if(width < 0) {
            this.width = 0.0;
        } else {
            this.width = width;
        }
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        if(height < 0) {
            this.height = 0.0;
        } else {
            this.height = height;
        }
    }

    public double getArea() {
        return this.height * this.width;
    }
}
