package com.takestock.takestockireland.controller;

import com.takestock.takestockireland.dto.LocationDTO;
import com.takestock.takestockireland.entity.Location;
import com.takestock.takestockireland.service.LocationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController   // Marks as REST API - returns JSON
@RequestMapping("/api/locations")  // Base URL for all methods here
public class LocationController {
    @Autowired
    private LocationService locationService;

    // GET http://localhost:8080/api/locations
@GetMapping
    public List<LocationDTO> getAllLocations(){
    return locationService.getAllLocations();
}

    // GET http://localhost:8080/api/locations/1
    @GetMapping("/{id}")
    public LocationDTO getLocationById(@PathVariable Integer id) {
        return locationService.getLocationById(id);
    }

    // POST http://localhost:8080/api/locations (with JSON body)
    @PostMapping
    public LocationDTO createLocation(@RequestBody Location location) {
        return locationService.createLocation(location);
    }


}
