package com.daniel.Minesweeper.Service;

import java.util.HashSet;
import java.util.Set;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.daniel.Minesweeper.DTO.Cell;
import com.daniel.Minesweeper.DTO.Table;
import com.daniel.Minesweeper.Helpers.TableHelper;
import com.daniel.Minesweeper.Interfaces.DeckInterface;

@RestController
@RequestMapping("table")
public class DeckService implements DeckInterface{
	
	// Returns an easy Minesweeper
	@GetMapping("easy")
	public Table returnEasyDeck() {
		Cell[][] array = fillArray(new Cell[8][8],7);
		Set<String> bombs = repartBombs(8,array);
		for(String s : bombs) {
			String[] values = s.split("-");
			int x = Integer.parseInt(values[0]);
			int y = Integer.parseInt(values[1]);
			((Cell)array[x][y]).setBomb(true);
		}
		
		return new Table(8,8,bombs.size(),array);
	}

	// Returns a middle Minesweeper
	@GetMapping("medium")
	public Table returnMediumDeck() {
		Cell[][] array = fillArray(new Cell[12][12],11);
		Set<String> bombs = repartBombs(12,array);
		for(String s : bombs) {
			String[] values = s.split("-");
			int x = Integer.parseInt(values[0]);
			int y = Integer.parseInt(values[1]);
			((Cell)array[x][y]).setBomb(true);
		}
		
		return new Table(12,12,bombs.size(),array);
	}

	// Returns a hard Minesweeper
	@GetMapping("hard")
	public Table returnHardDeck() {
		Cell[][] array = fillArray(new Cell[15][15],14);
		Set<String> bombs = repartBombs(15,array);
		for(String s : bombs) {
			String[] values = s.split("-");
			int x = Integer.parseInt(values[0]);
			int y = Integer.parseInt(values[1]);
			((Cell)array[x][y]).setBomb(true);
		}
		
		return new Table(15,15,bombs.size(),array);
	} 
	
	// Fill the table
	public Cell[][] fillArray(Cell[][] list, int numRows) {
		int size = list.length;
		
		((Cell)list[0][0]).setTypeOfCell("CORNER");
		((Cell)list[0][numRows-1]).setTypeOfCell("CORNER");
		((Cell)list[numRows-1][0]).setTypeOfCell("CORNER");
		((Cell)list[numRows-1][numRows-1]).setTypeOfCell("CORNER");

		for (int row = 0; row < list.length; row++) { 
			for (int col = 0; col < list[row].length; col++) {
				
				if((row == 0 || col == 0 ) && ((Cell)list[row][col]).getTypeOfCell() != "CORNER") 
					((Cell)list[row][col]).setTypeOfCell("SLIDE");
			} 
		}
		
		for (int row = 0; row < list.length; row++) { 
			for (int col = 0; col < list[row].length; col++) {
				if(((Cell)list[row][col]).getTypeOfCell() != "CORNER" && ((Cell)list[row][col]).getTypeOfCell() != "SLIDE")		
					((Cell)list[row][col]).setTypeOfCell("CENTER");
			} 
		}

		return list;
	}
	
	// Select in a default form what cells will have a bomb
	public Set<String> repartBombs(int bombs, Cell[][] list) {
		Set<String> bombCells = new HashSet<String>();
		
		while(bombCells.size()<bombs) {
			int x = TableHelper.randomNumber(0,(list.length/2));
			int y = TableHelper.randomNumber(0,(list.length/2));
			bombCells.add(x+"-"+y);
		}

		return bombCells;
		
	}


}