package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController //annotation that simplifies the creation of RESTful web services.
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@GetMapping //to be used as a RESTful endpoint, we need this annotation
	public String helloWorld() {
		return "Hello World! This is a Springboot App!";
	}

}
