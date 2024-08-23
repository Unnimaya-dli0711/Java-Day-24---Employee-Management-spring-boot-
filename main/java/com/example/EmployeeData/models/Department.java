package com.example.EmployeeData.models;

import com.example.EmployeeData.dto.DepartmentDTO;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="department_tb")
public class Department {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long department_id;

    @Column(name="department_name")
    String department_name;

    @OneToMany(mappedBy = "department")
    private List<Employee> employees;

//    public Department(DepartmentDTO departmentDTO){
//        this.department_name=departmentDTO.getDepartment_name();
//    }
}
