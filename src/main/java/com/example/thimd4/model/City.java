package com.example.thimd4.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class City {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;
    private long acreage;
    private long population;
    private long gdp;
    private String description;

    @ManyToOne
    private Country country;




}
