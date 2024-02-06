package com.spring.learnspringframework.helloworld;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App02HelloWorldSpring {

	public static void main(String[] args) {
		//1.Launch a Spring Context
		
		//try with resources
		try(var context = new AnnotationConfigApplicationContext(HelloWorldConfigurationClass.class)){
			//2.Configure the things that we want Spring to manage - @Configuration
			
			//3. Retrieving Beans managed by Spring
			System.out.println(context.getBean("customName"));
			
			System.out.println(context.getBean("age"));
			
			System.out.println(context.getBean("person"));
			
			System.out.println(context.getBean("person2"));
			
			System.out.println(context.getBean("person3"));
			
			System.out.println(context.getBean(Address.class));
		}		
	}

}
