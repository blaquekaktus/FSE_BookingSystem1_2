package com.itkolleg.bookingsystem.Exceptions;

public class DeskNotFoundException extends Exception{
    public DeskNotFoundException() {
        super("Desk not found!");
    }
}
