package com.spring.learnspringframework;

import com.spring.learnspringframework.game.GameRunner;
import com.spring.learnspringframework.game.MarioGame;
import com.spring.learnspringframework.game.SuperContraGame;

public class App01GamingBasic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		var game = new MarioGame();
		var game = new SuperContraGame();
		var gameRunner = new GameRunner(game);
		gameRunner.run();
	}

}
