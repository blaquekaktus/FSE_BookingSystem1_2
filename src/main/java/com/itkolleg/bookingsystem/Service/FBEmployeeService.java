package com.itkolleg.bookingsystem.Service;

import com.google.api.core.ApiFuture;
import com.google.cloud.firestore.Firestore;
import com.google.cloud.firestore.WriteResult;
import com.google.firebase.cloud.FirestoreClient;
import com.itkolleg.bookingsystem.Domains.Employee;
import com.itkolleg.bookingsystem.Exceptions.EmployeeDeletionNotPossibleException;
import com.itkolleg.bookingsystem.Exceptions.EmployeeNotFoundException;

import java.util.List;
import java.util.concurrent.ExecutionException;

public class FBEmployeeService implements EmployeeService {

    private static final String COLLECTION_NAME = "employees";
    public String createEmployee(Employee employee) throws ExecutionException, InterruptedException {
        Firestore dbFirestore= FirestoreClient.getFirestore();
        ApiFuture <WriteResult> collectionApiFuture=dbFirestore.collection(COLLECTION_NAME).document(employee.getFname()).set(employee);
        return collectionApiFuture.get().getUpdateTime().toString();
    }

    /**
     * @param Employee
     * @return
     */
    @Override
    public Employee addEmployee(Employee Employee) {
        return null;
    }

    /**
     * @return
     */
    @Override
    public List<Employee> getAllEmployees() {
        return null;
    }

    /**
     * @param id
     * @return
     * @throws EmployeeNotFoundException
     */
    @Override
    public Employee getEmployeeById(Long id) throws EmployeeNotFoundException {
        return null;
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

    }
}
