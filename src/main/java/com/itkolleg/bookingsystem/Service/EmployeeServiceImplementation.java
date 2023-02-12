package com.itkolleg.bookingsystem.Service;

import com.itkolleg.bookingsystem.Domains.Employee;
import com.itkolleg.bookingsystem.Exceptions.EmployeeDeletionNotPossibleException;
import com.itkolleg.bookingsystem.Exceptions.EmployeeNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImplementation implements EmployeeService{

    private DBAccessEmployees dbAccessEmployees;

    /**
     * @param dbAccessEmployees
     */
    public EmployeeServiceImplementation(DBAccessEmployees dbAccessEmployees){
        this.dbAccessEmployees = dbAccessEmployees;
    }
    /**
     * @param Employee
     * @return
     */
    @Override
    public Employee addEmployee(Employee Employee) {
        return this.dbAccessEmployees.addEmployee(Employee);
    }

    /**
     * @return
     */
    @Override
    public List<Employee> getAllEmployees() {
        return this.dbAccessEmployees.getAllEmployees();
    }

    /**
     * @param id
     * @return
     */
    @Override
    public Employee getEmployeeById(Long id) throws EmployeeNotFoundException{
        return this.dbAccessEmployees.getEmployeeById(id);
    }

    /**
     * @param id
     * @return
     */
    @Override
    public Employee updateEmployeeById(Long id) throws EmployeeNotFoundException {
        return this.dbAccessEmployees.updateEmployeeById(id);
    }

    /**
     * @param id
     */
    @Override
    public void deleteEmployeeById(Long id) throws EmployeeDeletionNotPossibleException {
       this.dbAccessEmployees.deleteEmployeeById(id);
    }
}
