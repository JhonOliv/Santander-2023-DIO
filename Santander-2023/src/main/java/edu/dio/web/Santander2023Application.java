package edu.dio.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"edu.dio.web.service", "edu.dio.web.controller"})

public class Santander2023Application {

	public static void main(String[] args) {
		SpringApplication.run(Santander2023Application.class, args);
	}

}
