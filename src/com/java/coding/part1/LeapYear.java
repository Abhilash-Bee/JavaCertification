package com.java.coding.part1;

import java.util.Scanner;

public class LeapYear {

    public static boolean isLeapYear(int year)
    {
        if(year > 0 && year < 10000) {
            if(year % 4 == 0 && year % 100 != 0)
                return true;
            else
                return year % 400 == 0;
        }
        return false;
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println(isLeapYear(scan.nextInt()));

    }

}