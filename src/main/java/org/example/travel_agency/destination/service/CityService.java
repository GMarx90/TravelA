package org.example.travel_agency.destination.service;

import org.example.travel_agency.destination.entities.Country;
import org.example.travel_agency.destination.entities.City;
import org.example.travel_agency.destination.entities.Hotel;
import org.example.travel_agency.destination.entities.Trip;
import org.example.travel_agency.destination.repository.CityRepository;
import org.example.travel_agency.destination.repository.TripRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HotelService {

    private HotelRepository hotelRepository;

    @Autowired
    public HotelService(HotelRepository hotelRepository) {
        this.hotelRepository = hotelRepository;
    }

    public List<City> showAllHotels() {
        return hotelRepository.findAll();
    }

    public boolean addHotel(Hotel hotel) {
        hotelRepository.save(hotel);
        return true;
    }

}