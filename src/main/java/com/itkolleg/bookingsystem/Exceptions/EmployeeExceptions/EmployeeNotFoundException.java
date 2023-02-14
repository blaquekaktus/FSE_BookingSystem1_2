package com.itkolleg.bookingsystem.Exceptions.EmployeeExceptions;

public class EmployeeNotFoundException extends Exception{

    public EmployeeNotFoundException(){
        super("Employee not found!");
    }
}
