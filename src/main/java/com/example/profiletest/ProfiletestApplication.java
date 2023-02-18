package com.example.profiletest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class ProfiletestApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProfiletestApplication.class, args);
	}

	@GetMapping("/")
	public String string(@Value("${greeting.message}") String message) {
		return message;
	}

}
