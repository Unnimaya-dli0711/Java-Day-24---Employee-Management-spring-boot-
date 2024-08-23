package com.example.EmployeeData.models;

import com.example.EmployeeData.dto.AddressDTO;
import com.example.EmployeeData.dto.EmployeeDTO;
import com.example.EmployeeData.dto.ProjectDTO;
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
@Table(name="employee_tb")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long emp_id;

    @Column(name="emp_name")
    String emp_name;

    private String password;

    @ManyToOne
    @JoinColumn(name="department_id")
    private Department department;

    @ManyToMany
    @JoinTable(
            name="employee_project",
            joinColumns  =@JoinColumn(name = "emp_id"),
            inverseJoinColumns = @JoinColumn(name = "project_id")

    )
    private List<Project> projects;

    @OneToMany(mappedBy = "employee",cascade=CascadeType.ALL)
    private List<Address>addresses;

    @ManyToOne
    @JoinColumn(name="role_id")
    private Role role;


//    public Employee(EmployeeDTO employeeDTO){
//        this.emp_name=employeeDTO.getEmp_name();
//        this.department=employeeDTO.getEmp_department();
//        this.role=employeeDTO.getRole();
//        this.addresses=employeeDTO.getEmp_addresses();
//        this.projects=employeeDTO.getEmp_projects();
//    }

}
