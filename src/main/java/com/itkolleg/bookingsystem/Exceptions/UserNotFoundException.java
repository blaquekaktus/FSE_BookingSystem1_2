package com.itkolleg.bookingsystem.Exceptions;

public class UserNotFoundException extends Exception{

    public UserNotFoundException(){
        super("User not found!");
    }
}
