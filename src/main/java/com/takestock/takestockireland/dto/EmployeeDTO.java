package com.takestock.takestockireland.dto;

import com.takestock.takestockireland.entity.EmployeeRole;
import lombok.Data;
import java.time.LocalDate;

@Data
public class EmployeeDTO {
    private Integer employeeId;       // camelCase
    private String username;          // flat - from user.getUsername()
    private String name;
    private String initials;
    private String mobile;
    private String city;              // flat - from location.getCity()
    private EmployeeRole role;        // enum
    private LocalDate dateOfJoining;  // modern LocalDate
}