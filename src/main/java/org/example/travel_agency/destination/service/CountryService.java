package org.example.travel_agency.destination.service;

import org.example.travel_agency.destination.entities.Country;
import org.example.travel_agency.destination.entities.Trip;
import org.example.travel_agency.destination.repository.CountryRepository;
import org.example.travel_agency.destination.repository.TripRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CountryService {

    private CountryRepository countryRepository;

    @Autowired
    public CountryService(CountryRepository countryRepository) {
        this.countryRepository = countryRepository;
    }

    public List<Country> showAllCountries() {
        return countryRepository.findAll();
    }

    public boolean addCountry(Country country) {
        countryRepository.save(country);
        return true;
    }

}
