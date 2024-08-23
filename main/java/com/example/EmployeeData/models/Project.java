package com.example.EmployeeData.models;

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
@Table(name = "project_table")
public class Project {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long project_id;
    private String project_name;

    @ManyToMany(mappedBy = "projects")
    private List<Employee> employees;

//    public Project(ProjectDTO projectDTO){
//        this.project_name=projectDTO.getProject_name();
//    }
}
