package com.itkolleg.bookingsystem.Service.DeskBookings;

import com.itkolleg.bookingsystem.Domains.Booking.DeskBooking;
import com.itkolleg.bookingsystem.Domains.Desk;
import com.itkolleg.bookingsystem.Domains.Employee;
import com.itkolleg.bookingsystem.Exceptions.DeskExeceptions.DeskNotFoundException;
import com.itkolleg.bookingsystem.Exceptions.EmployeeExceptions.EmployeeNotFoundException;

import java.util.List;
public interface DBAccessDeskBookings {


    DeskBooking createDeskBooking(DeskBooking deskBooking);
    List<DeskBooking> getAllDeskBookings();

    List<DeskBooking> getDeskBookingsByEmployee(Employee employee);

    List<DeskBooking> getDeskBookingsByDeskID(Long deskID);

    List<DeskBooking> getDeskBookingsByEmployeeID(Long employeeID) throws EmployeeNotFoundException;

    List<DeskBooking> getDeskBookingsByDeskId(Long deskID) throws DeskNotFoundException;

    List<DeskBooking> getDeskBookingsByDesk(Desk desk);

    DeskBooking updateDeskBookingByEmployeeId(Long employeeID) throws EmployeeNotFoundException;

    DeskBooking updateDeskBookingByDeskId(Long deskID) throws EmployeeNotFoundException;

    DeskBooking updateDeskBooking(DeskBooking deskBooking);

    void deleteDeskBookingByEmployeeId(Long employeeID) throws EmployeeNotFoundException;

    void deleteDeskBookingByDeskId(Long deskID) throws DeskNotFoundException;
}
