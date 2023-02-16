package com.itkolleg.bookingsystem.Firebase;

import com.google.auth.oauth2.GoogleCredentials;
import com.google.firebase.FirebaseApp;
import com.google.firebase.FirebaseOptions;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Objects;

@SpringBootApplication
public class CRUDRunner {
    //public static void main(String[] args) throws IOException {

       ClassLoader classLoader = FirebaseInitializer.class.getClassLoader();

       File file = new File(Objects.requireNonNull(classLoader.getResource("serviceAccountKey.json")).getFile());
        FileInputStream serviceAccount =
                null;
        try {
            serviceAccount = new FileInputStream(file.getAbsolutePath());
        } catch (FileNotFoundException ex) {
            throw new RuntimeException(ex);
        }

        FirebaseOptions options = new FirebaseOptions.Builder()
                        .setCredentials(GoogleCredentials.fromStream(serviceAccount))
                        .setDatabaseUrl("https://work-area-booking-program-default-rtdb.europe-west1.firebasedatabase.app/")
                        .build();

                FirebaseApp.initializeApp(options);

        SpringApplication.run(FirebaseInitializer.class, args);
    }
}


