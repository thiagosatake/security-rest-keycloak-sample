package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

import arqref.one.web.ArqRefOneWebConfiguration;

@Import(ArqRefOneWebConfiguration.class)
@SpringBootApplication
public class SecurityRestKeycloakSampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(SecurityRestKeycloakSampleApplication.class, args);
	}

}
