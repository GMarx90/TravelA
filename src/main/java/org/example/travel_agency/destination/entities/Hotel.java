package org.example.travel_agency.destination.entities;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@NoArgsConstructor
public class Hotel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_Hotel;
    private String name;
    private double stars;
    private String allimentation;
    private String description;

    @OneToOne
    @JoinColumn(name = "cityFk")
    private City city;

    public Hotel(double stars, String name, String allimentation, String description, City city) {
        this.name = name;
        this.stars = stars;
        this.allimentation = allimentation;
        this.description = description;
        this.city = city;
    }

}

