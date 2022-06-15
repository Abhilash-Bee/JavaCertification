package com.java.oop.part1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        SimpleCalculator calculator = new SimpleCalculator();
        calculator.setFirstNumber(scan.nextDouble());
        calculator.setSecondNumber(scan.nextDouble());

        System.out.println("First Number: " + calculator.getFirstNumber());
        System.out.println("Second Number: " + calculator.getSecondNumber());

        System.out.println("Addition Result: " + calculator.getAdditionResult());
        System.out.println("Subtraction Result: " + calculator.getSubtractionResult());
        System.out.println("Multiplication Result: " + calculator.getMultiplicationResult());
        System.out.println("Division Result: " + calculator.getDivisionResult());

    }

}
