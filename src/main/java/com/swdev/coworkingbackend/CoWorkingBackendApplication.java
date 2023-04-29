package com.swdev.coworkingbackend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@ComponentScan("com.swdev.coworkingbackend.controller")
public class CoWorkingBackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(CoWorkingBackendApplication.class, args);

	}
}
