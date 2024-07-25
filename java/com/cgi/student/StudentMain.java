package com.cgi.student;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StudentMain {

	public static void main(String[] args) {
		SpringApplication.run(StudentMain.class, args);
		System.out.println("Server running...");
	}

}
