package com.takestock.takestockireland.controller;

import com.takestock.takestockireland.dto.EmployeeDTO;
import com.takestock.takestockireland.entity.Employee;
import com.takestock.takestockireland.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/employees")
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;

    // GET http://localhost:8080/api/employees
    @GetMapping
    public List<EmployeeDTO> getAllEmployee() {
        return employeeService.getAllEmployees();

    }

    //Get : https://localhost:8080/api/employees/1
    @GetMapping("/{id}")
    public EmployeeDTO getEmployeeId(@PathVariable Integer id) {
        return employeeService.getEmployeeById(id);
    }

    // POST http://localhost:8080/api/employees (with JSON body)
    @PostMapping
    public EmployeeDTO createEmployee(@RequestBody Employee employee) {
        return employeeService.createEmployee(employee);
    }


    // PUT http://localhost:8080/api/employees/{id}

    @PutMapping("/{id}")
    public EmployeeDTO updateEmployee(
            @PathVariable Integer id,
            @RequestBody Employee updatedEmployee) {
        return employeeService.updateEmployee(id, updatedEmployee);
    }
// Delete http://localhost:8080/api/employees/{id}
    @DeleteMapping("/{id}")
    public String deleteEmployee(@PathVariable Integer id) {
        return employeeService.deleteEmployee(id);


    }


}
