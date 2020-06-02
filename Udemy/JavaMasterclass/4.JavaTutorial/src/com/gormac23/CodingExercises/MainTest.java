package com.gormac23.CodingExercises;

// USING ONE SINGLE MAIN CLASS TO TEST ALL CODING EXERCISES FOR 4.JAVATUTORIAL
public class MainTest {

    public static void main(String[] args) {

        //EXERCISE 1: SpeedConverter
        System.out.println("EXERCISE 1: SpeedConverter");
        long miles = Exercise_1_SpeedConverter.toMilesPerHour(10.5);
        System.out.println("Miles = " + miles);

        Exercise_1_SpeedConverter.printConversion(10.5);


        //EXERCISE 2: MegaBytesConverter
        System.out.println("\nEXERCISE 2: MegaBytesConverter");
        Exercise_2_MegaBytesConverter.printMegaBytesAndKiloBytes(2500);
        Exercise_2_MegaBytesConverter.printMegaBytesAndKiloBytes(-1024);
        Exercise_2_MegaBytesConverter.printMegaBytesAndKiloBytes(5000);


        //EXERCISE 3: BarkingDog
        System.out.println("\nEXERCISE 3: BarkingDog");
        System.out.println(Exercise_3_BarkingDog.shouldWakeUp(true, 1));
        System.out.println(Exercise_3_BarkingDog.shouldWakeUp(false, 2));
        System.out.println(Exercise_3_BarkingDog.shouldWakeUp(true, 8));
        System.out.println(Exercise_3_BarkingDog.shouldWakeUp(true, -1));



        //EXERCISE 4: LeapYear
        System.out.println("\nEXERCISE 4: LeapYear");
        System.out.println(Exercise_4_LeapYear.isLeapYear(-1600));
        System.out.println(Exercise_4_LeapYear.isLeapYear(1600));
        System.out.println(Exercise_4_LeapYear.isLeapYear(2017));
        System.out.println(Exercise_4_LeapYear.isLeapYear(2000));


        //EXERCISE 5: DecimalComparator
        System.out.println("\nEXERCISE 5: DecimalComparator");
       System.out.println(Exercise_5_DecimalComparator.areEqualByThreeDecimalPlaces(-3.1756, -3.175));
       System.out.println(Exercise_5_DecimalComparator.areEqualByThreeDecimalPlaces(3.175, 3.176));
       System.out.println(Exercise_5_DecimalComparator.areEqualByThreeDecimalPlaces(3.0, 3.0));
       System.out.println(Exercise_5_DecimalComparator.areEqualByThreeDecimalPlaces(-3.123, 3.123));


        //EXERCISE 6: EqualSumChecker
        System.out.println("\nEXERCISE 6: EqualSumChecker");
        System.out.println(Exercise_6_EqualSumChecker.hasEqualSum(1,1,1));
        System.out.println(Exercise_6_EqualSumChecker.hasEqualSum(1,1,2));
        System.out.println(Exercise_6_EqualSumChecker.hasEqualSum(1,-1,0));


        //EXERCISE 7: TeenNumberChecker
        System.out.println("\nEXERCISE 7: TeenNumberChecker");
        System.out.println(Exercise_7_TeenNumberChecker.hasTeen(9, 99, 19));
        System.out.println(Exercise_7_TeenNumberChecker.hasTeen(23, 15, 42));
        System.out.println(Exercise_7_TeenNumberChecker.hasTeen(22, 23, 34));

        System.out.println(Exercise_7_TeenNumberChecker.isTeen(9));
        System.out.println(Exercise_7_TeenNumberChecker.isTeen(13));


        //EXERCISE 8: AreaCalculator
        System.out.println("\nEXERCISE 8: AreaCalculator");
        System.out.println(Exercise_8_AreaCalculator.area(5.0));
        System.out.println(Exercise_8_AreaCalculator.area(-1));
        System.out.println(Exercise_8_AreaCalculator.area(5.0, 4.0));
        System.out.println(Exercise_8_AreaCalculator.area(-1.0, 4.0));


        //EXERCISE 9: MinutesToYearsDaysCalculator
        System.out.println("\nEXERCISE 9: MinutesToYearsDaysCalculator");
        Exercise_9_MinutesToYearsDaysCalculator.printYearsAndDays(525600);
        Exercise_9_MinutesToYearsDaysCalculator.printYearsAndDays(1051200);
        Exercise_9_MinutesToYearsDaysCalculator.printYearsAndDays(561600);


        //EXERCISE 10: IntEqualityPrinter
        System.out.println("\nEXERCISE 10: IntEqualityPrinter");
        Exercise_10_IntEqualityPrinter.printEqual(1, 1, 1);
        Exercise_10_IntEqualityPrinter.printEqual(1, 1, 2);
        Exercise_10_IntEqualityPrinter.printEqual(-1, -1, -1);
        Exercise_10_IntEqualityPrinter.printEqual(1, 2, 3);


        //EXERCISE 11: PlayingCat
        System.out.println("\nEXERCISE 11: PlayingCat");
        System.out.println(Exercise_11_PlayingCat.isCatPlaying(true, 10));
        System.out.println(Exercise_11_PlayingCat.isCatPlaying(false, 36));
        System.out.println(Exercise_11_PlayingCat.isCatPlaying(false, 35));
    }
}
