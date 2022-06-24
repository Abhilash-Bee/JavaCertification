package com.javaarrays.arrays;

import java.util.Scanner;

public class MinimumElement {

    private static Scanner scan = new Scanner(System.in);

    public static int readInteger() {
        System.out.print("Enter size of an array: ");
        return scan.nextInt();
    }

    public static int[] readElements(int sizeOfArray) {
        System.out.println("Enter " + sizeOfArray + " array elements: ");
        int[] array = new int[sizeOfArray];
        for(int i=0; i<sizeOfArray; i++)
            array[i] = scan.nextInt();

        return array;
    }

    public static int findMin(int[] array) {
        int min = Integer.MAX_VALUE;
        for (int data : array) {
            min = Math.min(min, data);
        }
        return min;
    }

    public static void main(String[] args) {

        int sizeOfArray = readInteger();
        int[] minArray = readElements(sizeOfArray);
        System.out.println(findMin(minArray));

    }

}
