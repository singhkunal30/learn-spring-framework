package com.spring.learnspringframework;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.spring.learnspringframework.game.GameRunner;

public class App03GamingSpringBeans {

	public static void main(String[] args) {
		try(var context = new AnnotationConfigApplicationContext(GamingConfiguration.class)){
			context.getBean(GameRunner.class).run();;
			
		}
	}
}
