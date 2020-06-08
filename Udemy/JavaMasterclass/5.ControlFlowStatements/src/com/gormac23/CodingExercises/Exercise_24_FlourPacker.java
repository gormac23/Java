package com.gormac23.CodingExercises;


//NOTE: To check solution in Udemy, delete "Exercise_[Number] in-front of class name
public class Exercise_24_FlourPacker {

    public static boolean canPack(int bigCount, int smallCount, int goal) {
        if(bigCount < 0 || smallCount < 0 || goal < 0) return false;

    if((bigCount * 5 + smallCount) < goal) return false;
    if(bigCount == 0 && smallCount > goal) return true;
    if(smallCount == 0 && (bigCount * 5) % goal == 0) return true;

    int remainderOfBig = goal % 5;
    return (remainderOfBig <= smallCount);

    }
}
