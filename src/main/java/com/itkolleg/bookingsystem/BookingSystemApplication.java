package com.itkolleg.bookingsystem;

import com.itkolleg.bookingsystem.Domains.Role;
import com.itkolleg.bookingsystem.Domains.User;
import com.itkolleg.bookingsystem.Repos.UserJPARepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication

public class BookingSystemApplication implements ApplicationRunner {

    @Autowired
    UserJPARepo userJPARepo;
    public static void main(String[] args) {
        SpringApplication.run(BookingSystemApplication.class, args);
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {
        System.out.println("Hallo Sonja, you beautiful soul!");

        //User user1 = new User("Sonja", "Lechner", "Blaque", "sonja@email.com", "password", Role.Admin);
        //User user2 = new User("Kesira", "Lechner", "", "Kesira@email.com", "password", Role.P_User);
        //User user3 = new User("Camille", "Lechner", "Cammy", "Camille@email.com", "password", Role.Operator);

        //this.userJPARepo.save(user1);
    }
}
