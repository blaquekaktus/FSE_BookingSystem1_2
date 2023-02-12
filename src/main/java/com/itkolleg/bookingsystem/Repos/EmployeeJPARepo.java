package com.itkolleg.bookingsystem.Repos;

import com.itkolleg.bookingsystem.Domains.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeeJPARepo extends JpaRepository <Employee, Long>{

    /**
     * @param fname
     * @param lname
     * @return
     */
    //explore use of this method more
    List<Employee> findAllByFnameOrLnameContains(String fname, String lname);

    Employee findEmployeeByFnameOrLnameContaining(String fname, String lname );

    Employee findByNickContains(String nick);
}
