package com.example.EmployeeData.models;

import com.example.EmployeeData.dto.AddressDTO;
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
@Table(name = "address_table")
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long address_id;
    private String address_type; // e.g., home, work
    private String address;

    @ManyToOne
    @JoinColumn(name = "emp_id")
    private Employee employee;

//    public Address(AddressDTO addressDTO){
//        this.address_type=addressDTO.getAddress_type();
//        this.address=addressDTO.getAddress();
//    }
}
