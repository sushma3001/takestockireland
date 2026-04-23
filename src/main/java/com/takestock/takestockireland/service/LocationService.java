package com.takestock.takestockireland.service;

import com.takestock.takestockireland.dto.LocationDTO;
import com.takestock.takestockireland.entity.Location;
import com.takestock.takestockireland.repository.LocationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service // Spring manages this as a Service bean
public class LocationService {

    @Autowired   // Spring auto-injects the repository
    private LocationRepository locationRepository;


    //Get all locations - returns list of DTO's
    public List<LocationDTO> getAllLocations(){
        return locationRepository.findAll()
                .stream()
                .map(this::convertToDTO)
                .collect(Collectors.toList());

    }

    //Get one location by ID
    public LocationDTO getLocationById(Integer id){
        Location location = locationRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Location not found"));
        return convertToDTO(location);
    }

    // CREATE new location
    public LocationDTO createLocation(Location location) {
        Location saved = locationRepository.save(location);  // INSERT into DB
        return convertToDTO(saved);
    }

    // Helper method: Entity → DTO conversion
    private LocationDTO convertToDTO(Location location) {
        LocationDTO dto = new LocationDTO();
        dto.setLocationId(location.getLocationId());
        dto.setCity(location.getCity());
        dto.setCountry(location.getCountry());
        return dto;
    }

}
