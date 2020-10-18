package com.example.liquibase.domain;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import lombok.Data;


@Entity
@Data
public class Tire {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String model;
    private Integer price;

    @ManyToOne(cascade=CascadeType.ALL)
    @JoinColumn(name="car_id", nullable = false)
    private Car car;

}
