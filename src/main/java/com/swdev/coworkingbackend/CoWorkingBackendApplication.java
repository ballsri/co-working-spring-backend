package com.swdev.coworkingbackend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class CoWorkingBackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(CoWorkingBackendApplication.class, args);
	}

	@GetMapping("/ping")
	public String ping(){
		return String.format("the server is up and responding to ping");
	}
}
