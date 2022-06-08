package com.java.coding.part3;

import java.util.Scanner;

public class NumberToWords {

    public static void numberToWords(int number) {

        String out = "";

        if(number < 0)
            System.out.println("Invalid Value");

        while(number > 0) {
            int rem = number % 10;
            switch (rem) {
                case 1:
                    out += "One,";
                    break;
                case 2:
                    out += "Two,";
                    break;
                case 3:
                    out += "Three,";
                    break;
                case 4:
                    out += "Four,";
                    break;
                case 5:
                    out += "Five,";
                    break;
                case 6:
                    out += "Six,";
                    break;
                case 7:
                    out += "Seven,";
                    break;
                case 8:
                    out += "Eight,";
                    break;
                case 9:
                    out += "Nine,";
                    break;
                default:
            }
            number /= 10;
        }

        String[] str = out.split(",");

        for(String data : str)
            System.out.print(data + " ");
    }

    public static int reverse(int number) {

        if(number < 0) {
            number *= -1;
            StringBuilder sb = new StringBuilder(number).reverse();
            return Integer.parseInt(new String(sb)) * -1;
        }
        else {
            StringBuilder sb = new StringBuilder(number).reverse();
            return Integer.parseInt(new String(sb));
        }

    }

    public static int getDigitCount(int number) {

        if(number < 0)
            return -1;

        String s = number + "";
        return s.length();

    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        numberToWords(scan.nextInt());
        System.out.println(reverse(scan.nextInt()));
        System.out.println(getDigitCount(scan.nextInt()));

    }

}
