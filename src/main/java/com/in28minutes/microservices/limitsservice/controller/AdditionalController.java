package com.in28minutes.microservices.limitsservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.in28minutes.microservices.limitsservice.bean.Limits;
import com.in28minutes.microservices.limitsservice.configuration.Configuration;

@RestController
public class AdditionalController {

	@Autowired
	private Configuration configuration;

	@GetMapping("/adds")
	public Limits addds() {
		System.out.println("Hiii");
		System.out.println("HiiiAdd");
		return new Limits(configuration.getMinimum(), 
				configuration.getMaximum());
//		return new Limits(1,1000);
	}
	
	
	public Limits addds2() {
		System.out.println("Hiii2");
		return new Limits(configuration.getMinimum(), 
				configuration.getMaximum());
//		return new Limits(1,1000);
	}
	
	public Limits addds4() {
		System.out.println("Hiii4");
		return new Limits(configuration.getMinimum(), 
				configuration.getMaximum());
//		return new Limits(1,1000);
	}
	
	public Limits addds3() {
		System.out.println("Hiii3Edit");
		return new Limits(configuration.getMinimum(), 
				configuration.getMaximum());
//		return new Limits(1,1000);
	}
	
	public Limits addds5() {
		System.out.println("Hiii5Edit");
		return new Limits(configuration.getMinimum(), 
				configuration.getMaximum());
//		return new Limits(1,1000);
	}
	
}
