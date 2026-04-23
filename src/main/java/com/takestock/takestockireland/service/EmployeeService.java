package com.takestock.takestockireland.service;

import com.takestock.takestockireland.dto.EmployeeDTO;
import com.takestock.takestockireland.entity.Employee;
import com.takestock.takestockireland.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    // Get all users as DTOs
public List<EmployeeDTO> getAllEmployees(){
    return  employeeRepository.findAll()
            .stream()
            .map(this::convertToDTO)
            .collect(Collectors.toList());
}


    // Get one user by ID as DTO
public EmployeeDTO getEmployeeById(Integer id){
    Employee employee = employeeRepository.findById(id)
            .orElseThrow(() -> new RuntimeException("Employee not found"));
    return  convertToDTO(employee);
}

public EmployeeDTO createEmployee(Employee employee){
    Employee saved = employeeRepository.save(employee);
    return convertToDTO(saved);
}



public EmployeeDTO updateEmployee(Integer id,Employee updatedEmployee){
    //Step 1: find existing employee in DB
    Employee existing = employeeRepository.findById(id)
            .orElseThrow(() -> new RuntimeException("Employee not found with id: " + id));

    //step 2: update only the fields allowed
    existing.setName(updatedEmployee.getName());
    existing.setInitials(updatedEmployee.getInitials());
    existing.setMobile(updatedEmployee.getMobile());
    existing.setRole(updatedEmployee.getRole());
    existing.setLocation(updatedEmployee.getLocation());


    //Step 3: save the update employee back to DB
    Employee saved = employeeRepository.save(existing);

    //Step 4: convert to DTO return
    return convertToDTO(saved);

}

    public String deleteEmployee(Integer id){
        //Step 1: check employee exist or not
        Employee existing = employeeRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Employee not found with id: " + id));

        //Step 2: delete the employee
        employeeRepository.delete(existing);

        // Step 3: Return success message
        return "Employee deleted successfully with id: " + id;
    }

    // ⭐ HELPER METHOD — Convert Entity to DTO (FLAT structure!)
    private EmployeeDTO convertToDTO( Employee employee) {
        EmployeeDTO dto = new EmployeeDTO();
        dto.setEmployeeId(employee.getEmployeeId());

        // Getter chain - flatten User relationship
        if (employee.getUser() != null) {
            dto.setUsername(employee.getUser().getUsername());
        }

        dto.setName(employee.getName());
        dto.setInitials(employee.getInitials());
        dto.setMobile(employee.getMobile());

        // Getter chain - flatten Location relationship
        if (employee.getLocation() != null) {
            dto.setCity(employee.getLocation().getCity());
        }

        dto.setRole(employee.getRole());
        dto.setDateOfJoining(employee.getDateOfJoining());

        return dto;
    }

}
