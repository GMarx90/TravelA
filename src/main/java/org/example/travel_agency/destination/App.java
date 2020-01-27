package org.example.travel_agency.destination;

import java.time.LocalDate;
import java.time.Period;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Country Hiszpania = new Country("Hiszpania");
        City Barcelona =new City ("Barcelona",Hiszpania);
        Hotel Stark = new Hotel(3.5,"B&b","Near to beach",Barcelona);
        DepartCity Katowice =new DepartCity("Katowice");
        Departure KTW =new Departure(Katowice, "Pyrzowice");
        LocalDate dateOfDeparture = LocalDate.parse("2020-07-11");
        LocalDate dateOfReturn = LocalDate.parse("2020-07-25");
        Trip trip1=new Trip(Stark,dateOfDeparture,dateOfReturn, KTW, 1890);
        System.out.println(trip1.hotel);
    }
}
