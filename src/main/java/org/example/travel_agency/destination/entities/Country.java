package org.example.travel_agency.destination.entities;

import lombok.NoArgsConstructor;

import javax.persistence.*;

@Getter @Setter
@Entity
@Table
@NoArgsConstructor
public class Country {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id_Country;

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
}
