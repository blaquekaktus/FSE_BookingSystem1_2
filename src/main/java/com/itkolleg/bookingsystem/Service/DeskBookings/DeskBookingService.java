package com.itkolleg.bookingsystem.Service.DeskBookings;

import com.itkolleg.bookingsystem.Domains.Desk;
import com.itkolleg.bookingsystem.Domains.Booking.DeskBooking;
import com.itkolleg.bookingsystem.Domains.Employee;
import com.itkolleg.bookingsystem.Exceptions.DeskExeceptions.DeskNotFoundException;
import com.itkolleg.bookingsystem.Exceptions.EmployeeExceptions.EmployeeNotFoundException;

import java.util.List;

public interface DeskBookingService {
    DeskBooking createDeskBooking(Employee employee, Desk desk);
    DeskBooking createDeskBooking(Long employeeID, Long deskID) throws EmployeeNotFoundException, DeskNotFoundException;
    List<DeskBooking> getAllDeskBookings();
    List<DeskBooking> getDeskBookingsByEmployee(Employee employee);
    List<DeskBooking> getDeskBookingsByEmployeeID(Long employeeID) throws EmployeeNotFoundException;
    List<DeskBooking> getDeskBookingsByDesk(Desk desk);
    List<DeskBooking> getDeskBookingsByDeskId(Long deskID) throws DeskNotFoundException;
    DeskBooking updateDeskBookingByEmployeeId(Long employeeID) throws EmployeeNotFoundException;
    DeskBooking updateDeskBookingByDeskId(Long deskID) throws EmployeeNotFoundException;
    void deleteDeskBookingByEmployeeId(Long employeeID) throws EmployeeNotFoundException;
    void deleteDeskBookingByDeskId(Long deskID) throws DeskNotFoundException;


}
