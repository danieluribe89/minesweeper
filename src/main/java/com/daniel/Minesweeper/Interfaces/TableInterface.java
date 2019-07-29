package com.daniel.Minesweeper.Interfaces;

import com.daniel.Minesweeper.DTO.Cell;

public interface TableInterface {

	void selectCell(Cell[][] cells, int x, int y);

	public void obtainNextCells(Cell[][] array, int x, int y);

}