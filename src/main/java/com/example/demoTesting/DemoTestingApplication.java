package com.example.demoTesting;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoTestingApplication {

	@Autowired
	ServicioDeCalculadora servicioDeCalculadora;

	public static void main(String[] args) {
		SpringApplication.run(DemoTestingApplication.class, args);
	}

}
