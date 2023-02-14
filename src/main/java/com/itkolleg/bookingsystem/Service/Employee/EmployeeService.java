package com.itkolleg.bookingsystem.Service.Employee;

import com.itkolleg.bookingsystem.Domains.Employee;
import com.itkolleg.bookingsystem.Exceptions.EmployeeExceptions.EmployeeDeletionNotPossibleException;
import com.itkolleg.bookingsystem.Exceptions.EmployeeExceptions.EmployeeNotFoundException;

import java.util.List;

public interface EmployeeService {
    Employee addEmployee(Employee Employee);
    List<Employee> getAllEmployees();

    Employee getEmployeeById(Long id) throws EmployeeNotFoundException;

    Employee updateEmployeeById(Long id) throws EmployeeNotFoundException;

    void deleteEmployeeById(Long id) throws EmployeeDeletionNotPossibleException;
}
