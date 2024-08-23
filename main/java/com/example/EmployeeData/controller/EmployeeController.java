package com.example.EmployeeData.controller;

import com.example.EmployeeData.dto.EmployeeDTO;
import com.example.EmployeeData.models.Employee;
import com.example.EmployeeData.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
    @Autowired
    EmployeeService employeeService;

    @PostMapping("/add")
//    public void addEmployee(@RequestBody  EmployeeDTO employeeDTO){
//        employeeService.createEmployee(employeeDTO);
//    }
    public Employee addEmployee(@RequestBody Employee employee){

        employeeService.createEmployee(employee);
        return employee;
    }
}
