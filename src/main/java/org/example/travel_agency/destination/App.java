package org.example.travel_agency.destination;

import org.example.travel_agency.destination.entities.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.time.LocalDate;
import java.util.Date;

import static org.hibernate.jpa.AvailableSettings.PERSISTENCE_UNIT_NAME;


@SpringBootApplication
public class App {
    private static final String PERSISTENCE_UNIT_NAME = "my-persistence";
    private static EntityManagerFactory factory;

    public static void main(String[] args) {

        SpringApplication.run(App.class, args);

    }
}
