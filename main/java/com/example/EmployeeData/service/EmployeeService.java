package com.example.EmployeeData.service;

import com.example.EmployeeData.dto.*;
import com.example.EmployeeData.exception.EmployeeNotFoundException;
import com.example.EmployeeData.models.*;
import com.example.EmployeeData.models.Department;
import com.example.EmployeeData.repository.*;
import com.example.EmployeeData.utility.TokenUtility;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class EmployeeService {
    @Autowired
    EmployeeRepository employeeRepository;

    @Autowired
    TokenUtility tokenUtility;

    @Autowired
    AddressRepository addressRepository;

    @Autowired
    DepartmentRepository departmentRepository;

    @Autowired
    RoleRepository roleRepository;

    @Autowired
    ProjectRepository projectRepository;
//    public void createEmployee(EmployeeDTO employeeDTO){
//        List<AddressDTO> addressDTOS= employeeDTO.getEmp_addresses();
//        List<ProjectDTO> projectDTOS=employeeDTO.getEmp_projects();
//        Department departmentDTO=employeeDTO.getEmp_department();
//        Role role=employeeDTO.getRole();
//        String name=employeeDTO.getEmp_name();
//        Employee employee=new Employee(employeeDTO);
//        employeeRepository.save(employee);
//    }
    public Employee createEmployee(Employee employee){
        departmentRepository.save(employee.getDepartment());
        roleRepository.save(employee.getRole());
        projectRepository.saveAll(employee.getProjects());
        addressRepository.saveAll(employee.getAddresses());
        return  employeeRepository.save(employee);
    }

    public Employee getEmployeeById(Long id) {
        return employeeRepository.findById(id).orElseThrow(()-> new EmployeeNotFoundException("EMployee not found"));
    }
    public ResponseEntity<?> logicUser(LoginDTO loginDTO) {
        Employee employee = employeeRepository.findByName(loginDTO.getName());
        if(employee!=null && employee.getPassword().equals(loginDTO.getPassword())){
            String token = tokenUtility.createToken(employee.getEmp_id());

            Map<String, Object> response = new HashMap<>();
            response.put("message","Login Successful");
            response.put("token",token);
            return new ResponseEntity<>(response, HttpStatus.OK);
        } else {
            throw new RuntimeException("Login Failed");
        }
    }

    public Employee getByToken(String token) {
        Long id =  tokenUtility.decodeToken(token);
        return getEmployeeById(id);
    }
}
