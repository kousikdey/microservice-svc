package com.in28minutes.microservices.limitsservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HellowController {


	@GetMapping("/hello")
	public void addds() {
		System.out.println("Hello");
	}
	
	
}
