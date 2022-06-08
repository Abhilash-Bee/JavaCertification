package com.java.coding.part1;

import java.util.Scanner;

public class SpeedConverter {

    public static long toMilesPerHour(double kilometersPerHour) {

        if(kilometersPerHour >= 0)
            return (long) Math.round(kilometersPerHour / 1.609);
        else
            return -1;

    }

    public static void printConversion(double kilometersPerHour) {

        if(kilometersPerHour >= 0)
            System.out.println(kilometersPerHour + " km/h = " + (long) Math.round(kilometersPerHour / 1.609) + " mi/h");
        else
            System.out.println("Invalid Value");

    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println(toMilesPerHour(scan.nextDouble()));
        printConversion(scan.nextDouble());

    }

}