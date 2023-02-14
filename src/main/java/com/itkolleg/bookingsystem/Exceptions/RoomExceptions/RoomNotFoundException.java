package com.itkolleg.bookingsystem.Exceptions.RoomExceptions;

public class RoomNotFoundException extends Exception {

    public RoomNotFoundException(){
        super("Room not found!");
    }
}
