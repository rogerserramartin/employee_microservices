package com.example.demo.employee;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.util.List;

@Service
public class EmployeeService {

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
