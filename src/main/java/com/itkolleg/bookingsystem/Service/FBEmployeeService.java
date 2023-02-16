package com.itkolleg.bookingsystem.Service;

import com.google.api.core.ApiFuture;
import com.google.cloud.firestore.Firestore;
import com.google.cloud.firestore.WriteResult;
import com.google.firebase.cloud.FirestoreClient;
import com.itkolleg.bookingsystem.Domains.Employee;

import java.util.concurrent.ExecutionException;

public class FBEmployeeService {

    private static final String COLLECTION_NAME = "employees";
    public String createEmployee(Employee employee) throws ExecutionException, InterruptedException {
        Firestore dbFirestore= FirestoreClient.getFirestore();
        ApiFuture <WriteResult> collectionApiFuture=dbFirestore.collection(COLLECTION_NAME).document(employee.getFname()).set(employee);
        return collectionApiFuture.get().getUpdateTime().toString();
    }
}
