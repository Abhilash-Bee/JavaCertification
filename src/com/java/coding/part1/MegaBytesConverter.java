package com.java.coding.part1;

import java.util.Scanner;

public class MegaBytesConverter {

    public static void printMegaBytesAndKiloBytes(int kiloBytes) {
        if(kiloBytes >= 0) {
            System.out.print(kiloBytes + " KB = ");
            int mb = kiloBytes / 1024;
            int kb = kiloBytes % 1024;
            System.out.println(mb + " MB and " + kb + " KB");
        }
        else
            System.out.println("Invalid Value");
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        printMegaBytesAndKiloBytes(scan.nextInt());

    }

}