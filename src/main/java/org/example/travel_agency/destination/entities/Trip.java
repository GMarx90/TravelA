package org.example.travel_agency.destination.entities;

import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Entity
@NoArgsConstructor
public class Trip {

    @Id
    @GeneratedValue
    private int id_Trip;
    /*  HolidayDuration holiday jeszcze mozna dodac do konstruktora tylko jak to potem podpiac*/

    @OneToOne
    @JoinColumn
    private Hotel hotel;
    private Date depart_Date;
    private Date return_Date;

    @OneToOne
    @JoinColumn
    private Airport placeOfAirport;

//    private HolidayDuration holiday;
    private int price;

    public int getId_Trip() {

        return id_Trip;
    }


    public Trip(Hotel hotel, Date depart_Date, Date return_Date, Airport placeOfAirport, int price) {
        this.hotel = hotel;
        this.depart_Date = depart_Date;
        this.return_Date = return_Date;
        this.placeOfAirport = placeOfAirport;
   /*     this.holiday = holiday;*/
        this.price = price;
    }


    public Hotel getHotel() {
        return hotel;
    }

    public void setHotel(Hotel hotel) {
        this.hotel = hotel;
    }

    public Date getDepart_Date() {
        return depart_Date;
    }

    public void setDepart_Date(Date depart_Date) {
        this.depart_Date = depart_Date;
    }

    public Date getReturn_Date() {
        return return_Date;
    }

    public void setReturn_Date(Date return_Date) {
        this.return_Date = return_Date;
    }

    public Airport getPlaceOfAirport() {
        return placeOfAirport;
    }

    public void setPlaceOfAirport(Airport palceOfAirport) {
        this.placeOfAirport = palceOfAirport;
    }

//    public HolidayDuration getHoliday() {
//        return holiday;
//    }

//    public void setHoliday(HolidayDuration holiday) {
//        this.holiday = holiday;
//    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}

