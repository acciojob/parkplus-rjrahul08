package com.driver.model;

import javax.persistence.*;

@Entity
@Table(name = "spot")
public class Reservation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int Id;

    private int numberOfHours;


    @OneToOne(mappedBy = "reservation",cascade = CascadeType.ALL)
    Payment payment;

    @ManyToOne
    @JoinColumn
    Spot spot;

    @ManyToOne
    @JoinColumn
    User user;
}
