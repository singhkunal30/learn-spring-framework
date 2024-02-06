package com.spring.learnspringframework.examples.a2;

import org.springframework.stereotype.Component;

@Component
public class MySQLDataService implements DataService{

	@Override
	public int[] retrieveData() {
		return new int [] {100,200,300,400,500};
	}
}
