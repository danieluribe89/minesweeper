package com.daniel.Minesweeper.Service;

import com.daniel.Minesweeper.DTO.Cell;
import com.daniel.Minesweeper.Interfaces.TableInterface;

public class TableService implements TableInterface{

	@Override
	public void selectCell(Cell[][] array, int x, int y) {
		Cell current = array[x][y];
		if(((Cell)array[x][y]).isBomb()) throw new RuntimeException();
		else obtainNextCells(array,x,y);
	}
	
	public void obtainNextCells(Cell[][] array, int x, int y) {
		switch(((Cell)array[x][y]).getTypeOfCell().toString().toUpperCase()){
			case "CORNER":
				break;
			case "CENTER":
				break;
			case "SIDE":
				break;
			default:
				break;
					
		}		
	}
	
}