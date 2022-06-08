package com.java.coding.part2;

import java.util.Scanner;

public class AreaCalculator {

    public static double area(double radius) {

        if(radius < 0)
            return -1;
        else
            return radius * radius * Math.PI;

    }

    public static double area(double x, double y) {

        if(x < 0 || y < 0)
            return -1;
        else
            return x * y;

    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println(area(scan.nextDouble()));
        System.out.println(area(scan.nextDouble(), scan.nextDouble()));

    }

}