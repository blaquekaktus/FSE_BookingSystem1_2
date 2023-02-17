package com.itkolleg.bookingsystem;

import com.itkolleg.bookingsystem.Domains.Desk;
import com.itkolleg.bookingsystem.Domains.Port;
import com.itkolleg.bookingsystem.Domains.Role;
import com.itkolleg.bookingsystem.Domains.Employee;
import com.itkolleg.bookingsystem.Service.DBAccessDesks;
import com.itkolleg.bookingsystem.Service.DBAccessEmployees;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;

@SpringBootApplication

public class BookingSystemApplication implements ApplicationRunner {

    @Autowired
    DBAccessEmployees dbAccessEmployees;

    @Autowired
    DBAccessDesks dbAccessDesks;

    public static void main(String[] args) {
        SpringApplication.run(BookingSystemApplication.class, args);
    }
    @Override
    public void run(ApplicationArguments args) throws Exception {
        System.out.println("\n\nApp is up and running\n");

        Employee employee1 = new Employee("Sonja", "Lechner", "Blaque", "sonja@email.com", "password", Role.ADMIN);
        Employee employee2 = new Employee("Kesira", "Lechner", "", "Kesira@email.com", "password", Role.P_EMPLOYEE);
        Employee employee3 = new Employee("Camille", "Lechner", "Cammy", "Camille@email.com", "password", Role.OPERATOR);

        dbAccessEmployees.addEmployee(employee1);
        dbAccessEmployees.addEmployee(employee2);
        dbAccessEmployees.addEmployee(employee3);

        System.out.println("\nEmployees added to database\n");

        Port hdmi = new Port("HDMI");
        Port usba = new Port("USB-A");
        Port usbb = new Port("USB-B");
        Port usbc = new Port("USB-C");
        Port micro = new Port("Micro USB");
        Port mini = new Port("Mini USB");
        Port dvi = new Port("DVI");
        Port rj45 = new Port("ETHERNET");
        Port display = new Port("Display");
        Port vga = new Port("VGA");
        Port audio = new Port("Audio Only");
        Port io = new Port("Line in/out");
        Port thunderbolt = new Port("Thunderbolt");
        Port sd = new Port("Card-Reader");

        ArrayList<Port> d1 = new ArrayList<Port>();
        d1.add(usba);
        d1.add(usbc);
        d1.add(hdmi);
        d1.add(io);
        d1.add(display);

        ArrayList<Port> d2 = new ArrayList<Port>();
        d2.add(usba);
        d2.add(usbc);
        d2.add(io);
        d2.add(display);

        ArrayList<Port> d3 = new ArrayList<Port>();
        d3.add(rj45);
        d3.add(usbb);
        d3.add(io);
        d3.add(display);

        Desk desk1 = new Desk( "1-1", 2,d1);
        Desk desk2 = new Desk( "1-2", 1,d2);
        Desk desk3 = new Desk( "1-3", 2,d3);

        dbAccessDesks.addDesk(desk1);
        dbAccessDesks.addDesk(desk2);
        dbAccessDesks.addDesk(desk3);

        System.out.println("\nDesks added to database");
    }
}
