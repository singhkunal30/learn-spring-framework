package com.spring.learnspringframework.helloworld;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

record Person(String name, int age, Address ad) {};

record Address(String fistLine, String city) {};

@Configuration
public class HelloWorldConfigurationClass {
	
	@Bean(name = "customName")
	public String name() {
		return "Ranga";
	}
	
	@Bean
	public int age() {
		return 20;
	}
	
	@Bean
	public Person person() {
		var person = new Person("Kunal", 23, new Address("Sector 23", "GGN"));
		return person;
	}
	
	@Bean
	public Person person2() {
		var person = new Person(name(), age(), address1());
		return person;
	}
	
	@Bean
	public Person person3(String name, int age,	@Qualifier("address2Qualifier") Address address) {
		var person = new Person(name, age, address);
		return person;
	}
	
	@Bean
	@Primary
	public Address address1() {
		return new Address("Sector 23 Rd", "Gurgaon");
	}
	
	@Bean
	@Qualifier("address2Qualifier")
	public Address address2() {
		return new Address("Sector 21", "Gurgaon");
	}
}
