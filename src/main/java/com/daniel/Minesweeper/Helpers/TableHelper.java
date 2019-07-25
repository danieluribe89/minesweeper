package com.daniel.Minesweeper.Helpers;

import org.springframework.stereotype.Component;

@Component
public interface TableHelper{

	// Returns a random number between two numbers
	public static int randomNumber(int min, int max) {
		int random = (int) Math.floor(Math.random()*max+1);
		return random > min ? random : min;
	}

}
