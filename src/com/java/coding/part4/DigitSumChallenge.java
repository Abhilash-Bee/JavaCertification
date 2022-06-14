package com.java.coding.part4;

import java.util.Scanner;

public class DigitSumChallenge {

    public static int sumDigits(int number) {

        int sum = 0;
        if(number < 10)
            return -1;
        else {
            while(number > 0) {
                int rem = number % 10;
                sum += rem;
                number /= 10;
            }
            return sum;
        }

    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println(sumDigits(scan.nextInt()));

    }

}
