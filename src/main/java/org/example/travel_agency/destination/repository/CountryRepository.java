package org.example.travel_agency.destination.repository;

import org.example.travel_agency.destination.entities.Country;
import org.example.travel_agency.destination.entities.Trip;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CountryRepository extends JpaRepository<Country,Integer> {
}
