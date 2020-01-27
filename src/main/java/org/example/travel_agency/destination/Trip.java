package org.example.travel_agency.destination;

import java.time.LocalDate;
import java.time.Period;

public class Trip {
    Hotel hotel;
    private LocalDate dateOfDeparture = LocalDate.parse("2020-07-11");
    private LocalDate dateOfReturn = LocalDate.parse("2020-07-25");
    private Departure palceOfDeparture;
    private HolidayDuration holiday;
    private int price;

    /*  HolidayDuration holiday jeszcze mozna dodac do konstruktora tylko jak to potem podpiac*/
    public Trip(Hotel hotel, LocalDate dateOfDeparture, LocalDate dateOfReturn, Departure palceOfDeparture, int price) {
        this.hotel = hotel;
        this.dateOfDeparture = dateOfDeparture;
        this.dateOfReturn = dateOfReturn;
        this.palceOfDeparture = palceOfDeparture;
   /*     this.holiday = holiday;*/
        this.price = price;
    }

    public Trip(Hotel stark, int i, int i1, Departure ktw, int price) {
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

    public LocalDate getDateOfDeparture() {
        return dateOfDeparture;
    }

    public void setDateOfDeparture(LocalDate dateOfDeparture) {
        this.dateOfDeparture = dateOfDeparture;
    }

    public LocalDate getDateOfReturn() {
        return dateOfReturn;
    }

    public void setDateOfReturn(LocalDate dateOfReturn) {
        this.dateOfReturn = dateOfReturn;
    }

    public Departure getPalceOfDeparture() {
        return palceOfDeparture;
    }

    public void setPalceOfDeparture(Departure palceOfDeparture) {
        this.palceOfDeparture = palceOfDeparture;
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

