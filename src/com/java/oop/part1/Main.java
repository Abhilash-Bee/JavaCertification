package com.java.oop.part1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        //SimpleCalculator Class Object
        SimpleCalculator calculator = new SimpleCalculator();
        System.out.print("Enter First Number: ");
        calculator.setFirstNumber(scan.nextDouble());
        System.out.print("Enter Second Number: ");
        calculator.setSecondNumber(scan.nextDouble());

        System.out.println("First Number: " + calculator.getFirstNumber());
        System.out.println("Second Number: " + calculator.getSecondNumber());

        System.out.println("Addition Result: " + calculator.getAdditionResult());
        System.out.println("Subtraction Result: " + calculator.getSubtractionResult());
        System.out.println("Multiplication Result: " + calculator.getMultiplicationResult());
        System.out.println("Division Result: " + calculator.getDivisionResult());


        //Person Class Object
        Person person = new Person();
        System.out.print("Enter First Name: ");
        String firstName = scan.nextLine();
        scan.nextLine();
        System.out.print("Enter Last Name: ");
        String lastName = scan.nextLine();
        if(!lastName.isEmpty())
            scan.nextLine();
        System.out.print("Enter Age of the Person: ");
        int age = scan.nextInt();
        person.setFirstName(firstName);
        person.setLastName(lastName);
        person.setAge(age);
        System.out.println();
        System.out.println(person.getFirstName());
        System.out.println(person.getLastName());
        System.out.println(person.getAge());
        System.out.println();
        System.out.println(person.isTeen());
        System.out.println();
        System.out.println(person.getFullName());


        //BankAccount Class Object
        BankAccount bankAccount = new BankAccount();
        System.out.print("Enter Account Number: ");
        bankAccount.setAccountNumber(scan.nextLong());
        System.out.print("Enter Balance: ");
        bankAccount.setBalance(scan.nextDouble());
        scan.nextLine();
        System.out.print("Enter Customer Name: ");
        bankAccount.setCustomerName(scan.nextLine());
        System.out.print("Enter Email Address: ");
        bankAccount.setEmail(scan.nextLine());
        System.out.print("Enter Phone Number: ");
        bankAccount.setPhoneNumber(scan.nextLong());
        System.out.println("\n");
        System.out.println("Account Number: " + bankAccount.getAccountNumber());
        System.out.println("Balance: " + bankAccount.getBalance());
        System.out.println("Customer Name: " + bankAccount.getCustomerName());
        System.out.println("Email Address: " + bankAccount.getEmail());
        System.out.println("Phone Number: " + bankAccount.getPhoneNumber());
        System.out.println("\n");
        System.out.print("Enter the deposit amount: ");
        System.out.println(bankAccount.deposit(scan.nextDouble()));
        System.out.print("Enter the withdraw amount: ");
        System.out.println(bankAccount.withdraw(scan.nextDouble()));

    }

}
