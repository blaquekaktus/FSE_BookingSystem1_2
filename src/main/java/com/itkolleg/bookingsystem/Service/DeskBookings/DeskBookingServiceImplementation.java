package com.itkolleg.bookingsystem.Service.DeskBookings;

import com.itkolleg.bookingsystem.Domains.Desk;
import com.itkolleg.bookingsystem.Domains.Booking.DeskBooking;
import com.itkolleg.bookingsystem.Domains.Employee;
import com.itkolleg.bookingsystem.Exceptions.DeskExeceptions.DeskNotFoundException;
import com.itkolleg.bookingsystem.Exceptions.EmployeeExceptions.EmployeeNotFoundException;
import com.itkolleg.bookingsystem.Service.Desks.DBAccessDesks;
import com.itkolleg.bookingsystem.Service.Employee.DBAccessEmployees;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DeskBookingServiceImplementation implements DeskBookingService {

    DBAccessEmployees dbAccessEmployees;
    DBAccessDesks dbAccessDesks;
    DBAccessDeskBookings dbAccessDeskBookings;

    public DeskBookingServiceImplementation(DBAccessEmployees dbAccessEmployees, DBAccessDesks dbAccessDesks, DBAccessDeskBookings dbAccessDeskBookings) {
        this.dbAccessEmployees = dbAccessEmployees;
        this.dbAccessDesks = dbAccessDesks;
        this.dbAccessDeskBookings = dbAccessDeskBookings;
    }

    @Override
    public DeskBooking createDeskBooking(Employee employee, Desk desk) {
        DeskBooking deskBooking = new DeskBooking();
        deskBooking.setEmployee(employee);
        deskBooking.setDesk(desk);
        return dbAccessDeskBookings.createDeskBooking(deskBooking);
    }

    @Override
    public DeskBooking createDeskBooking(Long employeeID, Long deskID) throws EmployeeNotFoundException, DeskNotFoundException {
        Employee employee = dbAccessEmployees.getEmployeeById(employeeID);
        Desk desk = dbAccessDesks.getDeskById(deskID);
        DeskBooking deskbooking = new DeskBooking();
        deskbooking.setEmployee(employee);
        deskbooking.setDesk(desk);
        return this.dbAccessDeskBookings.createDeskBooking(deskbooking);
    }

    @Override
    public List<DeskBooking> getAllDeskBookings() {
        return this.dbAccessDeskBookings.getAllDeskBookings();
    }

    /**
     * @param employee
     * @return
     */
    @Override
    public List<DeskBooking> getDeskBookingsByEmployee(Employee employee) {
        return null;
    }

    @Override
    public List<DeskBooking> getDeskBookingsByEmployeeID(Long employeeID) throws EmployeeNotFoundException {
        return this.dbAccessDeskBookings.getDeskBookingsByEmployeeID(employeeID);
    }

    /**
     * @param desk
     * @return
     */
    @Override
    public List<DeskBooking> getDeskBookingsByDesk(Desk desk) {
        return null;
    }

    public List<DeskBooking> getDeskBookingsByDeskId(Long deskID) throws DeskNotFoundException {
        return this.dbAccessDeskBookings.getDeskBookingsByDeskId(deskID);
    }

    /**
     * @param employeeID
     * @return
     * @throws EmployeeNotFoundException
     */
    @Override
    public DeskBooking updateDeskBookingByEmployeeId(Long employeeID) throws EmployeeNotFoundException {
        return null;
    }

    /**
     * @param deskID
     * @return
     * @throws EmployeeNotFoundException
     */
    @Override
    public DeskBooking updateDeskBookingByDeskId(Long deskID) throws EmployeeNotFoundException {
        return null;
    }

    /**
     * @param employeeID
     * @throws EmployeeNotFoundException
     */
    @Override
    public void deleteDeskBookingByEmployeeId(Long employeeID) throws EmployeeNotFoundException {

    }

    /**
     * @param deskID
     * @throws DeskNotFoundException
     */
    @Override
    public void deleteDeskBookingByDeskId(Long deskID) throws DeskNotFoundException {

    }
}

