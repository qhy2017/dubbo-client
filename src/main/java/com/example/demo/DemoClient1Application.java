package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.demo.service.IUserService;

@Controller
@ImportResource("classpath:appcontext-*.xml")
@SpringBootApplication
public class DemoClient1Application {
	@Autowired
	IUserService userService;

	@ResponseBody
	@RequestMapping("/getUserName")
	public String getUserName() {
		return userService.getUserName();
	}

	public static void main(String[] args) {
		SpringApplication.run(DemoClient1Application.class, args);
	}
}
