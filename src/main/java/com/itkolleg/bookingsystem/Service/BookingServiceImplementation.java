package com.itkolleg.bookingsystem.Service;

import com.itkolleg.bookingsystem.Domains.Booking;
import com.itkolleg.bookingsystem.Domains.Desk;
import com.itkolleg.bookingsystem.Domains.Employee;
import com.itkolleg.bookingsystem.Exceptions.DeskDeletionNotPossibleException;
import com.itkolleg.bookingsystem.Exceptions.DeskNotFoundException;
import com.itkolleg.bookingsystem.Exceptions.EmployeeDeletionNotPossibleException;
import com.itkolleg.bookingsystem.Exceptions.EmployeeNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookingServiceImplementation implements BookingService{

    DBAccessEmployees dbAccessEmployees;
    DBAccessDesks dbAccessDesks;
    DBAccessBooking dbAccessBooking;

    public BookingServiceImplementation(DBAccessEmployees dbAccessEmployees, DBAccessDesks dbAccessDesks, DBAccessBooking dbAccessBooking) {
        this.dbAccessEmployees = dbAccessEmployees;
        this.dbAccessDesks = dbAccessDesks;
        this.dbAccessBooking = dbAccessBooking;
    }

    @Override
    public Booking createBooking(Employee employee, Desk desk) {
        Booking booking =  new Booking();
        booking.setEmployee(employee);
        booking.setDesk(desk);
        return dbAccessBooking.createBooking(booking);
    }

    @Override
    public Booking createBooking(Long employeeID, Long deskID) throws EmployeeNotFoundException, DeskNotFoundException {
        Employee employee = dbAccessEmployees.getEmployeeById(employeeID);
        Desk desk = dbAccessDesks.getDeskById(deskID);
        Booking booking = new Booking();
        booking.setEmployee(employee);
        booking.setDesk(desk);
        return this.dbAccessBooking.createBooking(booking);
    }

    @Override
    public List<Booking> getAllBookings() {
        return this.dbAccessBooking.getAllBookings();
    }

    @Override
    public List<Booking> getAllBookingsByEmployee(Employee employee) {
        return this.dbAccessBooking.getAllBookingsByEmployee(employee);
    }

    @Override
    public List<Booking> getAllBookingsByEmployeeID(Long employeeID) throws EmployeeNotFoundException {
        return this.dbAccessBooking.getAllBookingsByEmployeeID(employeeID);
    }

    public List<Booking> getAllBookingsByDeskId(Long deskID) throws DeskNotFoundException{
        return this.dbAccessBooking.getAllBookingsByDeskID(deskID) ;
    }

    @Override
    public List<Booking> getAllBookingsByDesk(Desk desk) {
        return this.dbAccessBooking.getAllBookingsByDesk(desk);
    }

    @Override
    public Booking updateBookingByEmployeeId(Long employeeID) throws EmployeeNotFoundException{
        //TO DO implement method

        //Booking booking = dbAccessBooking.getAllBookingsByEmployeeID()
        //booking.setEmployee(employee);
        //booking.setDesk(desk);
        //return this.dbAccessBooking.updateBooking(booking);
        return null;
    }

    public Booking updateBookingByDeskId(Long DeskID) throws EmployeeNotFoundException{
        //TO DO implement method
        return null;
    }

    @Override
    public void deleteBookingByEmployeeId(Long employeeID) throws EmployeeNotFoundException, EmployeeDeletionNotPossibleException {
        this.dbAccessBooking.deleteBookingByEmployeeId(employeeID);
    }

    @Override
    public void deleteBookingByDeskId(Long deskID) throws DeskNotFoundException, DeskDeletionNotPossibleException {
        this.dbAccessBooking.deleteBookingByDeskId(deskID);
    }
}
