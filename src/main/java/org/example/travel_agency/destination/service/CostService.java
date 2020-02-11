package org.example.travel_agency.destination.service;


import org.example.travel_agency.destination.entities.TripOrder;

public class CostService {

public double calculateCost (TripOrder tripOrder){
    return (tripOrder.getAdultsNumber()+tripOrder.getChildrenNumber()*0.7+tripOrder.getBabiesNumber()*0.3)*tripOrder.getTrip().getPrice();
}
    }

