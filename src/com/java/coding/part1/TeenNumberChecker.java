package com.java.coding.part1;

import java.util.Scanner;

public class TeenNumberChecker {

    public static boolean hasTeen(int a, int b, int c) {

        return (a >= 13 && a <= 19) || (b >= 13 && b <= 19) || (c >= 13 && c <= 19);

    }

    public static boolean isTeen(int a) {

        return a >= 13 && a <= 19;

    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println(hasTeen(scan.nextInt(), scan.nextInt(), scan.nextInt()));
        System.out.println(isTeen(scan.nextInt()));

    }

}