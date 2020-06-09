package com.gormac23.CodingExercises;

import java.awt.*;

// USING ONE SINGLE MAIN CLASS TO TEST ALL CODING EXERCISES FOR 6.OOP
public class MainTest_6 {

    public static void main(String[] args) {

        //EXERCISE 29: SimpleCalculator
        System.out.println("EXERCISE 29: SimpleCalculator");
        Exercise_29_SimpleCalculator calculator = new Exercise_29_SimpleCalculator();
        calculator.setFirstNumber(5.0);
        calculator.setSecondNumber(4);
        System.out.println("add = " + calculator.getAdditionResult());
        System.out.println("subtract = " + calculator.getSubtractionResult());
        calculator.setFirstNumber(5.25);
        calculator.setSecondNumber(0);
        System.out.println("multiply = " + calculator.getMultiplicationResult());
        System.out.println("divide = " + calculator.getDivisionResult());


        //EXERCISE 30: Person
        System.out.println("\nEXERCISE 30: Person");
        Exercise_30_Person person = new Exercise_30_Person();
        person.setFirstName("Dipper");
        person.setLastName("Pines");
        person.setAge(12);
        System.out.println("Full name = " + person.getFullName());
        System.out.println("teen = " + person.isTeen());


        //EXERCISE 31: Wall
        System.out.println("\nEXERCISE 31: Wall");
        Exercise_31_Wall wall = new Exercise_31_Wall(5, 4);
        System.out.println("Area = " + wall.getArea());
        wall.setHeight(-1.5);
        System.out.println("width = " + wall.getWidth());
        System.out.println("height = " + wall.getWidth());
        System.out.println("Area = " + wall.getArea());


        //EXERCISE 31: Point
        System.out.println("\nEXERCISE 31: Point");
        Exercise_32_Point first = new Exercise_32_Point(6, 5);
        Exercise_32_Point second = new Exercise_32_Point(3, 1);
        System.out.println("Dst(0,0) = " + first.distance());
        System.out.println("dst(second) = " + first.distance(second));




    }
}