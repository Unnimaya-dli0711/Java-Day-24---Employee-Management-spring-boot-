package com.example.EmployeeData.repository;

import com.example.EmployeeData.models.Employee;
import com.example.EmployeeData.models.Project;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProjectRepository  extends JpaRepository<Project,Long> {
}
