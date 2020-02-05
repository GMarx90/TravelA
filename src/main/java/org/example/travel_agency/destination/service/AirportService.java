package org.example.travel_agency.destination.service;

import org.example.travel_agency.destination.entities.Country;
import org.example.travel_agency.destination.entities.City;
import org.example.travel_agency.destination.entities.Hotel;
import org.example.travel_agency.destination.entities.CityAirport;
import org.example.travel_agency.destination.entities.Airport;
import org.example.travel_agency.destination.entities.Trip;
import org.example.travel_agency.destination.repository.CityRepository;
import org.example.travel_agency.destination.repository.TripRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AirportService {

    private AirportRepositry airportRepository;

    @Autowired
    public AirportService(AirportRepositry airportRepository) {
        this.airportRepository = airportRepository;
    }

    public List<Airport> showAllAirports() {
        return airportRepository.findAll();
    }

    public boolean addHotel(Airport airport) {
        airportRepository.save(airport);
        return true;
    }

}