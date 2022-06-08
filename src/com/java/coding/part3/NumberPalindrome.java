package com.java.coding.part3;

import java.util.Scanner;

public class NumberPalindrome {

    public static boolean isPalindrome(int number) {

        if(number < 0)
            number *= -1;

        StringBuilder sb = new StringBuilder(number + "").reverse();
        return Integer.parseInt(new String(sb)) == number;

    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println(isPalindrome(scan.nextInt()));

    }

}
