package com.takestock.takestockireland.dto;

import com.takestock.takestockireland.entity.Role;
import lombok.Data;

import java.time.LocalDateTime;

@Data // Lombok auto getters and setters
public class UserDTO {
private  Integer userId;
private  String username;
private Role role;
private  Boolean isActive;
private LocalDateTime createdAt;


}
