package com.itkolleg.bookingsystem.Domains;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Size;
import lombok.*;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    //limit length of name
    @Size(min = 2, max = 50)
    private String fname;

    @Size(min = 2, max = 50)
    private String lname;

    //nick darf leer sein
    @Size(max = 10)
    private String nick;

    @Email
    private String email;
    private String password;

    private Role role;

    public User(String fname, String lname, String nick, String email, String password, Role role){
        this.fname=fname;
        this.lname=lname;
        this.nick=nick;
        this.email=email;
        this.password=password;
        this.role=role;
    }

}
