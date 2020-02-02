package org.example.travel_agency.destination.repository;

import org.example.travel_agency.destination.entities.City;
import org.example.travel_agency.destination.entities.Trip;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TripRepository extends JpaRepository<Trip,Integer> {
}
