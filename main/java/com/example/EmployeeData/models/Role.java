package com.example.EmployeeData.models;

import com.example.EmployeeData.dto.RoleDTO;
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
@Table(name = "role_table")
public class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long role_id;
    private String role_name;

    @OneToMany(mappedBy = "role")
    private List<Employee> employees;

//    public Role(RoleDTO roleDTO){
//        this.role_name=roleDTO.getRole_name();
//    }
}
