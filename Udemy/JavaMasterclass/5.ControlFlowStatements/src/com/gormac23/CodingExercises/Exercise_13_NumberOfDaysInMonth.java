package com.gormac23.CodingExercises;


//NOTE: To check solution in Udemy, delete "Exercise_[Number] in-front of class name
public class Exercise_13_NumberOfDaysInMonth {

    public static boolean isLeapYear(int year) {
        if(year < 1 || year > 9999) {
            return false;
        } else return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    public static int getDaysInMonth(int month, int year) {
        if((month < 1 || month > 9999) || (year < 1 || year > 9999)) {
            return -1;
        } else if(isLeapYear(year) && month == 2) {
            return 29;
        } else {
            switch(month) {

                case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                    return 31;

                case 2:     // February
                    return 28;

                case 4: case 6: case 9: case 11:   // September, April, June, November
                    return 30;

            }
        }
        return -1;
    }
}
