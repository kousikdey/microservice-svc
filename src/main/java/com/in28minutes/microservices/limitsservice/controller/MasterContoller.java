package com.in28minutes.microservices.limitsservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.in28minutes.microservices.limitsservice.bean.Limits;
import com.in28minutes.microservices.limitsservice.configuration.Configuration;

@RestController
public class MasterContoller {

	@Autowired
	private Configuration configuration;

	@GetMapping("/master")
	public Limits addds() {
		System.out.println("master");
		return new Limits(configuration.getMinimum(), 
				configuration.getMaximum());
	}
}
