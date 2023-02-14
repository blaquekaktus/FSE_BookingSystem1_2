package com.itkolleg.bookingsystem.Exceptions.BookingExceptions;

public class BookingNotFoundException extends Exception{
    public BookingNotFoundException(){
        super("Booking not found!");
    }
}
