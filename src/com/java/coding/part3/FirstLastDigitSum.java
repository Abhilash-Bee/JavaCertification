package com.java.coding.part3;

import java.util.Scanner;

public class FirstLastDigitSum {

    public static int sumFirstAndLastDigit(int number) {

        if(number < 0)
            return -1;

        String num = number + "";
        return Integer.parseInt(num.charAt(0) + "") + Integer.parseInt(num.charAt(num.length()-1) + "");

    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println(sumFirstAndLastDigit(scan.nextInt()));

    }

}
