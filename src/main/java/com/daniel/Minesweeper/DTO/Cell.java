package com.daniel.Minesweeper.DTO;

public class Cell {
	
	private boolean bomb;
	private String celValue; // "HIDDEN", "CLEAN", "BOMB", "A NUMBER"
	private int x, y;
	private String typeOfCell; // "CORNER","CENTER","SIDE"
	
	public Cell(boolean bomb, String celValue, int x, int y, String typeOfCell) {
		super();
		this.bomb = bomb;
		this.celValue = celValue;
		this.x = x;
		this.y = y;
		this.typeOfCell = typeOfCell;
	}

	public Cell() {
		// TODO Auto-generated constructor stub
	}

	public boolean isBomb() {
		return bomb;
	}

	public void setBomb(boolean bomb) {
		this.bomb = bomb;
	}

	public String getCelValue() {
		return celValue;
	}

	public void setCelValue(String celValue) {
		this.celValue = celValue;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public String getTypeOfCell() {
		return typeOfCell;
	}

	public void setTypeOfCell(String typeOfCell) {
		this.typeOfCell = typeOfCell;
	}

}
