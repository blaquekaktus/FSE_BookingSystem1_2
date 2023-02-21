package com.itkolleg.bookingsystem.Repos.DeskBookings;

import com.itkolleg.bookingsystem.Domains.Booking.Booking;
import com.itkolleg.bookingsystem.Domains.Booking.DeskBooking;
import com.itkolleg.bookingsystem.Domains.Desk;
import com.itkolleg.bookingsystem.Domains.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 This interface provides CRUD operations and additional methods for accessing and manipulating {@link Booking} data
 from the database using Spring Data JPA. It extends the {@link JpaRepository} interface.
 */
@Repository
public interface DeskBookingJPARepo extends JpaRepository<DeskBooking, Long> {
    List<DeskBooking>getByEmployee(Employee employee);
    List<DeskBooking>getByDesk(Desk desk);

    List<DeskBooking>getDeskBookingsByEmployeeID(Long employeeID);

    List<DeskBooking>getDeskBookingsByDeskID(Long deskID);

    DeskBooking updateDeskBookingByEmployeeId(Long employeeID);

    DeskBooking updateDeskBookingByDeskId(Long deskID);

    void deleteDeskBookingByEmployeeId(Long employeeID);

    void deleteDeskBookingByDeskId(Long deskID);
}