package org.example.travel_agency.destination.service;

import org.example.travel_agency.destination.entities.Trip;
import org.example.travel_agency.destination.repository.TripRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Service
public class TripsService {

    private TripRepository tripRepository;

    @Autowired
    public TripsService(TripRepository tripRepository) {
        this.tripRepository = tripRepository;
    }

    public List<Trip> showAllTrips() {
        return tripRepository.findAll();
    }

    public boolean addTrip(Trip trip) {
        tripRepository.save(trip);
        return true;
    }

}
