package com.gormac23;


//Challenge
//Create base class Vehicle, create subclass Car
//should handle steering, changine gears, speed
//Decide where to put appropriate state and behaviours
//Create one more class that is specific type of vehicle

public class Challenge {

    public static void main(String[] args) {

        ChallengeMrBeanCar threeWheeler = new ChallengeMrBeanCar(36);
        threeWheeler.turn(45);
        threeWheeler.accelerate(30);
        threeWheeler.accelerate(20);

    }
}
