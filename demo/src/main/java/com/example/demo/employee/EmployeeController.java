package com.example.demo.employee;

// this class will have all of the resources for our API

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1/employee")
public class EmployeeController {

    // this follows our design pattern using layers
    private final EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping //to be used as a RESTful endpoint, we need this annotation
    public List<Employee> getEmployees() {
        return employeeService.getEmployees();
    }

}
