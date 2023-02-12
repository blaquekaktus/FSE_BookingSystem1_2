package com.itkolleg.bookingsystem.Service;

import com.itkolleg.bookingsystem.Domains.Employee;
import com.itkolleg.bookingsystem.Exceptions.EmployeeDeletionNotPossibleException;
import com.itkolleg.bookingsystem.Exceptions.EmployeeNotFoundException;

import java.util.List;

public interface EmployeeService {
    Employee addEmployee(Employee Employee);
    List<Employee> getAllEmployees();

    Employee getEmployeeById(Long id) throws EmployeeNotFoundException;

    Employee updateEmployeeById(Long id) throws EmployeeNotFoundException;

    void deleteEmployeeById(Long id) throws EmployeeDeletionNotPossibleException;
}
