package com.spring.learnspringframework.examples.a4;

import java.util.Arrays;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

@Component
class SomeClass{
	public SomeDependency someDependency;
	
	public SomeClass(SomeDependency someDependency) {
		super();
		this.someDependency = someDependency;
		System.out.println("All dependencies are ready");
	}
	
	@PostConstruct
	public void initialize() {
		someDependency.getReady();
	}
	
	@PreDestroy
	public void cleanup() {
		System.out.println("cleanup");
	}
}

@Component
class SomeDependency{
	
	public void getReady() {
		System.out.println("Some logic using some dependency");
	}
	
}

@Configuration
@ComponentScan
public class PrePostContextLauncherApplication {
		
	public static void main(String[] args) {
		try(var context = new AnnotationConfigApplicationContext(PrePostContextLauncherApplication.class)){			
//			Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
		}
	}
}
