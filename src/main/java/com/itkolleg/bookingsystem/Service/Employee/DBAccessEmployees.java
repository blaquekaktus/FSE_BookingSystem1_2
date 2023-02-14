package com.itkolleg.bookingsystem.Service.Employee;

import com.itkolleg.bookingsystem.Domains.Employee;
import com.itkolleg.bookingsystem.Exceptions.EmployeeExceptions.EmployeeDeletionNotPossibleException;
import com.itkolleg.bookingsystem.Exceptions.EmployeeExceptions.EmployeeNotFoundException;

import java.util.List;


public interface DBAccessEmployees {
    Employee addEmployee(Employee Employee);
    List<Employee>getAllEmployees();

    Employee getEmployeeById(Long id) throws EmployeeNotFoundException;

    Employee updateEmployeeById(Long id) throws EmployeeNotFoundException;
    //To Do add exception! (EmployeeDeletionNotPossibleException - Exception Package)
    void deleteEmployeeById(Long id) throws EmployeeDeletionNotPossibleException;
}
