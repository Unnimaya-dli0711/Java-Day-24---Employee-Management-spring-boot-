package com.example.EmployeeData.repository;

import com.example.EmployeeData.models.Department;
import com.example.EmployeeData.models.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentRepository  extends JpaRepository<Department,Long> {
}
