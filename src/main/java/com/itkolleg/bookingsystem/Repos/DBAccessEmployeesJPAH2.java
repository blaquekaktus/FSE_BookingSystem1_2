package com.itkolleg.bookingsystem.Repos;

import com.itkolleg.bookingsystem.Domains.Employee;
import com.itkolleg.bookingsystem.Exceptions.EmployeeDeletionNotPossibleException;
import com.itkolleg.bookingsystem.Exceptions.EmployeeNotFoundException;
import com.itkolleg.bookingsystem.Service.DBAccessEmployees;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class DBAccessEmployeesJPAH2 implements DBAccessEmployees {

    EmployeeJPARepo employeeRepo;

    public DBAccessEmployeesJPAH2(EmployeeJPARepo EmployeeRepo){
        this.employeeRepo = EmployeeRepo;
    }

    /**
     * @param employee
     * @return
     */
    @Override
    public Employee addEmployee(Employee employee) {
        this.employeeRepo.save(employee);
        return employee;
    }

    /**
     * @return
     */
    @Override
    public List<Employee> getAllEmployees() {
        return this.employeeRepo.findAll();
    }

    /**
     * @param id
     * @return
     * @throws EmployeeNotFoundException
     */
    @Override
    public Employee getEmployeeById(Long id) throws EmployeeNotFoundException {
        Optional<Employee>EmployeeOptional = employeeRepo.findById(id);
        if(EmployeeOptional.isPresent()){
            //public T get()
            //If a value is present, returns the value, otherwise throws NoSuchElementException.
            return EmployeeOptional.get();
        }else{
            throw new EmployeeNotFoundException();
        }

    }

    /**
     * @param id
     * @return
     * @throws EmployeeNotFoundException
     */
    @Override
    public Employee updateEmployeeById(Long id) throws EmployeeNotFoundException {
        return null;
    }

    /**
     * @param id
     * @throws EmployeeDeletionNotPossibleException
     */
    @Override
    public void deleteEmployeeById(Long id) throws EmployeeDeletionNotPossibleException {
        try{
            this.employeeRepo.deleteById(id);
        } catch(Exception e){
            System.out.println(e.getCause() + e.getClass().getName());
            throw new EmployeeDeletionNotPossibleException("Employee could not be deleted! \n Possible causes: Employee has current Bookings!");
        }
    }
}
