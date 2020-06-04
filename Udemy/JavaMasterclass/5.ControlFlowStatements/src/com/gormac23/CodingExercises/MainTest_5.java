package com.gormac23.CodingExercises;

// USING ONE SINGLE MAIN CLASS TO TEST ALL CODING EXERCISES FOR 5.CONTROLFLOWSTATEMENTS
public class MainTest_5 {

    public static void main(String[] args) {

        //EXERCISE 12: NumberInWord
        System.out.println("EXERCISE 12: NumberInWord");
        int i = 0;
        while(i <= 10) {
            Exercise_12_NumberInWord.printNumberInWord(i);
            i += 1;
        }


        //EXERCISE 13: NumberOfDaysInMonth
        System.out.println("\nEXERCISE 13: NumberOfDaysInMonth");
        System.out.println(Exercise_13_NumberOfDaysInMonth.isLeapYear(-1600));
        System.out.println(Exercise_13_NumberOfDaysInMonth.isLeapYear(1600));
        System.out.println(Exercise_13_NumberOfDaysInMonth.isLeapYear(2017));
        System.out.println(Exercise_13_NumberOfDaysInMonth.isLeapYear(2000));
        System.out.println(Exercise_13_NumberOfDaysInMonth.getDaysInMonth(1, 2020));
        System.out.println(Exercise_13_NumberOfDaysInMonth.getDaysInMonth(2, 2020));
        System.out.println(Exercise_13_NumberOfDaysInMonth.getDaysInMonth(2, 2018));
        System.out.println(Exercise_13_NumberOfDaysInMonth.getDaysInMonth(-1, 2020));
        System.out.println(Exercise_13_NumberOfDaysInMonth.getDaysInMonth(1, -2020));


    }
}