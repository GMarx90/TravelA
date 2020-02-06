package org.example.travel_agency.destination.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Controller;

import javax.persistence.*;
import java.util.Date;

@Getter
@Setter
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Controller
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_Order;
    private int adultsNumber;
    private int childrenNumber;
    private int babiesNumber;

    @OneToOne
    @JoinColumn
    private Trip trip;
    @OneToOne
    @JoinColumn
    private User user;

//        public Double calculateTotalPrice(Trip trip){
//            return this.getAdultsNumber()*trip.getPrice()+this.getChildrenNumber()*0.7*trip.getPrice()+this.getBabiesNumber()*.3*trip.getPrice();
//        }


}


