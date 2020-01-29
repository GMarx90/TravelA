package org.example.travel_agency.destination.entities;

import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@NoArgsConstructor
public class Hotel {

    @Id
    @GeneratedValue
    private  int  id_Hotel;
    private double stars;
    private String allimentation;
    private String description;

    @OneToOne
    @JoinColumn
    private City city;

    public Hotel(double stars, String allimentation, String description, City city) {
        this.stars = stars;
        this.allimentation = allimentation;
        this.description = description;
        this.city = city;
    }

    public double getStars() {
        return stars;
    }

    public void setStars(double stars) {
        this.stars = stars;
    }

    public String getAllimentation() {
        return allimentation;
    }

    public void setAllimentation(String allimentation) {
        this.allimentation = allimentation;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
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
