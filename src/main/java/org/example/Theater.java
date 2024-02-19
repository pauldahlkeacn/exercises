package org.example;

import java.util.Set;

public class Theater {

    private final boolean[] bookedPlaces;
    private final int places;


    public Theater(int places) {
        bookedPlaces = new boolean[places];
        this.places = places;
    }

    public void bookSeat(int placeNumber) {
        if (placeNumber < 0 || placeNumber >= this.places) {
            throw new SeatNotAvailableException("The place number " + placeNumber + " does not exist");
        }
        if (bookedPlaces[placeNumber]) {
            throw new SeatNotAvailableException("The place number " + placeNumber + " is already booked");
        }

        bookedPlaces[placeNumber] = true;
    }

    public static void main(String[] args) {
        Theater t = new Theater(100);
        t.bookSeat(10);
        t.bookSeat(-1);
    }
}
