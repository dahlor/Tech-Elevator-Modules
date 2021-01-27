package com.techelevator;

public class RectangleWall extends Wall {
	
	private int length;
	private int height;
	
	
	public int getLength() {
		return length;
	}
	public int getHeight() {
		return height;
	}
	
	
	public RectangleWall(String name, String color, int length, int height) {
		super (name, color);
		this.length = length;
		this.height = height;
		
	}
	@Override
	public int getArea() {
		int totalArea = (length * height);
		return totalArea;
	}
	
	// toString
	
	public String toString() {
		return (super.getName() + " (" + getLength() + "x" + getHeight() + ") rectangle");
	}
}
