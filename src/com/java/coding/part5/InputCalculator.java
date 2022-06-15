package com.java.coding.part5;

import java.util.Scanner;

public class InputCalculator {

    public static void inputThenPrintSumAndAverage() {

        Scanner scan = new Scanner(System.in);
        int count = 0, sum = 0;
        while (scan.hasNextInt()) {
            int number = scan.nextInt();
            sum += number;
            count++;
        }
        System.out.println("SUM = " + sum + " AVG = " + Math.round((float)sum/count));

    }

    public static void main(String[] args) {

        inputThenPrintSumAndAverage();

    }

}
