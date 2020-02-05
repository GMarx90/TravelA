package org.example.travel_agency.destination.entities;

import lombok.NoArgsConstructor;
import org.apache.catalina.User;

import javax.persistence.*;
import java.util.Date;


    @Entity
    @NoArgsConstructor
    public class Orders {

        @Id
        @GeneratedValue
        private int id_Order;
        /*  HolidayDuration holiday jeszcze mozna dodac do konstruktora tylko jak to potem podpiac*/

        @OneToOne
        @JoinColumn
        private Trip trip;

       // private User user;


        }


