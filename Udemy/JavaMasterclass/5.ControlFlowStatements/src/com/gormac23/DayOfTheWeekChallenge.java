package com.gormac23;

public class DayOfTheWeekChallenge {

    public static void main(String[] args) {

        printDayOfTheWeek(-1);
        printDayOfTheWeek(0);
        printDayOfTheWeek(1);
        printDayOfTheWeek(2);
        printDayOfTheWeek(3);
        printDayOfTheWeek(4);
        printDayOfTheWeek(5);
        printDayOfTheWeek(6);
        printDayOfTheWeek(7);

    }

    private static void printDayOfTheWeek(int day) {
        switch (day) {
            case 0:
                System.out.println("Today is Monday");
                break;
            case 1:
                System.out.println("Today is Tueday");
                break;
            case 2:
                System.out.println("Today is Wednesday");
                break;
            case 3:
                System.out.println("Today is Thursday");
                break;
            case 4:
                System.out.println("Today is Friday");
                break;
            case 5:
                System.out.println("Today is Saturday");
                break;
            case 6:
                System.out.println("Today is Sunday");
                break;

            default:
                System.out.println("Invalid Day");
                break;
        }

        if (day == 0) {
            System.out.println("Monday");
        } else if (day == 1) {
            System.out.println("Tuesday");
        } else if (day == 2) {
            System.out.println("Wednesday");
        } else if (day == 3) {
            System.out.println("Thursday");
        } else if (day == 4) {
            System.out.println("Friday");
        } else if (day == 5) {
            System.out.println("Saturday");
        } else if (day == 6) {
            System.out.println("Sunday");
        } else {
            System.out.println("Invalid Day");
        }
    }
}
