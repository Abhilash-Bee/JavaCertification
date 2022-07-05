package com.java_collections.example_2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Theatre {

    private final String theatreName;
    private final List<Seat> seats;

    public Theatre(String theatreName, int numRows, int numSeatsPerRow) {
        this.theatreName = theatreName;
        this.seats = new ArrayList<>();

        int lastRow = 'A' + numRows;
        for (char row = 'A'; row < lastRow; row++) {
            for (int seatNumber = 1; seatNumber <= numSeatsPerRow; seatNumber++) {
                seats.add(new Seat( row + String.format("%02d", seatNumber), false));
            }
        }
    }

    public String getTheatreName() {
        return theatreName;
    }

    public void getSeats() {
        for (Seat seat : seats)
            System.out.println(seat.toString());
    }

    public boolean reserveSeat(String seatName) {
        int location = Collections.binarySearch(seats, new Seat(seatName, false), Seat::compareTo);
        if (location >= 0 && !seats.get(location).reservation) {
            seats.set(location, new Seat(seats.get(location).seatName, true));
            return true;
        }
        return false;
    }

    public boolean cancelReservedSeat(String seatName) {
        int location = Collections.binarySearch(seats, new Seat(seatName, true), Seat::compareTo);
        if (location >= 0 && seats.get(location).reservation) {
            seats.set(location, new Seat(seats.get(location).seatName, false));
            return true;
        }
        return false;
    }

    public record Seat(String seatName, boolean reservation) implements Comparable<Seat> {
        @Override
        public int compareTo(Theatre.Seat o) {
            return this.seatName.compareToIgnoreCase(o.seatName);
        }

        @Override
        public String toString() {
            return this.seatName + " " + this.reservation;
        }
    }

}
