package com.example.EmployeeData.repository;

import com.example.EmployeeData.models.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface EmployeeRepository extends JpaRepository<Employee,Long> {
    @Query("SELECT e FROM Employee e WHERE e.emp_name = :empName")
    Employee findByName(@Param("empName") String empName);
}
