package com.example.LoginRegisterAPI;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(exclude = SecurityAutoConfiguration.class)
public class LoginRegisterApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(LoginRegisterApiApplication.class, args);
	}

}
