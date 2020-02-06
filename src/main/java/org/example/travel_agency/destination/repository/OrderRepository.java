package org.example.travel_agency.destination.repository;

import org.example.travel_agency.destination.entities.TripOrder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepository extends JpaRepository<TripOrder,Integer> {
}
