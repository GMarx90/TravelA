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
public class TripOrder {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_Order;
    private int adultsNumber;
    private int childrenNumber;
    private int babiesNumber;

    @OneToOne
    @JoinColumn(name = "TripFk")
    private Trip trip;
    @OneToOne
    @JoinColumn(name = "AppUserFk")
    private AppUser appUser;

//        public Double calculateTotalPrice(Trip trip){
//            return this.getAdultsNumber()*trip.getPrice()+this.getChildrenNumber()*0.7*trip.getPrice()+this.getBabiesNumber()*.3*trip.getPrice();
//        }


}


