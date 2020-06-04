package com.gormac23;

public class SwitchStatement {

    public static void main(String[] args) {
        int value = 3;
        if (value == 1) {
            System.out.println("Value is 1");
        } else if (value == 2) {
            System.out.println("Value is 2");
        } else {
            System.out.println("Value not 1 or 2");
        }

        // Using the switch statement, can simplify using an if, if-else, if-else, else block
        int switchValue = 3;

        switch(switchValue) {
            case 1:
                System.out.println("Value = 1");
                break;

            case 2:
                System.out.println("Value = 2");
                break;

            case 3: case 4:
                System.out.println("Value = 3");
                System.out.println("Or value was 4");
                break;

            default:
                System.out.println("Value greater than 4");
                break;
        }

        // SWITCH STATEMENT CHALLENGE

        char switchChar = 'C';

        switch(switchChar) {
            case 'A':
                System.out.println("The answer was A!");
                break;

            case 'B':
                System.out.println("The answer was B!");
                break;

            case 'C':
                System.out.println("The answer was C!");
                break;

            case 'D':
                System.out.println("The answer was D!");
                break;

            default:
                System.out.println("The answer was not found");
                break;
        }

        String month = "January";
        switch (month.toLowerCase()) {
            case "january":
                System.out.println("Jan");
                break;
            case "february":
                System.out.println("Feb");
                break;
            case "march":
                System.out.println("Mar");
                break;

            default:
                System.out.println("Not sure");
                break;
        }
    }
}
