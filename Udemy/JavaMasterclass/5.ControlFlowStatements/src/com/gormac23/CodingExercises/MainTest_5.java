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


        //EXERCISE 14: SumOddRange
        System.out.println("\nEXERCISE 14: SumOddRange");
        System.out.println(Exercise_14_SumOddRange.sumOdd(1, 100));
        System.out.println(Exercise_14_SumOddRange.sumOdd(-1, 100));
        System.out.println(Exercise_14_SumOddRange.sumOdd(100, 100));
        System.out.println(Exercise_14_SumOddRange.sumOdd(13, 13));
        System.out.println(Exercise_14_SumOddRange.sumOdd(100, 1000));


        //EXERCISE 15: NumberPalindrome
        System.out.println("\nEXERCISE 15: NumberPalindrome");
        System.out.println(Exercise_15_NumberPalindrome.isPalindrome(-1221));
        System.out.println(Exercise_15_NumberPalindrome.isPalindrome(707));
        System.out.println(Exercise_15_NumberPalindrome.isPalindrome(21));


        //EXERCISE 16: FirstLastDigitSum
        System.out.println("\nEXERCISE 16: FirstLastDigitSum");
        System.out.println(Exercise_16_FirstLastDigitSum.sumFirstAndLastDigit(101));
        System.out.println(Exercise_16_FirstLastDigitSum.sumFirstAndLastDigit(1257));
        System.out.println(Exercise_16_FirstLastDigitSum.sumFirstAndLastDigit(0));
        System.out.println(Exercise_16_FirstLastDigitSum.sumFirstAndLastDigit(5));
        System.out.println(Exercise_16_FirstLastDigitSum.sumFirstAndLastDigit(-252));


        //EXERCISE 17: EvenDigitSum
        System.out.println("\nEXERCISE 17: EvenDigitSum");
        System.out.println(Exercise_17_EvenDigitSum.getEvenDigitSum(123456789));
        System.out.println(Exercise_17_EvenDigitSum.getEvenDigitSum(252));
        System.out.println(Exercise_17_EvenDigitSum.getEvenDigitSum(-22));


        //EXERCISE 18: SharedDigit
        System.out.println("\nEXERCISE 18: SharedDigit");
        System.out.println(Exercise_18_SharedDigit.hasSharedDigit(12, 23));
        System.out.println(Exercise_18_SharedDigit.hasSharedDigit(9, 99));
        System.out.println(Exercise_18_SharedDigit.hasSharedDigit(15, 55));

    }
}