package com.java.coding.part4;

import java.util.Scanner;

public class FlourPacker {

    public static boolean canPack(int bigCount, int smallCount, int goal) {

        if(bigCount < 0 || smallCount < 0 || goal < 0)
            return false;

        for(int i=0; i<bigCount; i++) {
            if (goal >= 5)
                goal -= 5;
            else
                break;
        }

        for(int i=0; i<smallCount; i++) {
            if (goal >= 1)
                goal--;
            else
                break;
        }

        return (goal == 0);

    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println(canPack(scan.nextInt(), scan.nextInt(), scan.nextInt()));

    }

}
