package com.example.EmployeeData.repository;

import com.example.EmployeeData.models.Employee;
import com.example.EmployeeData.models.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role,Long> {
}
