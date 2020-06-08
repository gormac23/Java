package com.gormac23.CodingExercises;

// USING ONE SINGLE MAIN CLASS TO TEST ALL CODING EXERCISES FOR 5.CONTROLFLOWSTATEMENTS
public class MainTest_5 {

    public static void main(String[] args) {

        //EXERCISE 12: NumberInWord
        System.out.println("EXERCISE 12: NumberInWord");
        int i = 0;
        while (i <= 10) {
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


        //EXERCISE 19: LastDigitChecker
        System.out.println("\nEXERCISE 19: LastDigitChecker");
        System.out.println(Exercise_19_LastDigitChecker.hasSameLastDigit(41, 22, 71));
        System.out.println(Exercise_19_LastDigitChecker.hasSameLastDigit(23, 32, 42));
        System.out.println(Exercise_19_LastDigitChecker.hasSameLastDigit(9, 99, 999));
        System.out.println(Exercise_19_LastDigitChecker.isValid(10));
        System.out.println(Exercise_19_LastDigitChecker.isValid(468));
        System.out.println(Exercise_19_LastDigitChecker.isValid(1051));


        //EXERCISE 20: GreatestCommonDivisor
        System.out.println("\nEXERCISE 20: GreatestCommonDivisor");
        System.out.println(Exercise_20_GreatestCommonDivisor.getGreatestCommonDivisor(25, 15));
        System.out.println(Exercise_20_GreatestCommonDivisor.getGreatestCommonDivisor(12, 30));
        System.out.println(Exercise_20_GreatestCommonDivisor.getGreatestCommonDivisor(9, 18));
        System.out.println(Exercise_20_GreatestCommonDivisor.getGreatestCommonDivisor(81, 153));


        //EXERCISE 21: FactorPrinter
        System.out.println("\nEXERCISE 21: FactorPrinter");
        Exercise_21_FactorPrinter.printFactors(6);
        Exercise_21_FactorPrinter.printFactors(32);
        Exercise_21_FactorPrinter.printFactors(10);
        Exercise_21_FactorPrinter.printFactors(-1);

        //EXERCISE 22: PerfectNumber
        System.out.println("\nEXERCISE 22: PerfectNumber");
        System.out.println(Exercise_22_PerfectNumber.isPerfectNumber(6));
        System.out.println(Exercise_22_PerfectNumber.isPerfectNumber(28));
        System.out.println(Exercise_22_PerfectNumber.isPerfectNumber(5));


        //EXERCISE 23: NumberToWords
        System.out.println("\nEXERCISE 23: NumberToWords");
        System.out.println(Exercise_23_NumberToWords.getDigitCount(0));
        System.out.println(Exercise_23_NumberToWords.getDigitCount(123));
        System.out.println(Exercise_23_NumberToWords.getDigitCount(-123));
        System.out.println(Exercise_23_NumberToWords.getDigitCount(5200));
        System.out.println(Exercise_23_NumberToWords.reverse(0));
        System.out.println(Exercise_23_NumberToWords.reverse(1212));
        System.out.println(Exercise_23_NumberToWords.reverse(1234));
        System.out.println(Exercise_23_NumberToWords.reverse(100));
        Exercise_23_NumberToWords.numberToWords(0);
        Exercise_23_NumberToWords.numberToWords(1010);
        Exercise_23_NumberToWords.numberToWords(1000);
        Exercise_23_NumberToWords.numberToWords(-12);


        //EXERCISE 24: FlourPacker
        System.out.println("\nEXERCISE 24: FlourPacker");
        System.out.println(Exercise_24_FlourPacker.canPack(1, 0, 4));
        System.out.println(Exercise_24_FlourPacker.canPack(1, 0, 5));
        System.out.println(Exercise_24_FlourPacker.canPack(0, 5, 4));
        System.out.println(Exercise_24_FlourPacker.canPack(2, 2, 11));
        System.out.println(Exercise_24_FlourPacker.canPack(-3, 2, 12));


        //EXERCISE 25: LargestPrime
        System.out.println("\nEXERCISE 25: LargestPrime");
        System.out.println(Exercise_25_LargestPrime.getLargestPrime(21));
        System.out.println(Exercise_25_LargestPrime.getLargestPrime(217));
        System.out.println(Exercise_25_LargestPrime.getLargestPrime(0));
        System.out.println(Exercise_25_LargestPrime.getLargestPrime(45));
        System.out.println(Exercise_25_LargestPrime.getLargestPrime(-1));


        //EXERCISE 26: DiagonalStar
        System.out.println("\nEXERCISE 26: DiagonalStar");
        Exercise_26_DiagonalStar.printSquareStar(5);
        System.out.println("\n");
        Exercise_26_DiagonalStar.printSquareStar(8);


        //EXERCISE 27: InputCalculator
        System.out.println("\nEXERCISE 27: InputCalculator");
        System.out.println("**Commented out tests as they require user input**");
        //Exercise_27_InputCalculator.inputThenPrintSumAndAverage();


        //EXERCISE 28: PaintJob
        System.out.println("\nEXERCISE 28: PaintJob");
        System.out.println(Exercise_28_PaintJob.getBucketCount(3.4,2.1,1.5,2));
        System.out.println(Exercise_28_PaintJob.getBucketCount(2.75,3.25,2.5,1));
        System.out.println(Exercise_28_PaintJob.getBucketCount(3.4, 2.1, 1.5));
        System.out.println(Exercise_28_PaintJob.getBucketCount(7.25, 4.3, 2.35));
        System.out.println(Exercise_28_PaintJob.getBucketCount(3.4, 1.5));
        System.out.println(Exercise_28_PaintJob.getBucketCount(6.26, 2.2));



    }
}