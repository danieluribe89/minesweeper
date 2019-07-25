package com.daniel.Minesweeper.Interfaces;

import org.springframework.web.bind.annotation.GetMapping;

import com.daniel.Minesweeper.DTO.Table;

public interface DeckInterface {
	
	// Returns an easy Minesweeper
	public Table returnEasyDeck();

	// Returns a middle Minesweeper
	@GetMapping("medium")
	public Table returnMediumDeck();

	// Returns a hard Minesweeper
	public Table returnHardDeck();


}
