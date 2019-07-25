package com.daniel.Minesweeper.DTO;

public class Table {
	
	private int xSize;
	private int ySize;
	private int numBombs;
	private Cell[][] listCells;
	
	public Table(int xSize, int ySize, int numBombs, Cell[][] cells) {
		super();
		this.xSize = xSize;
		this.ySize = ySize;
		this.numBombs = numBombs;
		this.listCells = cells;
	}
	
	public Table() {
		// TODO Auto-generated constructor stub
	}

	public int getxSize() {
		return xSize;
	}

	public void setxSize(int xSize) {
		this.xSize = xSize;
	}

	public int getySize() {
		return ySize;
	}

	public void setySize(int ySize) {
		this.ySize = ySize;
	}

	public int getNumBombs() {
		return numBombs;
	}

	public void setNumBombs(int numBombs) {
		this.numBombs = numBombs;
	}

	public Cell[][] getCells() {
		return listCells;
	}

	public void setCells(Cell[][] cells) {
		this.listCells = cells;
	}

	public Cell[][] getListCells() {
		return listCells;
	}

	public void setListCells(Cell[][] listCells) {
		this.listCells = listCells;
	}
	
	
	
}
