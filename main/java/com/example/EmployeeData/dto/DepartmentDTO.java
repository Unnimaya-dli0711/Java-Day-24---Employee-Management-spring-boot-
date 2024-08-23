package com.example.EmployeeData.dto;

import com.example.EmployeeData.models.Department;
import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@Data
@NoArgsConstructor
@AllArgsConstructor
public class DepartmentDTO {
    private String department_name;
   // public DepartmentDTO(Department department){
//        this.department_name=department.getDepartment_name();
//    }
}
