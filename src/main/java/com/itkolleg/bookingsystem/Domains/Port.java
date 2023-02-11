package com.itkolleg.bookingsystem.Domains;

import jakarta.persistence.Embeddable;
import jakarta.validation.constraints.Size;
import lombok.*;

@Embeddable
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@ToString
public class Port {
    private Long id;

    @Size(min = 2)
    private String name;

    public Port(String name){
        this.name=name;
    }
}
