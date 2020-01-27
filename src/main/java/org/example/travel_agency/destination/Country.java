package org.example.travel_agency.destination;

public class Country {

    private String country;

        public String getCountry() {
        return this.country;
    }

    public Country(String country) {
        this.country = country;
    }

    @Override
    public String toString() {
        return "Country{" +
                "country='" + country + '\'' +
                '}';
    }
}
