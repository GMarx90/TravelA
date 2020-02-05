package org.example.travel_agency.destination.entities;

import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Getter @Setter
@Entity
@NoArgsConstructor
public class Airport {

    @Id
    @GeneratedValue
    private int id_Airport;

    @OneToOne
    @JoinColumn(name="cityAirportId)   // Brakło JoinColumn
    private CityAirport cityAirport;

    private String airport_Name;


//     public Airport(CityAirport cityAirport, String airport_Name) {
//         this.cityAirport = cityAirport;
//         this.airport_Name = airport_Name;
//     }
//                 NIE WIEM CZY TAKI KONSTRUKTOR JEST TU WGL POTRZEBNY

    
    public void setCityAirport(CityAirport cityAirport) {
        this.cityAirport = cityAirport;
    }

    }
}

