package com.java_collections;

import java.util.ArrayList;
import java.util.List;

public class Theatre {

    private final String name;
    private final List<Seats> seat;

    public Theatre(String name, int numRows, int numSeatsPerRow) {
        this.name = name;
        this.seat = new ArrayList<>();

        int lastRow = 'A' + (numRows - 1);

        for (char row = 'A'; row <= lastRow; row++) {
            for (int seatNumber = 1; seatNumber <= numSeatsPerRow; seatNumber++) {
                seat.add(new Seats(row + String.format("%02d", seatNumber), false));
            }
        }
    }

    public String getName() {
        return name;
    }

    public List<Seats> getSeat() {
        return seat;
    }

    public boolean reserveSeat(String seatName) {
        for (int i=0; i<seat.size(); i++) {
            if (seatName.equals(seat.get(i).seatName) && !seat.get(i).reserved) {
                seat.set(i, new Seats(seat.get(i).seatName, true));
                return true;
            }
        }
        return false;
    }

    public boolean cancelReservedSeat(String seatName) {
        for (int i=0; i<seat.size(); i++) {
            if(seatName.equals(seat.get(i).seatName) && seat.get(i).reserved) {
                seat.set(i, new Seats(seat.get(i).seatName, false));
                return true;
            }
        }
        return false;
    }

    private record Seats(String seatName, boolean reserved) {

        @Override
        public String toString() {
            return this.seatName;
        }

    }

}
