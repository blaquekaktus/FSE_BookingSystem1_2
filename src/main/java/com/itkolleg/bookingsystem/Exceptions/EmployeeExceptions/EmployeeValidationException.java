package com.itkolleg.bookingsystem.Exceptions.EmployeeExceptions;

public class EmployeeValidationException extends Exception{

    public EmployeeValidationException(String message){
        super("Invalid Employee data entered: " + message);
    }
}
