package com.example.demo.employee;

// this class will have all of the resources for our API

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.util.List;

@RestController
@RequestMapping(path = "api/v1/employee")
public class EmployeeController {

    @GetMapping //to be used as a RESTful endpoint, we need this annotation
    public List<Employee> getEmployees() {
        return List.of(
                new Employee(
                        1L,
                        "Vincent",
                        "vincent@lambda.com",
                        LocalDate.of(1980, Month.JULY, 20),
                        Period.between(LocalDate.of(1980, Month.JULY, 20), LocalDate.now()).getYears()

                )
        );
    }

}
