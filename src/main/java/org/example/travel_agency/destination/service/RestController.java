package org.example.travel_agency.destination.service;

import org.example.travel_agency.destination.entities.Trip;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


@org.springframework.web.bind.annotation.RestController

public class RestController {

    ShowTrips showTrips;

    public RestController() {
        System.out.println("MyController skonstruowany");
    }

    @GetMapping("/trips")
    public List<Trip> showAll(){
        return showTrips.showAllTrips();
    }







   ////////////////
//    @GetMapping("/ok/**")
//    public String ok() {
//        return "redirect:/api/cars";
//    }
//
//    @GetMapping("/ok/{bookId:\\d+}")
//    public Long ok(@PathVariable(name = "bookId") Long id) {
//        return id*2;
//    }
//
//    @GetMapping("/ok/{bookId:[a-z]+}")
//    public String ok2(@PathVariable String bookId) {
//        return bookId + bookId;
//    }
//
//    @PostMapping(consumes = "application/json")
//    public String post(@RequestBody Book book) {
//        return "Hello " + book.getName();
//    }
//
//    @PostMapping//(consumes = "text/plain")
//    public String post(@RequestBody String book) {
//        return "Hello " + book;
//    }

}
