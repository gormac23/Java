package com.gormac23.CodingExercises;


//NOTE: To check solution in Udemy, delete "Exercise_[Number] in-front of class name
public class Exercise_28_PaintJob {

    public static int getBucketCount(double width, double height, double areaPerBucket, int extraBuckets) {
        if(width <= 0 || height <= 0 || areaPerBucket <= 0 || extraBuckets < 0) return -1;

        double wallArea = width * height;
        double hasPaint = extraBuckets * areaPerBucket;
        double bucketsNeeded = Math.ceil((wallArea - hasPaint) / areaPerBucket);

        return (int)bucketsNeeded;
    }

    public static int getBucketCount(double width, double height, double areaPerBucket) {
        if(width <= 0 || height <= 0 || areaPerBucket <= 0) return -1;

        double wallArea = width * height;
        double bucketsNeeded = Math.ceil((wallArea) / areaPerBucket);

        return (int)bucketsNeeded;
    }

    public static int getBucketCount(double area, double areaPerBucket) {
        if(area <= 0 || areaPerBucket <= 0) return -1;

        return (int) Math.ceil((area) / areaPerBucket);
    }
}

