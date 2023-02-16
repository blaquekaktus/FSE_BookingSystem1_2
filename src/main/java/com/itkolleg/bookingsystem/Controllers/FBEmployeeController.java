package com.itkolleg.bookingsystem.Controllers;

import com.itkolleg.bookingsystem.Domains.Employee;
import com.itkolleg.bookingsystem.Service.FBEmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.ExecutionException;

@RestController
@RequestMapping("/api")
public class FBEmployeeController {
    @Autowired
    private FBEmployeeService employeeService;

    public String createEmployee(@RequestBody Employee employee) throws ExecutionException, InterruptedException {
        return employeeService.createEmployee(employee);
    }
}
