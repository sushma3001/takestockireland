package com.takestock.takestockireland.service;

import com.takestock.takestockireland.dto.UserDTO;
import com.takestock.takestockireland.entity.User;
import com.takestock.takestockireland.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    // Get all users as DTOs (no passwords!)

    public List<UserDTO> getAllUsers() {
        return userRepository.findAll()
                .stream()
                .map(this::convertToDTO)
                .collect(Collectors.toList());
    }
    // Get one user by ID as DTO

    public UserDTO getUserById(Integer id) {
        User user = userRepository.findById(id)

                .orElseThrow(() -> new RuntimeException("User not found"));
        return convertToDTO(user);
    }

    // Create user (returns DTO too)
    public UserDTO createUser(User user) {
        User saved = userRepository.save(user);
        return convertToDTO(saved);
    }

    //Helper: Convert Entity -> DTO
    private UserDTO convertToDTO(User user){
        UserDTO dto = new UserDTO();
        dto.setUserId(user.getUserId());
        dto.setUsername(user.getUsername());
        dto.setRole(user.getRole());
        dto.setIsActive(user.getIsActive());
        dto.setCreatedAt(user.getCreatedAt());
        return dto;
    }
}
