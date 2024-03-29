package com.devsuperior.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.password.PasswordEncoder;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner {

	@Autowired
	private PasswordEncoder passwordEncoder;

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		// Only for testing purpose
		String rawPassword = "123456";
		String encodedPassword = passwordEncoder.encode(rawPassword);
		boolean result = passwordEncoder.matches(rawPassword, encodedPassword);

		System.out.println("\"" + rawPassword + "\" is equal to \"" + encodedPassword + "\"? " + result);
	}
}
