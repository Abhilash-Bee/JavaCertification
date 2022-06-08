package com.java.coding.part3;

import java.util.Scanner;

public class GreatestCommonDivisor {

    public static int getGreatestCommonDivisor(int first, int second) {

        if(first < 10 || second < 10)
            return -1;

        int gcd = Math.min(first, second);
        for(int i=gcd; i>=1; i--)
            if (first % i == 0 && second % i == 0)
                return i;
        return -1;

    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println(getGreatestCommonDivisor(scan.nextInt(), scan.nextInt()));

    }

}
