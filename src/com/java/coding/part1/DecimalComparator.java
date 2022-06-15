package com.java.coding.part1;

import java.util.Scanner;

public class DecimalComparator {

    public static boolean areEqualByThreeDecimalPlaces(double num1, double num2) {

        num1 = num1 * 1000;
        num2 = num2 * 1000;

        return (int)num1 == (int)num2;

    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        double num1 = scan.nextDouble();
        double num2 = scan.nextDouble();

        System.out.println(areEqualByThreeDecimalPlaces(num1, num2));
        scan.close();

    }

}
