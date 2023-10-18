package com.example.LoginRegisterAPI.Service.impl;

import com.example.LoginRegisterAPI.Dto.EmployeeDTO;
import com.example.LoginRegisterAPI.Entity.Employee;
import com.example.LoginRegisterAPI.Repo.EmployeeRepo;
import com.example.LoginRegisterAPI.Service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;

public class EmployeeIMPL implements EmployeeService {

//    @Autowired
    private EmployeeRepo employeeRepo;
//    @Autowired
    private PasswordEncoder passwordEncoder;
    @Override
    public String addEmployee(EmployeeDTO employeeDTO) {
        Employee employee = new Employee(
                employeeDTO.getEmployeeid(),
                employeeDTO.getEmployeename(),
                employeeDTO.getEmail(),
                this.passwordEncoder.encode(employeeDTO.getPassword())
        );
        employeeRepo.save(employee);
        return employee.getEmployeename();
    }

}
