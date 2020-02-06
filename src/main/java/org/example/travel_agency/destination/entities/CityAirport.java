package org.example.travel_agency.destination.entities;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Getter
@Setter
@Entity
@NoArgsConstructor
public class CityAirport {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_City_Airport;

    private String city_Airport_Name;

    public CityAirport(String city_Airport_Name) {
        this.city_Airport_Name = city_Airport_Name;
    }

}

 

