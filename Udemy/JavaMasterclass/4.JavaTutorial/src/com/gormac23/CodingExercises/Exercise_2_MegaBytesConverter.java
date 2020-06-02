package com.gormac23.CodingExercises;

//NOTE: To check solution in Udemy, delete "Exercise_[Number] in-front of class name
public class Exercise_2_MegaBytesConverter {

    public static void printMegaBytesAndKiloBytes(int kiloBytes) {

        if(kiloBytes < 0) {

            System.out.println("Invalid Value");
        } else{

            int megaBytes = kiloBytes / 1024;
            int remainingKiloBytes = kiloBytes % 1024;

            System.out.println(kiloBytes + " KB = " + megaBytes + " MB and " + remainingKiloBytes + " KB");
        }
    }
}
