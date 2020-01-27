package org.example.travel_agency.destination;

public class Departure {

        DepartCity departCity;

        private String airportName;

    public Departure(DepartCity departCity, String airportName) {
        this.departCity = departCity;
        this.airportName = airportName;
    }

    public DepartCity getDepartCity() {
        return departCity;
    }

    public void setDepartCity(DepartCity departCity) {
        this.departCity = departCity;
    }

    public String getAirportName() {
        return airportName;
    }

    public void setAirportName(String airportName) {
        this.airportName = airportName;
    }
}

