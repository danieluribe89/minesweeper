package com.daniel.Minesweeper.Factory;

import org.springframework.beans.factory.annotation.Autowired;

import com.daniel.Minesweeper.DTO.Table;
import com.daniel.Minesweeper.Service.DeckService;

public class TableFactory {
	
	@Autowired
	DeckService deckFac;

	public Table returnEasyMinesweeper() {
		return deckFac.returnEasyDeck();
		
	}

	public Table returnMediumMinesweeper() {
		return deckFac.returnMediumDeck();
		
	}

	public Table returnHardMinesweeper() {
		return deckFac.returnHardDeck();
		
	} 
	
}
