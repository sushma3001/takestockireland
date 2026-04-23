package com.takestock.takestockireland.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "locations")
@Data
public class Location {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "location_id")
    private Integer locationId;

    @Column(name = "city", length = 50, unique = true, nullable = false)
    private String city;

    @Column(name = "country", length = 50)
    private String country = "Ireland";
}
