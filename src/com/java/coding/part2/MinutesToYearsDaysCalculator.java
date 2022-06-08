package com.java.coding.part2;

import java.util.Scanner;

public class MinutesToYearsDaysCalculator {

    public static void printYearsAndDays(long minutes) {

        if(minutes < 0)
            System.out.println("Invalid Value");
        else {

            long hours = minutes/60;
            long days = hours/24;
            long exactDays = days % 365;
            long years = days/365;
            System.out.println(minutes + " min = " + years + " y and " + exactDays + " d");

        }

    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        printYearsAndDays(scan.nextLong());

    }

}