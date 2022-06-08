package com.java.coding.part1;

import java.util.Scanner;

public class BarkingDog {

    public static boolean shouldWakeUp(boolean barking, int hourOfDay) {
        if(hourOfDay < 0 || hourOfDay > 23)
            return false;
        else
            return barking && (hourOfDay < 8 || hourOfDay > 22);
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println(shouldWakeUp(scan.nextBoolean(), scan.nextInt()));

    }

}