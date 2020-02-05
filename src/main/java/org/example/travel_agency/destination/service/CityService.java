package org.example.travel_agency.destination.service;

import org.example.travel_agency.destination.entities.Country;
import org.example.travel_agency.destination.entities.City;
import org.example.travel_agency.destination.entities.Hotel;
import org.example.travel_agency.destination.entities.Trip;
import org.example.travel_agency.destination.repository.CityRepository;
import org.example.travel_agency.destination.repository.TripRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CityService {

    private CityRepository cityRepository;

    @Autowired
    public CityService(CityRepository cityRepositor) {
        this.cityRepository = cityRepository;
    }

    public List<City> showAllCities() {
        return cityRepository.findAll();
    }

    public boolean addCity(City city) {
        cityRepository.save(city);
        return true;
    }

}
