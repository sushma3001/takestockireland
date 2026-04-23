package com.takestock.takestockireland.repository;

import com.takestock.takestockireland.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository  // Marks this as a database-access bean for Spring
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
// JpaRepository<Employee, Integer> means:
    //   - Employee = the entity this repo handles
    //   - Integer  = the type of employeeId (primary key)

    // Spring AUTO-GENERATES these methods for FREE:
    //   findAll()         → SELECT * FROM employee
    //   findById(id)      → SELECT * FROM employee WHERE employee_id=?
    //   save(employee)    → INSERT or UPDATE
    //   delete(employee)  → DELETE FROM employee WHERE employee_id=?
    //   count()           → SELECT COUNT(*) FROM employee
    //   existsById(id)    → Check if employee exists
    //   + 15 more methods
}
