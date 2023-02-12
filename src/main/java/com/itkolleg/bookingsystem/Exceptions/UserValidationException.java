package com.itkolleg.bookingsystem.Exceptions;

public class UserValidationException extends Exception{

    public UserValidationException(String message){
        super("Invalid User data entered: " + message);
    }
}
