package com.abhi.firstSpring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FirstSpringApplication {

	public static void main(String[] args) {

		System.out.println("I am starting now");
		SpringApplication.run(FirstSpringApplication.class, args);
	}

}
