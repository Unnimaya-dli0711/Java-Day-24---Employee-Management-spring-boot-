package com.example.EmployeeData.dto;

import com.example.EmployeeData.models.Department;
import com.example.EmployeeData.models.Employee;
import com.example.EmployeeData.models.Role;
import jakarta.persistence.Entity;
import lombok.*;

import java.util.List;
@Getter
@Data
@NoArgsConstructor
@AllArgsConstructor
public class EmployeeDTO {
    private String emp_name;
    private Department emp_department;
    private List<ProjectDTO> emp_projects;
    private List<AddressDTO> emp_addresses;
    private Role role;

//    public EmployeeDTO(Employee employee){
//        this.emp_name=employee.getEmp_name();
//        this.emp_department=employee.getDepartment();
//        this.role=employee.getRole();
//        this.emp_addresses=employee.getAddresses();
//        this.emp_projects=employee.getProjects();
//    }
}
