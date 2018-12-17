package com.grassmayr.test_spring;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.sql.SQLOutput;

@SpringBootApplication
public class TestSpringApplication implements CommandLineRunner {


	public static void main(String[] args) {
		SpringApplication.run(TestSpringApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("Hello nutte");
	}
}

