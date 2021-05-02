package com.example.demo.employee;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.util.List;

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
