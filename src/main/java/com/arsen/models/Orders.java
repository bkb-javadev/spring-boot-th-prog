package com.arsen.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Entity
@Table(name = "orders")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Orders {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Column(name = "name")
    private String name;
    @Column(name = "sender_city")
    private String senderCity;
    @Column(name = "senders_address")
    private String sendersAddress;
    @Column(name = "recipient_city")
    private String recipientCity;
    @Column(name = "recipient_address")
    private String recipientAddress;
    @Column(name = "cargo_weigth")
    private Integer cargoWeight;
    @Column(name = "pickup_date")
    private LocalDate pickupDate;
}
