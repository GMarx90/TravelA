package org.example.travel_agency.destination.service;

import org.example.travel_agency.destination.entities.Order;
import org.example.travel_agency.destination.entities.Trip;
import org.example.travel_agency.destination.repository.OrderRepository;
import org.example.travel_agency.destination.repository.TripRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrdersService {

    private OrderRepository orderRepository;

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

    public List<Order> showAllOrders() {
        return orderRepository.findAll();
    }

    public boolean addOrder(Order order) {
        orderRepository.save(order);
        return true;
    }
//
//    public Double calculateTotalPrice(Trip trip){
//        return order.getAdultsNumber()*trip.getPrice()+order.getChildrenNumber()*0.7*trip.getPrice()+order.getBabiesNumber()*.3*trip.getPrice();
//    }


}
