package org.example.travel_agency.destination.service;

import org.example.travel_agency.destination.entities.Country;
import org.example.travel_agency.destination.entities.Trip;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
public class RController {

    private TripsService tripsService;
    private CountryService countryService;
    private CityService cityService;
    private HotelService hotelService;
    private CityAirportService cityAirportService;   
    private AirportService airportService;
    
        
        
    @Autowired
    public RController(TripsService tripsService, CountryService countryService, CityService cityService, HotelService hotelService, CityAirportService cityAirportService, AirportService airportService) {
        this.tripsService = tripsService;
        this.countryService = countryService;
        this.cityService = cityService;
        this.hotelService = hotelService;
        this.cityAirportService = cityAirportService;
        this.airportService = airportService;}
        
@GetMapping("/log")
            public void welcome(){
             sout("Welcome");
                
     @GetMapping("/countries")
    public List<Country> showAllC() {
        return countryService.showAllCountries();}
    
    @GetMapping("/cities")
     public List<City> showAllCities() {
        return tripsService.findAll();}
    
    @GetMapping("/hotels")
      public List<Hotel> showAllHotels() {
        return hotelService.findAll();}
    
    @GetMapping("/departcities")
      public List<CityAirport> showAllCityAirport() {
        return cityAirportService.findAll();}
    
    @GetMapping("/airports")
     public List<Airport> showAllAirports() {
        return airportService.findAll();}
    
    @GetMapping("/trips")
    public List<Trip> showAll() {
        return tripsService.showAllTrips();}
    
    @PostMapping("/country")
    public HttpStatus addCountry(@RequestBody Country country) {
        boolean b = countryService.addCountry(country);
        if (b) {return HttpStatus.ACCEPTED;}
        return HttpStatus.BAD_REQUEST;}
    
    @PostMapping("/city")
    public HttpStatus addCity (@RequestBody City city){
        boolean b=citySerive.addCity(city)
            if (b){return HttpStatus.ACCEPTED;}
            return HttpStatus.BAD_REQUST;}
    
    @PostMapping("/hotel")
    public HttpStatus addHotel (@RequestBody Hotel hotel){
        boolean b=hotelService.addHotel();
        if (b){return HttpStatus.ACCEPTED;}
        return HttpStatus.BAD_REQUST;}
    
    @PostMapping("/departcity")
    public HttpStatus addCityAirport(CityAirport cityAirport)
        boolean (b) =cityAirport.addCityAirport();
        if (b) {return HttpStatus.ACCEPTED;}
        return HttpStatus.BAD_REQUEST;}

    @PostMapping("/airport")
    public HttpStatus addAirport (Airport airport){
        boolean b=airportService.addAirport();
            if(b) {return HttpStatus.ACCEPTED;}
            return HttpStatus.BAD_REQUEST;}
        
    @PostMapping("/trip")
    public HttpStatus addTrip(@RequestBody Trip trip) {
        boolean b = tripsService.addTrip(trip);
        if (b) {return HttpStatus.ACCEPTED;}
        return HttpStatus.BAD_REQUEST;}


   
}
