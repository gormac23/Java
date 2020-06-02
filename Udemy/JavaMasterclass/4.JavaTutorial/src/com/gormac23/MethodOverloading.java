package com.gormac23;

public class MethodOverloading {

    public static void main(String[] args) {
        int newScore = calculateScore("Colin", 500);
        System.out.println("New score is " + newScore);
        calculateScore(75);
        calculateScore("JimBob");
        calculateScore();

        calcFeetAndInchesToCentimeters(1,2);
        calcFeetAndInchesToCentimeters(13);
        calcFeetAndInchesToCentimeters(-1,13);
        calcFeetAndInchesToCentimeters(6,14);
        calcFeetAndInchesToCentimeters(6,0);

    }
    // Created method with two paramaters with two types: String and int
    public static int calculateScore(String playerName, int score) {
        System.out.println("Player " + playerName + " scored " + score + " points");
        return score * 1000;
    }

    // Created method with same name but only one parameter: int
    public static int calculateScore(int score) {
        System.out.println("Unnamed player scored " + score + " points");
        return score * 1000;
    }

    // Created method with same name but only one parameter: int
    public static void calculateScore(String name) {
        System.out.println("Player " + name + " didn't score any points!");
    }

    // Created method with no parameter
    public static int calculateScore() {
        System.out.println("No player name, no player score");
        return 0;
    }

    //NOTE: one parameter with type int is different than one parameter with type String
    //ALSO: changing the return type is also not enough to define a different overloaded method

    //METHOD OVERLOADING CHALLENGE
    public static double calcFeetAndInchesToCentimeters(double feet, double inches) {
        if (feet < 0 || inches < 0 || inches >= 12) {
            return -1;
        } else {
            // 1 ft = 12 in
            // 1 in = 2.54 cm
            double convertedInches = inches + (feet * 12);
            double centimeters = convertedInches * 2.54;

            System.out.println(feet + " feet and " + inches + " inches = " + centimeters + " cm");
            return centimeters;
        }
    }

    public static double calcFeetAndInchesToCentimeters(double inches) {
        if (inches < 0) {
            return -1;
        } else if (inches < 12) {
            return calcFeetAndInchesToCentimeters(0, inches);
        } else {
            double newInches = inches % 12;
            double feet = (inches - newInches) / 12;
            System.out.println(inches + " inches converts to ") ;
             return calcFeetAndInchesToCentimeters(feet, newInches);
        }
    }

}
