package org.example.travel_agency.destination.entities;

import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
@NoArgsConstructor
public class Airport {

    @Id
    @GeneratedValue
    private int id_Airport;

    @OneToOne
    private CityAirport cityAirport;

    private String airport_Name;

    public int getId_Airport() {
        return id_Airport;
    }


    public Airport(CityAirport cityAirport, String airport_Name) {
        this.cityAirport = cityAirport;
        this.airport_Name = airport_Name;
    }

    public CityAirport getCityAirport() {
        return cityAirport;
    }

    public void setCityAirport(CityAirport cityAirport) {
        this.cityAirport = cityAirport;
    }

    public String getAirport_Name() {
        return airport_Name;
    }

    public void setAirport_Name(String airport_Name) {
        this.airport_Name = airport_Name;
    }
}

