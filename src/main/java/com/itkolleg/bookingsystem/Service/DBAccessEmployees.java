package com.itkolleg.bookingsystem.Service;

import com.itkolleg.bookingsystem.Domains.Employee;
import com.itkolleg.bookingsystem.Exceptions.EmployeeDeletionNotPossibleException;
import com.itkolleg.bookingsystem.Exceptions.EmployeeNotFoundException;

import java.util.List;


public interface DBAccessEmployees {
    Employee addEmployee(Employee Employee);
    List<Employee>getAllEmployees();

    Employee getEmployeeById(Long id) throws EmployeeNotFoundException;

    Employee updateEmployeeById(Long id) throws EmployeeNotFoundException;
    //To Do add exception! (EmployeeDeletionNotPossibleException - Exception Package)
    void deleteEmployeeById(Long id) throws EmployeeDeletionNotPossibleException;
}
