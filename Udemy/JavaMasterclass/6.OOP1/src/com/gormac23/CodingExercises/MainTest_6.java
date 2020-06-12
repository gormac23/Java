package com.gormac23.CodingExercises;

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


        //EXERCISE 32: Point
        System.out.println("\nEXERCISE 31: Point");
        Exercise_32_Point first = new Exercise_32_Point(6, 5);
        Exercise_32_Point second = new Exercise_32_Point(3, 1);
        System.out.println("Dst(0,0) = " + first.distance());
        System.out.println("dst(second) = " + first.distance(second));


        //EXERCISE 33: Carpet
        System.out.println("\nEXERCISE 33: Carpet");
        Exercise_33_Carpet carpet = new Exercise_33_Carpet(3.5);
        Exercise_33_Floor floor = new Exercise_33_Floor(2.75, 4.0);
        Exercise_33_Calculator carpetCalculator = new Exercise_33_Calculator(floor, carpet);
        System.out.println("total = " + carpetCalculator.getTotalCost());


        //EXERCISE 34: ComplexNumber
        System.out.println("\nEXERCISE 34: Exercise_34_ComplexNumber");
        Exercise_34_ComplexNumber one = new Exercise_34_ComplexNumber(1.0, 1.0);
        Exercise_34_ComplexNumber number = new Exercise_34_ComplexNumber(2.5, -1.5);
        one.add(1,1);
        System.out.println("one.real = " + one.getReal());
        System.out.println("one.imaginary = " + one.getImaginary());
        one.subtract(number);
        System.out.println("one.real = " + one.getReal());
        System.out.println("one.imaginary = " + one.getImaginary());


        //EXERCISE 36: PoolArea
        System.out.println("\nEXERCISE 34: Exercise_36_PoolArea");
        Exercise_36_Rectangle exercise36Rectangle = new Exercise_36_Rectangle(5, 10);
        System.out.println("exercise36Rectangle.width = " + exercise36Rectangle.getWidth());
        System.out.println("exercise36Rectangle.length = " + exercise36Rectangle.getLength());
        System.out.println("exercise36Rectangle.area = " + exercise36Rectangle.getArea());
        Exercise_36_Cuboid exercise36Cuboid = new Exercise_36_Cuboid(5, 10, 5);
        System.out.println("exercise36Cuboid.width + " + exercise36Cuboid.getWidth());
        System.out.println("exercise36Cuboid.length + " + exercise36Cuboid.getLength());
        System.out.println("exercise36Cuboid.area + " + exercise36Cuboid.getArea());
        System.out.println("exercise36Cuboid.height + " + exercise36Cuboid.getHeight());
        System.out.println("exercise36Cuboid.volume + " + exercise36Cuboid.getVolume());




    }
}