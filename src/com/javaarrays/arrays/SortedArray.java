package com.javaarrays.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class SortedArray {

    private static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

        int sizeOfArray = scan.nextInt();

        int[] myInteger = getIntegers(sizeOfArray);
        int[] sorted = sortArray(myInteger);
        printArray(sorted);

    }

    public static int[] getIntegers(int sizeOfArray) {

        int[] originalArray = new int[sizeOfArray];
        System.out.println("Enter " + sizeOfArray + " integer values:\r");
        for(int i=0; i<sizeOfArray; i++)
            originalArray[i] = scan.nextInt();

        return originalArray;


    }

    public static void printArray(int[] array) {

        for (int i=0; i<array.length; i++)
            System.out.println("Element " + i + " contents " + array[i]);

    }

    public static int[] sortArray(int[] originalArray) {

        int[] copyArray = Arrays.copyOf(originalArray, originalArray.length);
        for (int i=0; i<copyArray.length-1; i++) {
            for(int j=i+1; j<copyArray.length; j++) {
                if (copyArray[i] < copyArray[j]) {
                    int temp = copyArray[i];
                    copyArray[i] = copyArray[j];
                    copyArray[j] = temp;
                }
            }
        }
        return copyArray;

    }

}
