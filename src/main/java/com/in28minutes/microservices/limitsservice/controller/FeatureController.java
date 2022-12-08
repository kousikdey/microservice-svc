package com.in28minutes.microservices.limitsservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.in28minutes.microservices.limitsservice.bean.Limits;
import com.in28minutes.microservices.limitsservice.configuration.Configuration;

@RestController
public class FeatureController {

	@Autowired
	private Configuration configuration;

	@GetMapping("/feature")
	public Limits feature() {
		//comment add
		int k = 6;
		int t =7;
		System.out.println("Hiii");
		for(int i=0; i<11; i++) {
			System.out.println(i);
		}
		return new Limits(configuration.getMinimum(), 
				configuration.getMaximum());
//		return new Limits(1,1000);
	}
	
	
	public Limits feature2() {
		System.out.println("Hiii2");
		return new Limits(configuration.getMinimum(), 
				configuration.getMaximum());
//		return new Limits(1,1000);
	}
	
	public Limits feature4() {
		System.out.println("Hiii4");
		return new Limits(configuration.getMinimum(), 
				configuration.getMaximum());
//		return new Limits(1,1000);
	}
	
	
	public Limits feature3() {
		System.out.println("Hiii3");
		return new Limits(configuration.getMinimum(), 
				configuration.getMaximum());
//		return new Limits(1,1000);
	}
	
	public Limits featureAA() {
		System.out.println("Hiii3");
		return new Limits(configuration.getMinimum(), 
				configuration.getMaximum());
//		return new Limits(1,1000);
	}
	
	public Limits featureBB() {
		System.out.println("Hiii3");
		return new Limits(configuration.getMinimum(), 
				configuration.getMaximum());
//		return new Limits(1,1000);
	}
}
