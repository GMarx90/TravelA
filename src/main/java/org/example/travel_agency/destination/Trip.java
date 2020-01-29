package org.example.travel_agency.destination;

import java.time.LocalDate;

public class Trip {
    Hotel hotel;
    private LocalDate depart_Date = LocalDate.parse("2020-07-11");
    private LocalDate return_Date = LocalDate.parse("2020-07-25");
    private Airport palceOfAirport;
    private HolidayDuration holiday;
    private int price;

    public int getId_Trip() {
        return id_Trip;
    }

    private int id_Trip;
    /*  HolidayDuration holiday jeszcze mozna dodac do konstruktora tylko jak to potem podpiac*/
    public Trip(Hotel hotel, LocalDate depart_Date, LocalDate return_Date, Airport palceOfAirport, int price) {
        this.hotel = hotel;
        this.depart_Date = depart_Date;
        this.return_Date = return_Date;
        this.palceOfAirport = palceOfAirport;
   /*     this.holiday = holiday;*/
        this.price = price;
    }

    public Trip(Hotel stark, int i, int i1, Airport ktw, int price) {
    }/*
    public Period holdayDuration(int dateOfDeparture, int dateOfReturn){
        Period holidayDuration=Period.between(dateOfDeparture, dateOfReturn);
        return holidayDuration;

    }*/

    public Hotel getHotel() {
        return hotel;
    }

    public void setHotel(Hotel hotel) {
        this.hotel = hotel;
    }

    public LocalDate getDepart_Date() {
        return depart_Date;
    }

    public void setDepart_Date(LocalDate depart_Date) {
        this.depart_Date = depart_Date;
    }

    public LocalDate getReturn_Date() {
        return return_Date;
    }

    public void setReturn_Date(LocalDate return_Date) {
        this.return_Date = return_Date;
    }

    public Airport getPalceOfAirport() {
        return palceOfAirport;
    }

    public void setPalceOfAirport(Airport palceOfAirport) {
        this.palceOfAirport = palceOfAirport;
    }

    public HolidayDuration getHoliday() {
        return holiday;
    }

    public void setHoliday(HolidayDuration holiday) {
        this.holiday = holiday;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}

