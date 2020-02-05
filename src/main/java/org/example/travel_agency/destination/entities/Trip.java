package org.example.travel_agency.destination.entities;

import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Getter @Setter
@Entity
@NoArgsConstructor
public class Trip {

    @Id
    @GeneratedValue
    private int id_Trip;
    /*  HolidayDuration holiday jeszcze mozna dodac do konstruktora tylko jak to potem podpiac*/

    @OneToOne
    @JoinColumn(name= "hotelId") // zobacz czy działa, Dwa razy było Join column
    private Hotel hotel;
    private Date depart_Date;
    private Date return_Date;

    @OneToOne
    @JoinColumn(name="idAirport") //Zabacz czy działa, Dwa razy było Join column
    private Airport placeOfAirport;

//    private HolidayDuration holiday;
    private int price;


    public Trip(Hotel hotel, Date depart_Date, Date return_Date, Airport placeOfAirport, int price) {
        this.hotel = hotel;
        this.depart_Date = depart_Date;
        this.return_Date = return_Date;
        this.placeOfAirport = placeOfAirport;
   /*     this.holiday = holiday;*/
        this.price = price;
    }

  
}

