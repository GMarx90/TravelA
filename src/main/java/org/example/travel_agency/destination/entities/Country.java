package org.example.travel_agency.destination.entities;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@NoArgsConstructor
public class Country {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_Country;

    private String country_Name;

    public Country(String country_Name) {
        this.country_Name = country_Name;
    }


    @Override
    public String toString() {
        return "Country{" +
                "country='" + country_Name + '\'' +
                '}';
    }

    public static class Orders {
    }
}
