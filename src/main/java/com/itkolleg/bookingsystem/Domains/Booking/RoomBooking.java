package com.itkolleg.bookingsystem.Domains.Booking;

import com.itkolleg.bookingsystem.Domains.Booking.Booking;
import com.itkolleg.bookingsystem.Domains.Employee;
import com.itkolleg.bookingsystem.Domains.Room;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class RoomBooking extends Booking {

    @ManyToOne (fetch = FetchType.EAGER)
    private Room room;

    public RoomBooking(Employee employee, Room room, LocalDateTime bookingStart, LocalDateTime bookingEnd, LocalDateTime bookingTime){
        super(employee, bookingStart, bookingEnd, bookingTime);
        this.room=room;
    }

}