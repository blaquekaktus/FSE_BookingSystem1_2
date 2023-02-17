package com.itkolleg.bookingsystem.Service;

import com.itkolleg.bookingsystem.Domains.Booking;
import com.itkolleg.bookingsystem.Domains.Desk;
import com.itkolleg.bookingsystem.Domains.Employee;

import java.util.List;

public interface DBAccessBooking {
    Booking createBooking(Booking booking);
    List<Booking> getAllBookings();
    List<Booking> getAllBookingsByEmployee(Employee employee);
    List<Booking> getAllBookingsByEmployeeID(Long employeeID);
    List<Booking> getAllBookingsByDeskID(Long DeskID);

    List<Booking> getAllBookingsByDesk(Desk desk);

    Booking updateBooking(Booking booking);
    void deleteBookingByEmployeeId(Long employeeID);
    void deleteBookingByDeskId(Long DeskID);


}
