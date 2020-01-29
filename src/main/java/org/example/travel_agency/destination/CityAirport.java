package org.example.travel_agency.destination;

public class CityAirport {
     private String city_Airport_Name;

    public int getId_City_Airport() {
        return id_City_Airport;
    }

    private int id_City_Airport;

    public CityAirport(String city_Airport_Name) {
        this.city_Airport_Name = city_Airport_Name;
    }

    public String getCity_Airport_Name() {
        return city_Airport_Name;
    }

    public void setCity_Airport_Name(String city_Airport_Name) {
        this.city_Airport_Name = city_Airport_Name;
    }
}

