package com.example.demo.employee;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.util.List;

import static java.time.Month.*;

@Configuration
public class EmployeeConfig {

    @Bean
    CommandLineRunner commandLineRunner(EmployeeRepository employeeRepository) {
        return args -> {
            Employee vincent = new Employee(
                    "Vincent",
                    "vincent@lambda.com",
                    LocalDate.of(1980, JULY, 20)
            );

            Employee james = new Employee(
                    "James",
                    "james@lambda.com",
                    LocalDate.of(1970, AUGUST, 17)
            );

            Employee gloria = new Employee(
                    "Gloria",
                    "Gloria@lambda.com",
                    LocalDate.of(2000, MARCH, 11)
            );

            Employee hannah = new Employee(
                    "Hannah",
                    "hannah@lambda.com",
                    LocalDate.of(1996, JULY, 28)
            );

            employeeRepository.saveAll(
                    List.of(vincent, james, gloria, hannah)
            );
        };
    }
}
