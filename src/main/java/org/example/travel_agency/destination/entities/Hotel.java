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
    private  int  id_Hotel;
    private double stars;
    private String allimentation;
    private String description;

    @OneToOne
    @JoinColumn
    @Column(name= "cityFk") //Zobacz czy teraz działa
    private City city;

    public Hotel(double stars, String allimentation, String description, City city) {
        this.stars = stars;
        this.allimentation = allimentation;
        this.description = description;
        this.city = city;
    }


    @Override
    public String toString() {
        return "Hotel{" +
                "stars=" + stars +
                ", allimentation='" + allimentation + '\'' +
                ", description='" + description + '\'' +
                ", city=" + city +
                '}';
    }
}
