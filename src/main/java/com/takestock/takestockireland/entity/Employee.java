package com.takestock.takestockireland.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;

@Entity
@Table(name = "employee")
@Data
public class Employee {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "employee_id")
    private Integer employeeId;

    // 1:1 with User (user_id column is FK + UNIQUE)
    @OneToOne
    @JoinColumn(name = "user_id", unique = true)
    private User user;

    @Column(name = "name", length = 100, nullable = false)
    private String name;

    @Column(name = "initials", length = 5, unique = true)
    private String initials;

    @Column(name = "mobile", length = 15, unique = true)
    private String mobile;

    // M:1 with Location (many employees share one location)
    @ManyToOne
    @JoinColumn(name = "location_id")
    private Location location;




    // Enum: SUPERVISOR, CREW
    @Enumerated(EnumType.STRING)
    @Column(name = "role", nullable = false)
    private EmployeeRole role;

    @Column(name = "date_of_joining")
    private LocalDate dateOfJoining;


}
