package com.takestock.takestockireland.dto;


import lombok.Data;

@Data
public class LocationDTO {
    // Same fields as Entity (no sensitive data here, so simple DTO)
    private Integer locationId;
    private String city;
    private String country;


}
