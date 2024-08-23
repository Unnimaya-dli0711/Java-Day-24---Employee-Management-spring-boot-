package com.example.EmployeeData.dto;

import com.example.EmployeeData.models.Role;
import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@Data
@NoArgsConstructor
@AllArgsConstructor
public class RoleDTO {
    private String role_name;
//    public RoleDTO(Role role){
//        this.role_name=role.getRole_name();
//    }
}
