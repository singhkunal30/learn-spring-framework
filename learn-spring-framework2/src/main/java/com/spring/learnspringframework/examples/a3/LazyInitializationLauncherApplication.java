package com.spring.learnspringframework.examples.a3;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
class ClassA{
	
}

@Component
@Lazy
class ClassB{
	
	public ClassA classA;
	
	public ClassB(ClassA classA) {
		System.out.println("Some initialization logic");
		this.classA = classA;
	}
	
	public void doSomething() {
		System.out.println("Did something");
	}
}

@Configuration
@ComponentScan
public class LazyInitializationLauncherApplication {
		
	public static void main(String[] args) {
		try(var context = new AnnotationConfigApplicationContext(LazyInitializationLauncherApplication.class)){			
//			Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
			System.out.println("Initialization is Completed");
			context.getBean(ClassB.class).doSomething();
		}
	}
}
