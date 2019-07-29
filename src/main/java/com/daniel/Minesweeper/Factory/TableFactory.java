package com.daniel.Minesweeper.Factory;

import org.springframework.beans.factory.annotation.Autowired;

import com.daniel.Minesweeper.DTO.Table;
import com.daniel.Minesweeper.Service.DeckService;

public class TableFactory {
	
	@Autowired
	DeckService deckFac;

   public Table getTable(String shapeType){
      if(shapeType == null){
         return null;
      }		
      if(shapeType.equalsIgnoreCase("EASY")){
    	  return deckFac.returnEasyDeck();
	  } else if(shapeType.equalsIgnoreCase("MEDIUM")){
		  return deckFac.returnMediumDeck();         
	  } else if(shapeType.equalsIgnoreCase("HARD")){
	   	  return deckFac.returnHardDeck();
	  }
		      
      return null;
	  }
	
}
