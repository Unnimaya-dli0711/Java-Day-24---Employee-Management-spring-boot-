package com.example.EmployeeData.dto;

import com.example.EmployeeData.models.Address;
import jakarta.persistence.Entity;
import lombok.*;

import java.util.List;

@Getter
@Data
@NoArgsConstructor
@AllArgsConstructor
public class AddressDTO {
    private String address_type;
    private String address;
//    public AddressDTO(Address address){
//        this.address_type=address.getAddress_type();
//        this.address=address.getAddress();
//    }
}
