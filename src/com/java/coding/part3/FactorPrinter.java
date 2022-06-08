package com.java.coding.part3;

import java.util.Scanner;

public class FactorPrinter {

    public static void printFactors(int number) {

        if(number < 1)
            System.out.print("Invalid Value");

        for(int i=1; i<=number; i++) {
            if(number % i == 0)
                System.out.print(i + " ");
        }

    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        printFactors(scan.nextInt());

    }

}
