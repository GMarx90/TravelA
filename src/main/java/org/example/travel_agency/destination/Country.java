package org.example.travel_agency.destination;

public class Country {

    private String country_Name;

    public int getId_Country() {
        return id_Country;
    }

    private int id_Country;

        public String getCountry_Name() {
        return this.country_Name;
    }

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
