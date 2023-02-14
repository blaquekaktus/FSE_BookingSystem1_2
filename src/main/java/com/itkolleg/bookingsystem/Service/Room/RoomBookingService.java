package com.itkolleg.bookingsystem.Service.Room;

import com.itkolleg.bookingsystem.Domains.Booking.Booking;
import com.itkolleg.bookingsystem.Domains.Employee;
import com.itkolleg.bookingsystem.Domains.Room;
import com.itkolleg.bookingsystem.Exceptions.DeskExeceptions.DeskNotFoundException;
import com.itkolleg.bookingsystem.Exceptions.EmployeeExceptions.EmployeeNotFoundException;
import com.itkolleg.bookingsystem.Exceptions.RoomExceptions.RoomNotFoundException;

import java.util.List;

public interface RoomBookingService {
    Booking createRoomBooking(Employee employee, Room room);
    Booking createRoomBooking(Long employeeID, Long RoomID) throws EmployeeNotFoundException, DeskNotFoundException;
    List<Booking> getAllRoomBookings();
    List<Booking> getAllRoomBookingsByEmployee(Employee employee);
    List<Booking> getAllRoomBookingsByEmployeeID(Long employeeID) throws EmployeeNotFoundException;
    List<Booking> getAllRoomBookingsByDeskId(Long RoomID) throws DeskNotFoundException;
    List<Booking> getAllRoomBookingsByDesk(Room room);
    Booking updateRoomBookingByEmployeeId(Long employeeID) throws EmployeeNotFoundException;
    Booking updateRoomBookingByDeskId(Long RoomID) throws RoomNotFoundException;
   void deleteRoomBookingByEmployeeId(Long employeeID) throws EmployeeNotFoundException;
    void deleteRoomBookingByDeskId(Long RoomID) throws RoomNotFoundException;

}
