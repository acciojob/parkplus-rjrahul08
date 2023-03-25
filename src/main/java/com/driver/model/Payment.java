package com.driver.model;

import com.driver.Enum.PaymentMode;

import javax.persistence.*;

@Entity
@Table(name = "payment")
public class Payment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int Id;

    private boolean paymentCompleted;

    private PaymentMode paymentMode;

    @OneToOne
    @JoinColumn
    Reservation reservation;
}
