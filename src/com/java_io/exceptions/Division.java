package com.java_io.exceptions;

import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Division {

    private final int x;
    private final int y;

    public Division() {
        int x = 0, y = 0;
        try {
            x = getInput();
            y = getInput();
        } catch (ArithmeticException | NoSuchElementException e) {
            System.out.println(e.getMessage());
            System.exit(0);
        }
        this.x = x;
        this.y = y;
        try {
            System.out.println(division());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    private int division() {
        try {
            return x / y;
        } catch (ArithmeticException e) {
            throw new ArithmeticException(e.getMessage() + " division method");
        }
    }

    private int getInput() {
        Scanner scanner = new Scanner(System.in);
        while(true) {
            System.out.print("Enter the number: ");
            try {
                return scanner.nextInt();
            } catch (InputMismatchException e) {
                System.out.println(scanner.next() + " is not a number, try to enter number between 0 to 9");
            } catch (NoSuchElementException e) {
                throw new ArithmeticException("Not a suitable type");
            }
        }
    }


}
