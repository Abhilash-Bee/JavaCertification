package com.java.coding.part4;

import java.util.Scanner;

public class LargestPrime {

    public static int getLargestPrime(int number) {

        for(int i=number; i>=2; i--) {
            int count = 0;
            for (int j=2; j<=i/2; j++) {
                if (i % j == 0)
                    count++;
            }
            if(count == 0 && number % i == 0)
                return i;
        }
        return -1;
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println(getLargestPrime(scan.nextInt()));

    }

}
