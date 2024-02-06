package com.spring.learnspringframework.examples.a2;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class ExerciseApplication {
		
	
	public static void main(String[] args) {
		try(var context = new AnnotationConfigApplicationContext(ExerciseApplication.class)){			
			System.out.println(context.getBean(BusinessCalculationService.class).findMax());
		}
	}
}
