package com.java.coding.part3;

import java.util.Scanner;

public class EvenDigitSum {

    public static int getEvenDigitSum(int number) {

        if(number < 0)
            return -1;

        int sum = 0;
        while(number > 0) {
            int rem = number % 10;
            if(rem % 2 == 0)
                sum += rem;
            number /= 10;
        }

        return sum;

    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println(getEvenDigitSum(scan.nextInt()));

    }

}
