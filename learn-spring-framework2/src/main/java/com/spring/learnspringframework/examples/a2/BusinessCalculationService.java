package com.spring.learnspringframework.examples.a2;

import java.util.Arrays;

import org.springframework.stereotype.Component;

@Component
public class BusinessCalculationService {
	
	DataService dataService;
	
	public BusinessCalculationService(DataService dataService) {
		super();
		this.dataService = dataService;
	}
	
	public int findMax() {
		return Arrays.stream(dataService.retrieveData()).max().orElse(0);
	}
	

}
