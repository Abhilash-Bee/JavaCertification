package com.list.arraylist;

import java.util.Scanner;

public class Main {

    private static Scanner scan = new Scanner(System.in);
    private static MobilePhone mobilePhone = new MobilePhone("90665 69822");

    public static void main(String[] args) {
        while (true) {
            startPhone();
            printActions();
            System.out.println("Enter your choice: ");
            int choice = scan.nextInt();
            switch (choice) {
                case 1 -> mobilePhone.printContacts();
                case 2 -> addNewContact();
                case 3 -> updateContact();
                case 4 -> removeContact();
                case 5 -> queryContact();
                case 6 -> printActions();
                case 7 -> {
                    System.out.println("Thank you!!!");
                    System.exit(0);
                }
                default -> System.out.println("Enter valid choice");
            }
        }
    }

    private static void queryContact() {
        System.out.println("Enter existing contact name: ");
        String name = scan.nextLine();
        Contact exisitingContactRecord = mobilePhone.queryContact(name);
        if (exisitingContactRecord == null) {
            System.out.println("Contact not found");
            return;
        }

        System.out.println("Name: " + exisitingContactRecord.getName() + " phone number is " +
                exisitingContactRecord.getPhoneNumber());
    }

    private static void removeContact() {
        System.out.println("Enter existing contact name: ");
        String name = scan.nextLine();
        Contact exisitingContactRecord = mobilePhone.queryContact(name);
        if (exisitingContactRecord == null) {
            System.out.println("Contact not found");
            return;
        }
        if (mobilePhone.removeContact(exisitingContactRecord))
            System.out.println("Successfully deleted");
        else
            System.out.println("Error deleting contact");
    }

    private static void updateContact() {
        System.out.println("Enter old contact name: ");
        String name = scan.nextLine();
        Contact exisitingContactRecord = mobilePhone.queryContact(name);
        if (exisitingContactRecord == null) {
            System.out.println("Contact not found");
            return;
        }
        System.out.println("Enter new contact name: ");
        String newName = scan.nextLine();
        System.out.println("Enter new contact phone number: ");
        String newPhoneNumber = scan.nextLine();
        Contact updatedContact = Contact.createContact(newName, newPhoneNumber);

        if (mobilePhone.updateContact(exisitingContactRecord, updatedContact))
            System.out.println("Successfully updated record");
        else
            System.out.println("Error updating record.");
    }

    private static void addNewContact() {
        System.out.println("Enter contact name: ");
        String name = scan.nextLine();
        scan.nextLine();
        System.out.println("Enter phone number: ");
        String phoneNumber = scan.nextLine();
        Contact newContact = Contact.createContact(name, phoneNumber);
        if (mobilePhone.addNewContact(newContact))
            System.out.println("New contact: name = " + name + ", phone = " + phoneNumber);
        else
            System.out.println("Cannot add, " + name + " already on file");
    }


    private static void startPhone() {
        System.out.println("Starting Phone...");
    }

    private static void printActions() {
        System.out.println("1. Print all contact from mycontacts");
        System.out.println("2. Update an existing contact from mycontacts");
        System.out.println("3. Remove an existing contact from mycontacts");
        System.out.println("4. Find contact from mycontacts");
        System.out.println("5. Query related to a contact using name from mycontacts");
        System.out.println("6. Add new contact to mycontacts");
        System.out.println("7. Exit");
    }

}
