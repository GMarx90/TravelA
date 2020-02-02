package org.example.travel_agency.destination.service;

import org.example.travel_agency.destination.entities.City;
import org.example.travel_agency.destination.entities.Trip;
import org.example.travel_agency.destination.repository.TripRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

public class ShowTrips {

    private TripRepository tripRepository;

    @Autowired
    public ShowTrips(TripRepository tripRepository) {
        this.tripRepository = tripRepository;
    }

    List<Trip> showAllTrips(){
       return tripRepository.findAll();
    }

}
