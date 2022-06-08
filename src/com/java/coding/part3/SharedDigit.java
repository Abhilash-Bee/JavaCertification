package com.java.coding.part3;

import java.util.Scanner;

public class SharedDigit {

    public static boolean hasSharedDigit(int a, int b) {

        if(a > 9 && a < 100 && b > 9 && b <100) {
            String x = a + "";
            String y = b + "";
            for(int i=0; i<x.length(); i++) {
                if(y.contains(x.charAt(i) + ""))
                    return true;
            }
        }
        return false;

    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println(hasSharedDigit(scan.nextInt(), scan.nextInt()));

    }

}
