package com.java_collections;


import java.util.List;
import java.util.Scanner;

public class Main {

    private static final Theatre theatre = new Theatre("GT World Mall", 10, 15);

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        while(true) {
            printOptions();
            int choice = scanner.nextInt();

            switch (choice) {
                case 1 -> {
                    System.out.println("Enter the seat name: ");
                    String seatName = scanner.next();
                    if (theatre.reserveSeat(seatName))
                        System.out.println(seatName + " is reserved at " + theatre.getName());
                    else
                        System.out.println(seatName + " cannot be reserved at " + theatre.getName());
                }
                case 2 -> {
                    System.out.println("Enter the seat name: ");
                    String seatName = scanner.next();
                    if (theatre.cancelReservedSeat(seatName))
                        System.out.println(seatName + " reservation cancelled at " + theatre.getName());
                    else
                        System.out.println(seatName + " cannot cancel reservation at " + theatre.getName());
                }
                case 3 -> {
                    List list = theatre.getSeat();
                    for (Object o : list) {
                        System.out.println(o.toString());
                    }
                }
                case 4 -> {
                    System.out.println("Thank you!!!");
                    System.exit(0);
                }
                default -> System.out.println("Enter valid choice!!!");
            }
        }

    }

    public static void printOptions() {
        System.out.println("===========================================================");
        System.out.println("1. Reserve seat at " + theatre.getName() + ".");
        System.out.println("2. Cancel reserved seat at " + theatre.getName() + ".");
        System.out.println("3. List seats.");
        System.out.println("4. Exit from " + theatre.getName() + ".");
        System.out.println("===========================================================");
        System.out.print("Enter your choice: ");
    }

}
