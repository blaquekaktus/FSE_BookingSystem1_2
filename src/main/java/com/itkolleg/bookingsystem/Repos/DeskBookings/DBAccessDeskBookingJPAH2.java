package com.itkolleg.bookingsystem.Repos.DeskBookings;

import com.itkolleg.bookingsystem.Domains.Booking.DeskBooking;
import com.itkolleg.bookingsystem.Domains.Desk;
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
        return this.deskBookingJPARepo.save(deskBooking);
    }

    @Override
    public List<DeskBooking> getAllDeskBookings() {
        List<DeskBooking> deskBookingList = this.deskBookingJPARepo.findAll();
        for (DeskBooking deskBooking : deskBookingList){
            System.out.println(deskBooking);
        }
        return  this.deskBookingJPARepo.findAll();
    }

    @Override
    public List<DeskBooking> getDeskBookingsByEmployee(Employee employee) {
        return this.deskBookingJPARepo.getByEmployee(employee);
    }

    /**
     * @param deskID
     * @return
     */
    @Override
    public List<DeskBooking> getDeskBookingsByDeskID(Long deskID) {
        return null;
    }

    @Override
    public List<DeskBooking> getDeskBookingsByEmployeeID(Long employeeID) {
        return this.deskBookingJPARepo.getDeskBookingsByEmployeeID(employeeID);
    }

    @Override
    public List<DeskBooking> getDeskBookingsByDesk(Desk desk) {
        return this.deskBookingJPARepo.getByDesk(desk);
    }

    /**
     * @param deskID
     * @return
     * @throws DeskNotFoundException
     */
    @Override
    public List<DeskBooking> getDeskBookingsByDeskId(Long deskID) throws DeskNotFoundException {
        return this.deskBookingJPARepo.getDeskBookingsByDeskID(deskID);
    }

    /**
     * @param employeeID
     * @return
     * @throws EmployeeNotFoundException
     */
    @Override
    public DeskBooking updateDeskBookingByEmployeeId(Long employeeID) throws EmployeeNotFoundException {
        return this.deskBookingJPARepo.updateDeskBookingByEmployeeId(employeeID);
    }

    /**
     * @param deskID
     * @return
     * @throws EmployeeNotFoundException
     */
    @Override
    public DeskBooking updateDeskBookingByDeskId(Long deskID) throws EmployeeNotFoundException {
        return this.deskBookingJPARepo.updateDeskBookingByDeskId(deskID);
    }

    /**
     * @param deskBooking
     * @return
     */
    @Override
    public DeskBooking updateDeskBooking(DeskBooking deskBooking) {
        return null;
    }

    @Override
    public void deleteDeskBookingByDeskId(Long deskID) {
        this.deskBookingJPARepo.deleteDeskBookingByDeskId(deskID);
    }

    @Override
    public void deleteDeskBookingByEmployeeId(Long employeeID) {
        this.deskBookingJPARepo.deleteDeskBookingByEmployeeId(employeeID);
    }





}
