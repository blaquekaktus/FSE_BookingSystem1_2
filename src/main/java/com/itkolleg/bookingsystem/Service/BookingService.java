package com.itkolleg.bookingsystem.Service;

import com.itkolleg.bookingsystem.Domains.Booking;
import com.itkolleg.bookingsystem.Domains.Desk;
import com.itkolleg.bookingsystem.Domains.Employee;
import com.itkolleg.bookingsystem.Exceptions.DeskDeletionNotPossibleException;
import com.itkolleg.bookingsystem.Exceptions.DeskNotFoundException;
import com.itkolleg.bookingsystem.Exceptions.EmployeeDeletionNotPossibleException;
import com.itkolleg.bookingsystem.Exceptions.EmployeeNotFoundException;

import java.util.List;

public interface BookingService {
    Booking createBooking(Employee employee, Desk desk);
    Booking createBooking(Long employeeID, Long deskID) throws EmployeeNotFoundException, DeskNotFoundException;
    List<Booking> getAllBookings();
    List<Booking> getAllBookingsByEmployee(Employee employee);
    List<Booking> getAllBookingsByEmployeeID(Long employeeID) throws EmployeeNotFoundException;
    List<Booking> getAllBookingsByDeskId(Long deskID) throws DeskNotFoundException;
    List<Booking> getAllBookingsByDesk(Desk desk);
    Booking updateBookingByEmployeeId(Long employeeID) throws EmployeeNotFoundException;
    Booking updateBookingByDeskId(Long DeskID) throws EmployeeNotFoundException;
   void deleteBookingByEmployeeId(Long employeeID) throws EmployeeNotFoundException, EmployeeDeletionNotPossibleException;
    void deleteBookingByDeskId(Long DeskID) throws DeskNotFoundException, DeskDeletionNotPossibleException;

}
