package org.example.travel_agency.destination.entities;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Controller;

import javax.persistence.*;
import java.time.Duration;
import java.time.LocalDate;
import java.time.Period;
import java.util.Date;

@Getter
@Setter
@Entity
@NoArgsConstructor
@Controller
public class Trip {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_Trip;

    @OneToOne
    @JoinColumn(name = "hotelFk")
    private Hotel hotel;
    private LocalDate depart_Date;
    private LocalDate return_Date;
    //private Period duration = Period.between(depart_Date, return_Date);



    @OneToOne
    @JoinColumn(name = "airportFk")
    private Airport placeOfAirport;

    private double price;


    public Trip(Hotel hotel, LocalDate depart_Date, LocalDate return_Date, Airport placeOfAirport, int price) {
        this.hotel = hotel;
        this.depart_Date = depart_Date;
        this.return_Date = return_Date;
        this.placeOfAirport = placeOfAirport;
        this.price = price;
    }


}

