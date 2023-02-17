package com.itkolleg.bookingsystem.Repos;

import com.itkolleg.bookingsystem.Domains.Booking;
import com.itkolleg.bookingsystem.Domains.Desk;
import com.itkolleg.bookingsystem.Domains.Employee;
import com.itkolleg.bookingsystem.Service.DBAccessBooking;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class DBAccessBookingJPAH2 implements DBAccessBooking {

    BookingJPARepo bookingJPARepo;

    public DBAccessBookingJPAH2(BookingJPARepo bookingJPARepo) {
        this.bookingJPARepo = bookingJPARepo;
    }


    @Override
    public Booking createBooking(Booking booking) {
        return null;
    }



    @Override
    public List<Booking> getAllBookings() {
        return null;
    }

    @Override
    public List<Booking> getAllBookingsByEmployee(Employee employee) {
        return null;
    }



    @Override
    public List<Booking> getAllBookingsByEmployeeID(Long employeeID) {
        return null;
    }


    @Override
    public List<Booking> getAllBookingsByDeskID(Long deskID) {
        return null;
    }


    @Override
    public List<Booking> getAllBookingsByDesk(Desk desk) {
        return null;
    }

    @Override
    public Booking updateBooking(Booking booking) {
        return null;
    }


    @Override
    public void deleteBookingByEmployeeId(Long employeeID) {

    }


    @Override
    public void deleteBookingByDeskId(Long DeskID) {

    }
}
