package com.example.EmployeeData.dto;

import com.example.EmployeeData.models.Project;
import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProjectDTO {
    private String project_name;
//    public ProjectDTO(Project project){
//        this.project_name=project.getProject_name();
//    }
}
