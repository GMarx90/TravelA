package org.example.travel_agency.destination.entities;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

/**
 * Klasa lotniska/
 */
@Getter
@Setter
@Entity
@NoArgsConstructor
public class Airport {

    @Id
    @GeneratedValue
    private int id_Airport;

    @OneToOne
    @JoinColumn(name = "cityAirportId")
    private CityAirport cityAirport;

    private String airport_Name;

    public void setCityAirport(CityAirport cityAirport) {
        this.cityAirport = cityAirport;
    }

}


