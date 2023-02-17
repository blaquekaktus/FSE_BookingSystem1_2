package com.itkolleg.bookingsystem.Exceptions;

public class DeskValidationException extends Exception{

    public DeskValidationException(String message){
        super("Invalid Desk data entered: " + message);
    }
}