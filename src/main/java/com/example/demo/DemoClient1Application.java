package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.qhy.demo,com.example.demo"})
public class DemoClient1Application {

	public static void main(String[] args) {
		SpringApplication.run(DemoClient1Application.class, args);
	}
}
