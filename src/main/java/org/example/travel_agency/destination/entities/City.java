package org.example.travel_agency.destination.entities;

import lombok.NoArgsConstructor;

import javax.persistence.*;


@Entity
@NoArgsConstructor
public class City {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_City;

    private String city_Name;

    @OneToOne
    @JoinColumn
//    @Column(name= "country_fk")
    private Country country;


    public Integer getId_City() {
        return id_City;
    }


    public String getCity_Name() {
        return this.city_Name;
    }

    public Country getCountry() {
        return country;
    }

    public City(String city_Name, Country country) {
        this.city_Name = city_Name;
        this.country = country;
    }

    @Override
    public String toString() {
        return "City{" +
                "city='" + city_Name + '\'' +
                ", country=" + country +
                '}';
    }
}