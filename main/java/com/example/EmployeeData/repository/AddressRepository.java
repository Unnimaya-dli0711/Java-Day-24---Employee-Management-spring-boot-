package com.example.EmployeeData.repository;

import com.example.EmployeeData.models.Address;
import com.example.EmployeeData.models.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRepository  extends JpaRepository<Address,Long> {
}

