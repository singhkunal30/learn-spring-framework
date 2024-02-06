package com.spring.learnspringframework.game;

public class GameRunner {
	
	GamingConsole game;
	
	public GameRunner(GamingConsole game) {
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
