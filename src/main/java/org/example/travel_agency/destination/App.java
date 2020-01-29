package org.example.travel_agency.destination;

import org.example.travel_agency.destination.entities.*;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.time.LocalDate;
import java.util.Date;

import static org.hibernate.jpa.AvailableSettings.PERSISTENCE_UNIT_NAME;

/**
 * Hello world!
 */

@SpringBootApplication
public class App {
    private static final String PERSISTENCE_UNIT_NAME = "my-persistence";
    private static EntityManagerFactory factory;

    public static void main(String[] args) {
        factory = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);
        EntityManager em = factory.createEntityManager();

        em.close();
        factory.close();


//        Country Hiszpania = new Country("Hiszpania");
//        City Barcelona = new City("Barcelona", Hiszpania);
//        Hotel Stark = new Hotel(3.5, "B&b", "Near to beach", Barcelona);
//        CityAirport Katowice = new CityAirport("Katowice");
//        Airport KTW = new Airport(Katowice, "Pyrzowice");
//        Date dateOfDeparture = new Date();
//        dateOfDeparture.setTime(1000);
//        Date dateOfReturn = new Date();
//        dateOfReturn.setTime(2000);
//        Trip trip1 = new Trip(Stark, dateOfDeparture, dateOfReturn, KTW, 1890);
//        System.out.println(trip1.getHotel());
    }
}
