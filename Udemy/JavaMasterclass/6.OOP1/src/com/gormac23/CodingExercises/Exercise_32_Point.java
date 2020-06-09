package com.gormac23.CodingExercises;

import java.awt.*;

//NOTE: To check solution in Udemy, delete "Exercise_[Number] in-front of class name
public class Exercise_32_Point {

    private int x;
    private int y;

    public Exercise_32_Point() {
    }

    public Exercise_32_Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public double distance() {
        return Math.sqrt(Math.pow(this.x, 2) + Math.pow(this.y, 2));
    }

    public double distance(int x, int y) {
        return Math.sqrt((Math.pow(x - this.x,2)) + (Math.pow(y - this.y, 2)));
    }

    public double distance(Point other) {
        return distance(other.x, other.y);
    }
}

