package org.example.travel_agency.destination.service;

import org.example.travel_agency.destination.entities.Country;
import org.example.travel_agency.destination.entities.Trip;
import org.example.travel_agency.destination.entities.TripOrder;
import org.example.travel_agency.destination.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrdersService {

   final private OrderRepository orderRepository;

    @Autowired
    public OrdersService(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }
//    private Order order;
//    private Trip trip;
//@Autowired
//    public OrdersService(OrderRepository orderRepository, Order order, Trip trip) {
//        this.orderRepository = orderRepository;
//        this.order = order;
//        this.trip = trip;
//    }

    public List<TripOrder> showAllOrders() {
        return orderRepository.findAll();
    }


/*   public List<Country> findTripInCountry(Integer id_Trip, String country_name){
        return orderRepository.findOne(id_Trip)
                .getCountry}*/



    public boolean addOrder(TripOrder tripOrder) {
        orderRepository.save(tripOrder);
        return true;
    }
//
//    public Double calculateTotalPrice(Trip trip){
//        return order.getAdultsNumber()*trip.getPrice()+order.getChildrenNumber()*0.7*trip.getPrice()+order.getBabiesNumber()*.3*trip.getPrice();
//    }


}
