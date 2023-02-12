package com.itkolleg.bookingsystem.Exceptions;

public class BookingNotFoundException extends Exception{
    public BookingNotFoundException(){
        super("Booking not found!");
    }
}
