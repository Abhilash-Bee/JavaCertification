package com.javaarrays.arrays;

import org.jetbrains.annotations.NotNull;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseArray {

    private static void reverse(int @NotNull [] array) {
        System.out.print("Array = " + Arrays.toString(array));
        int[] reverseArray = new int[array.length];
        for(int i=array.length-1; i>=0; i--)
            reverseArray[array.length-i-1] = array[i];
        System.out.println("Reversed array = " + Arrays.toString(reverseArray));
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int sizeOfArray = scan.nextInt();

        int[] array = new int[sizeOfArray];
        for(int i=0; i<sizeOfArray; i++)
            array[i] = scan.nextInt();

        reverse(array);
    }

}
