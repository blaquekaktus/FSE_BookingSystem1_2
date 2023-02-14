package com.itkolleg.bookingsystem.Repos.DeskBookings;

import com.itkolleg.bookingsystem.Domains.Booking;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 This interface provides CRUD operations and additional methods for accessing and manipulating {@link Booking} data
 from the database using Spring Data JPA. It extends the {@link JpaRepository} interface.
 */
@Repository
public interface DeskBookingJPARepo extends JpaRepository<Booking, Long> {
}