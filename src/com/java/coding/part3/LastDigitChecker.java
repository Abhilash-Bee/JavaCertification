package com.java.coding.part3;

import java.util.Scanner;

public class LastDigitChecker {

    public static boolean hasSameLastDigit(int a, int b, int c) {

        if(a > 9 && a < 1001 && b > 9 && b < 1001 && c > 9 && c < 1001) {
            if(a % 10 == b % 10 || a % 10 == c % 10)
                return true;
            else return b % 10 == c % 10;
        }
        return false;

    }

    public static boolean isValid(int a) {

        return a > 9 && a < 1001;

    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println(hasSameLastDigit(scan.nextInt(), scan.nextInt(), scan.nextInt()));
        System.out.println(isValid(scan.nextInt()));

    }

}
