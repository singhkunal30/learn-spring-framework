package com.spring.learnspringframework2.game;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class GameRunner {
	
	GamingConsole game;
	
	public GameRunner(@Qualifier("SuperContraQualifier") GamingConsole game) {
		this.game=game;
	}
	
	public void run() {
		System.out.println(game +" is Running");
		game.up();
		game.down();
		game.left();
		game.right();
	}

}
