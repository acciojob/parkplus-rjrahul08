package com.driver.model;

import net.minidev.json.annotate.JsonIgnore;

import javax.persistence.*;

@Entity
public class Reservation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int Id;

    private int numberOfHours;


    @OneToOne(mappedBy = "reservation",cascade = CascadeType.ALL)
    Payment payment;

    @ManyToOne
    @JoinColumn
    @JsonIgnore
    Spot spot;

    @ManyToOne
    @JoinColumn
    @JsonIgnore
    User user;

    public Reservation() {
    }

    public Reservation(int id, int numberOfHours, Payment payment, Spot spot, User user) {
        Id = id;
        this.numberOfHours = numberOfHours;
        this.payment = payment;
        this.spot = spot;
        this.user = user;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public int getNumberOfHours() {
        return numberOfHours;
    }

    public void setNumberOfHours(int numberOfHours) {
        this.numberOfHours = numberOfHours;
    }

    public Payment getPayment() {
        return payment;
    }

    public void setPayment(Payment payment) {
        this.payment = payment;
    }

    public Spot getSpot() {
        return spot;
    }

    public void setSpot(Spot spot) {
        this.spot = spot;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
