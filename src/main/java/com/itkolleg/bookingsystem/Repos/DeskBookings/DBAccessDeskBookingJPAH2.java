package com.itkolleg.bookingsystem.Repos.DeskBookings;

import com.itkolleg.bookingsystem.Domains.Booking;
import com.itkolleg.bookingsystem.Domains.Desk;
import com.itkolleg.bookingsystem.Domains.DeskBooking;
import com.itkolleg.bookingsystem.Domains.Employee;
import com.itkolleg.bookingsystem.Exceptions.DeskExeceptions.DeskNotFoundException;
import com.itkolleg.bookingsystem.Exceptions.EmployeeExceptions.EmployeeNotFoundException;
import com.itkolleg.bookingsystem.Service.DeskBookings.DBAccessDeskBookings;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class DBAccessDeskBookingJPAH2 implements DBAccessDeskBookings {

    DeskBookingJPARepo deskBookingJPARepo;

    public DBAccessDeskBookingJPAH2(DeskBookingJPARepo deskBookingJPARepo) {
        this.deskBookingJPARepo = deskBookingJPARepo;
    }


    @Override
    public DeskBooking createDeskBooking(DeskBooking deskBooking) {
        return null;
    }


    @Override
    public List<DeskBooking> getAllDeskBookings() {
        return null;
    }

    @Override
    public List<DeskBooking> getDeskBookingsByEmployee(Employee employee) {
        return null;
    }


    @Override
    public List<DeskBooking> getDeskBookingsByEmployeeID(Long employeeID) {
        return null;
    }

    /**
     * @param deskID
     * @return
     * @throws DeskNotFoundException
     */
    @Override
    public List<DeskBooking> getDeskBookingsByDeskId(Long deskID) throws DeskNotFoundException {
        return null;
    }


    @Override
    public List<DeskBooking> getDeskBookingsByDeskID(Long deskID) {
        return null;
    }


    @Override
    public List<DeskBooking> getDeskBookingsByDesk(Desk desk) {
        return null;
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
     * @param DeskID
     * @return
     * @throws EmployeeNotFoundException
     */
    @Override
    public DeskBooking updateDeskBookingByDeskId(Long DeskID) throws EmployeeNotFoundException {
        return null;
    }

    @Override
    public DeskBooking updateDeskBooking(DeskBooking deskBooking) {
        return null;
    }


    @Override
    public void deleteDeskBookingByEmployeeId(Long employeeID) {

    }


    @Override
    public void deleteDeskBookingByDeskId(Long DeskID) {

    }

    /**
     * @param desk
     * @return
     */
    @Override
    public List<Booking> getAllDeskBookingsByDesk(Desk desk) {
        return null;
    }

}
