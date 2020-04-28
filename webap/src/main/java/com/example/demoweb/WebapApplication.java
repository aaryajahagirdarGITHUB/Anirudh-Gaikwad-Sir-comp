package com.example.demoweb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class WebapApplication {

	public static void main(String[] args) {
		SpringApplication.run(WebapApplication.class, args);
		System.out.print("hello Spring Boot");
	}

}
