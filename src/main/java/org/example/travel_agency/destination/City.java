package org.example.travel_agency.destination;

public class  City {

    private String city;
    private Country country;

    public String getCity() {
        return this.city;
    }

    public Country getCountry() {
        return country;
    }

    public City(String city, Country country) {
        this.city = city;
        this.country = country;
    }

    @Override
    public String toString() {
        return "City{" +
                "city='" + city + '\'' +
                ", country=" + country +
                '}';
    }
}