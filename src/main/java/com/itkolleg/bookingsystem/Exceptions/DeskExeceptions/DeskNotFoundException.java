package com.itkolleg.bookingsystem.Exceptions.DeskExeceptions;

public class DeskNotFoundException extends Exception{
    public DeskNotFoundException() {
        super("Desk not found!");
    }
}
