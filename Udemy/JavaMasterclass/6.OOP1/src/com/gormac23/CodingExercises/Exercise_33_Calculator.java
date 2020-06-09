package com.gormac23.CodingExercises;


//NOTE: To check solution in Udemy, delete "Exercise_[Number] in-front of class name
// One class of three for this exercise
public class Exercise_33_Calculator {

    private Exercise_33_Floor exercise33Floor;
    private Exercise_33_Carpet exercise33Carpet;

    public Exercise_33_Calculator(Exercise_33_Floor exercise33Floor, Exercise_33_Carpet exercise33Carpet) {
        this.exercise33Floor = exercise33Floor;
        this.exercise33Carpet = exercise33Carpet;
    }

    public double getTotalCost() {
        return this.exercise33Floor.getArea() * this.exercise33Carpet.getCost();
    }
}
