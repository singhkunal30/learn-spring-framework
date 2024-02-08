package com.spring.learnspringboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CurrencyConfigurationController {
	
	@Autowired
	public CurrencyServiceConfiguration configuration;
	
	@RequestMapping("/configuration")
	public CurrencyServiceConfiguration getConfig() {
		return configuration;
	}

}
