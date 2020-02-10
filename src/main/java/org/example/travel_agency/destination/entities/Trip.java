package org.example.travel_agency.destination.entities;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Controller;

import javax.persistence.*;
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
    @JoinColumn(name= "hotelId")
    private Hotel hotel;
    private Date depart_Date;
    private Date return_Date;

    @OneToOne
    @JoinColumn
    private Airport placeOfAirport;

    private int price;


    public Trip(Hotel hotel, Date depart_Date, Date return_Date, Airport placeOfAirport, int price) {
        this.hotel = hotel;
        this.depart_Date = depart_Date;
        this.return_Date = return_Date;
        this.placeOfAirport = placeOfAirport;
        this.price = price;
    }

  
}

