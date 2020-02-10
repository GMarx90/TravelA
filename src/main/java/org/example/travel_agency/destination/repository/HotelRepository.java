package org.example.travel_agency.destination.repository;

import org.example.travel_agency.destination.entities.Hotel;
import org.example.travel_agency.destination.entities.Trip;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface HotelRepository extends JpaRepository<Hotel, Integer> {
}