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
				obtainNextsCorner((((Cell)array[x][y])),array);
				break;
			case "CENTER":
				break;
			case "SIDE":
				break;
			default:
				break;
					
		}		
	}
	
	public void obtainNextsCorner(Cell cell, Cell[][] array) {
		if(cell.getX() == 0 && cell.getY() == 0) { // UP LEFT CORNER
			
		}else if(cell.getX() == 0 && cell.getY() == Math.sqrt(array.length)-1) { // UP RIGHT CORNER
		
		}else if(cell.getX() == Math.sqrt(array.length)-1 && cell.getY() == 0) { // DOWN LEFT CORNER
			
		}else if(cell.getX() == Math.sqrt(array.length)-1 && cell.getY() == Math.sqrt(array.length)-1) { // DOWN RIGHT CORNER
			
		}
		
	}
	
}