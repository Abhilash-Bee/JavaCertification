package com.java.oop.part1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        //SimpleCalculator Class Object
        SimpleCalculator calculator = new SimpleCalculator();
        calculator.setFirstNumber(scan.nextDouble());
        calculator.setSecondNumber(scan.nextDouble());

        System.out.println("First Number: " + calculator.getFirstNumber());
        System.out.println("Second Number: " + calculator.getSecondNumber());

        System.out.println("Addition Result: " + calculator.getAdditionResult());
        System.out.println("Subtraction Result: " + calculator.getSubtractionResult());
        System.out.println("Multiplication Result: " + calculator.getMultiplicationResult());
        System.out.println("Division Result: " + calculator.getDivisionResult());


        //Person Class Object
        Person person = new Person();
        String firstName = scan.nextLine();
        scan.nextLine();
        String secondName = scan.nextLine();
        if(!secondName.isEmpty())
            scan.nextLine();
        int age = scan.nextInt();
        person.setFirstName(firstName);
        person.setLastName(secondName);
        person.setAge(age);
        System.out.println();
        System.out.println(person.getFirstName());
        System.out.println(person.getLastName());
        System.out.println(person.getAge());
        System.out.println();
        System.out.println(person.isTeen());
        System.out.println();
        System.out.println(person.getFullName());

    }

}
