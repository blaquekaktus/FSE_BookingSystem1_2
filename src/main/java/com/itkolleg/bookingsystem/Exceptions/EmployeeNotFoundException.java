package com.itkolleg.bookingsystem.Exceptions;

public class EmployeeNotFoundException extends Exception{

    public EmployeeNotFoundException(){
        super("Employee not found!");
    }
}
