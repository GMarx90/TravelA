package org.example.travel_agency.destination.service;

import org.example.travel_agency.destination.entities.Country;
import org.example.travel_agency.destination.entities.Trip;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
public class RController {

    private TripsService tripsService;
    private CountryService countryService;

    @Autowired
    public RController(TripsService tripsService, CountryService countryService) {
        this.tripsService = tripsService;
        this.countryService = countryService;
    }

    @GetMapping("/trips")
    public List<Trip> showAll() {
        return tripsService.showAllTrips();
    }

    @PostMapping("/trip")
    public HttpStatus addTrip(@RequestBody Trip trip) {
        boolean b = tripsService.addTrip(trip);
        if (b) {
            return HttpStatus.ACCEPTED;
        }
        return HttpStatus.BAD_REQUEST;
    }


    @GetMapping("/countries")
    public List<Country> showAllC() {
        return countryService.showAllCountries();

    }

    @PostMapping("/country")
    public HttpStatus addCountry(@RequestBody Country country) {
        boolean b = countryService.addCountry(country);
        if (b) {
            return HttpStatus.ACCEPTED;
        }
        return HttpStatus.BAD_REQUEST;
    }

}
