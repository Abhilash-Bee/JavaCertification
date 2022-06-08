package com.java.coding.part2;

import java.util.Scanner;

public class IntEqualityPrinter {

    public static void printEqual(int a, int b, int c) {

        if(a < 0 || b < 0 || c < 0)
            System.out.println("Invalid Value");
        else if(a == b && a == c)
            System.out.println("All numbers are equal");
        else if(a == b || b == c || a == c)
            System.out.println("Neither all are equal or different");
        else
            System.out.println("All numbers are different");

    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        printEqual(scan.nextInt(), scan.nextInt(), scan.nextInt());

    }

}