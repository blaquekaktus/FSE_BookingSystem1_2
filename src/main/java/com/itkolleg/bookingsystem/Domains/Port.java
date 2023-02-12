package com.itkolleg.bookingsystem.Domains;

import jakarta.persistence.Embeddable;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Size;
import lombok.*;

@Embeddable
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@ToString
public class Port {
    //@Id
    //@GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Size(min = 2)
    private String name;

    public Port(String name){
        this.name=name;
    }
}
