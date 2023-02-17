package com.itkolleg.bookingsystem.Domains;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

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
    //@JoinColumn(name = "employee_id")
    private Employee employee;

    @ManyToOne(fetch=FetchType.EAGER)
    //@JoinColumn(name = "desk_id")
    private Desk desk;

    private LocalDateTime bookingStart;
    private LocalDateTime bookingEnd;
    private LocalDateTime bookingTime;

    public Booking(Employee employee, Desk desk, LocalDateTime bookingStart, LocalDateTime bookingEnd, LocalDateTime bookingTime){
        this.employee=employee;
        this.desk=desk;
        this.bookingStart=bookingStart;
        this.bookingEnd=bookingEnd;
        this.bookingTime=bookingTime;
    }
}
