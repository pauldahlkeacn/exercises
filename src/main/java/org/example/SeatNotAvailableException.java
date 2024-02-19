package org.example;

public class SeatNotAvailableException extends RuntimeException{

    public SeatNotAvailableException() {
    }

    public SeatNotAvailableException(String message) {
        super(message);
    }
}
