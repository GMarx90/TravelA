package org.example.travel_agency.destination.service;

import org.example.travel_agency.destination.entities.City;
import org.example.travel_agency.destination.entities.Trip;
import org.example.travel_agency.destination.repository.TripRepository;

public class ShowTrips {

    private final TripRepository tripRepository;

    public ShowTrips(TripRepository tripRepository) {
        this.tripRepository = tripRepository;
    }

    void showAllTrips(){
        tripRepository.findAll();
    }

}
