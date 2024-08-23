package com.example.EmployeeData.controller;

import com.example.EmployeeData.dto.LoginDTO;
import com.example.EmployeeData.models.Employee;
import com.example.EmployeeData.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/login")
public class LoginController {
    @Autowired
    EmployeeService employeeService;

    @PostMapping("/")
    public ResponseEntity<?> userLogin(@RequestBody LoginDTO loginDTO){
        try{
            return ResponseEntity.ok( employeeService.logicUser(loginDTO));

        } catch (Exception exception){
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Invalid email or Password");
        }
    }

    @GetMapping
    public Employee getBytoken(@RequestHeader String token){
        return employeeService.getByToken(token);
    }
}
