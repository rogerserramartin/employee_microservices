package com.example.demo;

import com.example.demo.employee.Employee;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.util.List;

@SpringBootApplication
@RestController //annotation that simplifies the creation of RESTful web services.
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@GetMapping //to be used as a RESTful endpoint, we need this annotation
	public List<Employee> helloWorld() {
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
