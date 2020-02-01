package org.example.travel_agency.destination.repository;

import org.example.travel_agency.destination.entities.City;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TripRepository extends JpaRepository<City,Integer> {
}
