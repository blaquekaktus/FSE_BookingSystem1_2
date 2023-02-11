package com.itkolleg.bookingsystem.Domains;

import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Desk {
    @Id
    @GeneratedValue(strategy= GenerationType.SEQUENCE)
    private Long id;

    private String deskNr;

    private int nrOfMonitors;

    @ElementCollection
    private ArrayList<Port>port;

    public Desk(String deskNr, int nrOfMonitors, ArrayList<Port>port){
        this.deskNr=deskNr;
        this.nrOfMonitors=nrOfMonitors;
        this.port=port;
    }
}
