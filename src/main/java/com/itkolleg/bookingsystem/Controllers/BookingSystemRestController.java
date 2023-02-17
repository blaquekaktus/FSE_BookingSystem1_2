package com.itkolleg.bookingsystem.Controllers;

import com.itkolleg.bookingsystem.Domains.Desk;
import com.itkolleg.bookingsystem.Domains.Employee;
import com.itkolleg.bookingsystem.Exceptions.DeskNotFoundException;
import com.itkolleg.bookingsystem.Exceptions.DeskValidationException;
import com.itkolleg.bookingsystem.Exceptions.EmployeeNotFoundException;
import com.itkolleg.bookingsystem.Exceptions.EmployeeValidationException;
import com.itkolleg.bookingsystem.Service.BookingService;
import com.itkolleg.bookingsystem.Service.DeskService;
import com.itkolleg.bookingsystem.Service.EmployeeService;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://127.0.0.1:5500")
public class BookingSystemRestController {
    EmployeeService employeeService;
    DeskService deskService;
    BookingService bookingService;

    public BookingSystemRestController(EmployeeService employeeService, DeskService deskService, BookingService bookingService){
        this.employeeService=employeeService;
        this.deskService=deskService;
        this.bookingService=bookingService;
    }

    @GetMapping("api/v1/employees/")
    public ResponseEntity<List<Employee>> getAllEmployees(){
        return ResponseEntity.ok(this.employeeService.getAllEmployees());
    }

    @GetMapping("api/v1/employees/{id}")
    public ResponseEntity <Employee> getEmployeeByID(@PathVariable Long id) throws EmployeeNotFoundException {
        return ResponseEntity.ok(this.employeeService.getEmployeeById(id));
    }

    @PostMapping("api/v1/employees/")
    public ResponseEntity<Employee>addEmployee(@Valid @RequestBody Employee employee, BindingResult bindingResult) throws EmployeeValidationException{
        String errors = "";
        if(bindingResult.hasFieldErrors()) {
            for (ObjectError error : bindingResult.getAllErrors()) {
                errors += "\nValidation Error for object " + error.getObjectName()
                        + " in Field " + ((FieldError) error).getField()
                        + "with the following Problem: " + error.getDefaultMessage();
            }
            throw new EmployeeValidationException(errors);
        }else{
            Employee newEmployee = this.employeeService.addEmployee(employee);
            return ResponseEntity.ok(newEmployee);
        }
    }

    @GetMapping("api/v1/desks/")
    public ResponseEntity<List<Desk>> getAllDesks(){
        return ResponseEntity.ok(this.deskService.getAllDesk());
    }

    @GetMapping("api/v1/desks/{id}")
    public ResponseEntity <Desk> getDeskByID(@PathVariable Long id) throws DeskNotFoundException {
        return ResponseEntity.ok(this.deskService.getDeskById(id));
    }

    @PostMapping("api/v1/desks/")
    public ResponseEntity<Desk>addDesk(@Valid @RequestBody Desk desk, BindingResult bindingResult) throws DeskValidationException {
        String errors = "";
        if(bindingResult.hasFieldErrors()) {
            for (ObjectError error : bindingResult.getAllErrors()) {
                errors += "\nValidation Error for object " + error.getObjectName()
                        + " in Field " + ((FieldError) error).getField()
                        + "with the following Problem: " + error.getDefaultMessage();
            }
            throw new DeskValidationException(errors);
        }else{
            Desk newDesk = this.deskService.addDesk(desk);
            return ResponseEntity.ok(newDesk);
        }
    }


}
