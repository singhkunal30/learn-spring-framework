package com.spring.learnspringframework2.game;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class MarioGame implements GamingConsole {
	
	public void up() {
		System.out.println("Jump");
	}
	
	public void down() {
		System.out.println("Down");
	}
	
	public void left() {
		System.out.println("Left");
	}
	
	public void right() {
		System.out.println("right");
	}
}
