package com.java.coding.part5;

import java.util.Scanner;

public class PaintJob {

    public static int getBucketCount(double width, double height, double areaPerBucket, int extraBuckets) {

        if(width <= 0 || height <= 0 || areaPerBucket <= 0 || extraBuckets < 0)
            return -1;
        else
            return getBucketCount(width, height, areaPerBucket) - extraBuckets;
    }

    public static int getBucketCount(double width, double height, double areaPerBucket) {

        if(width <= 0 || height <= 0 || areaPerBucket <= 0)
            return -1;

        return getBucketCount(width * height, areaPerBucket);

    }

    public static int getBucketCount(double area, double areaPerBucket) {

        if(area <= 0 || areaPerBucket <= 0)
            return -1;

        return (int) (Math.ceil(area/areaPerBucket));

    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println(getBucketCount(scan.nextDouble(), scan.nextDouble(), scan.nextDouble(), scan.nextInt()));

    }

}
