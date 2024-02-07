package com.spring.learnspringframework.examples.a6;

import java.util.Arrays;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.learnspringframework.game.GameRunner;

public class XmlConfigurationContextLauncherApplication {
		
	public static void main(String[] args) {
		try(var context = new ClassPathXmlApplicationContext("ContextConfiguration.xml")){			
			Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
			System.out.println(context.getBean("name"));
			System.out.println(context.getBean("age"));
			context.getBean(GameRunner.class).run();
		}
	}
}
