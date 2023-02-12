package com.itkolleg.bookingsystem.Exceptions;

public class EmployeeValidationException extends Exception{

    public EmployeeValidationException(String message){
        super("Invalid Employee data entered: " + message);
    }
}
