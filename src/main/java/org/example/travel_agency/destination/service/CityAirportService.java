package org.example.travel_agency.destination.service;

import org.example.travel_agency.destination.entities.Country;
import org.example.travel_agency.destination.entities.City;
import org.example.travel_agency.destination.entities.Hotel;
import org.example.travel_agency.destination.entities.CityAirport;
import org.example.travel_agency.destination.entities.Trip;
import org.example.travel_agency.destination.repository.CityRepository;
import org.example.travel_agency.destination.repository.TripRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CityAirportService {

    private CityAirportRepositry cityAirportRepository;

    @Autowired
    public CityAirportService(CityAirportRepositry cityAirportRepository) {
        this.cityAirportRepository = cityAirportRepository;
    }

    public List<CityAirport> showAllCityAirport() {
        return cityAirportRepository.findAll();
    }

    public boolean addCityAirport(CityAirport cityAirport) {
        cityAirportRepository.save(cityAirport);
        return true;
    }

}
