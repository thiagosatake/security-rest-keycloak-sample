package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import arqref.one.web.EnableArqRefOneWebSecurity;

@EnableArqRefOneWebSecurity
@SpringBootApplication
public class SecurityRestKeycloakSampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(SecurityRestKeycloakSampleApplication.class, args);
	}

}
