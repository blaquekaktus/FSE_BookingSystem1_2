package com.itkolleg.bookingsystem.Domains;

import jakarta.persistence.*;
import lombok.*;

import java.sql.Date;
import java.sql.Timestamp;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Booking {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    @ManyToOne(fetch=FetchType.EAGER)
    //@JoinColumn(name = "user_id")
    private User user;

    @ManyToOne(fetch=FetchType.EAGER)

    private Desk desk;

    private Date bookingStart;
    private Date bookingEnd;
    private Timestamp bookingTime;

    public Booking(User user, Desk desk, Date bookingStart, Date bookingEnd, Timestamp bookingTime){
        this.user=user;
        this.desk=desk;
        this.bookingStart=bookingStart;
        this.bookingEnd=bookingEnd;
        this.bookingTime=bookingTime;
    }
}
