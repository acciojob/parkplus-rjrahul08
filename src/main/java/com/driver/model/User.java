package com.driver.model;


import org.junit.jupiter.api.Tags;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int Id;

    private String name;

    private String phoneNumber;

    private String password;

    @OneToMany(mappedBy = "user",cascade = CascadeType.ALL)
    List<Reservation> reservationList = new ArrayList<>();

}
