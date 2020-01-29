package org.example.travel_agency.destination;

public class Airport {

        CityAirport cityAirport;

    public int getId_Airport() {
        return id_Airport;
    }

    private int id_Airport;

        private String airport_Name;

    public Airport(CityAirport cityAirport, String airport_Name) {
        this.cityAirport = cityAirport;
        this.airport_Name = airport_Name;
    }

    public CityAirport getCityAirport() {
        return cityAirport;
    }

    public void setCityAirport(CityAirport cityAirport) {
        this.cityAirport = cityAirport;
    }

    public String getAirport_Name() {
        return airport_Name;
    }

    public void setAirport_Name(String airport_Name) {
        this.airport_Name = airport_Name;
    }
}

