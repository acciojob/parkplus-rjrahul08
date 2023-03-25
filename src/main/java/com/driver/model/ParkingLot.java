package com.driver.model;


import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "parking_lot")
public class ParkingLot {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int Id;

    private String name;

    private String address;
     @OneToMany(mappedBy = "parkingLot",cascade = CascadeType.ALL)
    List<Spot> spotList = new ArrayList<>();
}
