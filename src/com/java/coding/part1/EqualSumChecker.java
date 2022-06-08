package com.java.coding.part1;

import java.util.Scanner;

public class EqualSumChecker {

    public static boolean hasEqualSum(int a, int b, int c)
    {
        return a + b == c;
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println(hasEqualSum(scan.nextInt(), scan.nextInt(), scan.nextInt()));

    }

}