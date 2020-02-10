package org.example.travel_agency.destination.repository;

import org.example.travel_agency.destination.entities.CityAirport;
import org.example.travel_agency.destination.entities.Trip;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CityAirportRepository extends JpaRepository<CityAirport, Integer> {
}