package com.java_collections.example_2;


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
                        System.out.println(seatName + " is reserved at " + theatre.getTheatreName());
                    else
                        System.out.println(seatName + " cannot be reserved at " + theatre.getTheatreName());
                }
                case 2 -> {
                    System.out.println("Enter the seat name: ");
                    String seatName = scanner.next();
                    if (theatre.cancelReservedSeat(seatName))
                        System.out.println(seatName + " reservation cancelled at " + theatre.getTheatreName());
                    else
                        System.out.println(seatName + " cannot cancel reservation at " + theatre.getTheatreName());
                }
                case 3 -> theatre.getSeats();
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
        System.out.println("1. Reserve seat at " + theatre.getTheatreName() + ".");
        System.out.println("2. Cancel reserved seat at " + theatre.getTheatreName() + ".");
        System.out.println("3. List seats.");
        System.out.println("4. Exit from " + theatre.getTheatreName() + ".");
        System.out.println("===========================================================");
        System.out.print("Enter your choice: ");
    }

}
