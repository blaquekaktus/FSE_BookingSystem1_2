package com.itkolleg.bookingsystem.Repos;

import com.itkolleg.bookingsystem.Domains.Booking;
import com.itkolleg.bookingsystem.Domains.Desk;
import com.itkolleg.bookingsystem.Domains.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.sql.Date;
import java.util.List;

public interface BookingJPARepo extends JpaRepository<Booking, Long> {
    /**
     * @param user
     * @return
     */
    List<User> getAllByUser(User user);

    /**
     * @param desk
     * @return
     */
    List<Desk> getAllByDesk(Desk desk);

    /**
     * @param startAfter
     * @return
     */
    List<Booking> getAllByBookingStartAfter(Date startAfter);

    /**
     * @param bookingStart
     * @param bookingEnd
     * @return
     */
    List<Booking>getAllByBookingStartAfterAndBookingEndBefore(Date bookingStart, Date bookingEnd);
}
