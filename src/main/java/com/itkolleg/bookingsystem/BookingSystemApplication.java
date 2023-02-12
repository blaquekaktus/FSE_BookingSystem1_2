package com.itkolleg.bookingsystem;

import com.itkolleg.bookingsystem.Domains.Role;
import com.itkolleg.bookingsystem.Domains.Employee;
import com.itkolleg.bookingsystem.Repos.EmployeeJPARepo;
import com.itkolleg.bookingsystem.Service.DBAccessEmployees;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication

public class BookingSystemApplication implements ApplicationRunner {

    @Autowired
    DBAccessEmployees dbAccessEmployees;
    public static void main(String[] args) {
        SpringApplication.run(BookingSystemApplication.class, args);
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {
        System.out.println("Hallo Sonja, you beautiful soul!");

        Employee  employee1 = new Employee("Sonja", "Lechner", "Blaque", "sonja@email.com", "password", Role.ADMIN);
        Employee employee2 = new Employee("Kesira", "Lechner", "", "Kesira@email.com", "password", Role.P_EMPLOYEE);
        Employee employee3 = new Employee("Camille", "Lechner", "Cammy", "Camille@email.com", "password", Role.OPERATOR);

        dbAccessEmployees.addEmployee(employee1);
        dbAccessEmployees.addEmployee(employee2);
        dbAccessEmployees.addEmployee(employee3);
    }
}
