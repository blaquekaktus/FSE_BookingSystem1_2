package com.itkolleg.bookingsystem.Repos;

import com.itkolleg.bookingsystem.Domains.Booking;
import com.itkolleg.bookingsystem.Domains.Desk;
import com.itkolleg.bookingsystem.Domains.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.sql.Date;
import java.util.List;

/**
 This interface provides CRUD operations and additional methods for accessing and manipulating {@link Booking} data
 from the database using Spring Data JPA. It extends the {@link JpaRepository} interface.
 */
@Repository
public interface BookingJPARepo extends JpaRepository<Booking, Long> {
    /**

     Returns a list of all bookings made by the specified {@link Employee}.
     @param employee the employee whose bookings to retrieve
     @return a list of all bookings made by the specified employee
     */
    List<Employee> getAllByEmployee(Employee employee);

    /**
    * Returns a list of all bookings made for the specified {@link Desk}.
    *@param desk the desk for which to retrieve bookings
    *@return a list of all bookings made for the specified desk
    */
    List<Desk> getAllByDesk(Desk desk);

    /**
     *Returns a list of all bookings that start after the specified date.
     *@param startAfter the start date after which to retrieve bookings
     *@return a list of all bookings that start after the specified date
     */
    List<Booking> getAllByBookingStartAfter(Date startAfter);

    /**
     *Returns a list of all bookings that start after the specified start date and end before the specified end date.
     *@param bookingStart the start date after which to retrieve bookings
     *@param bookingEnd the end date before which to retrieve bookings
     *@return a list of all bookings that start after the specified start date and end before the specified end date
     */
    List<Booking>getAllByBookingStartAfterAndBookingEndBefore(Date bookingStart, Date bookingEnd);
}
