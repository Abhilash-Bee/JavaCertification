package com.java.coding.part2;

import java.util.Scanner;

public class PlayingCat {

    public static boolean isCatPlaying(boolean summer, int temperature) {

        if(summer) {
            return temperature >= 25 && temperature <= 45;
        }
        else {
            return temperature >= 25 && temperature <= 35;
        }

    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println(isCatPlaying(scan. nextBoolean(), scan.nextInt()));

    }

}