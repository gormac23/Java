package com.gormac23.CodingExercises;


//NOTE: To check solution in Udemy, delete "Exercise_[Number] in-front of class name
// One class of three for this exercise
public class Exercise_33_Carpet {

    private double cost;

    public double getCost() {
        return cost;
    }

    public Exercise_33_Carpet(double cost) {
        if(cost < 0) this.cost = 0;
        else this.cost = cost;


    }
}
