package com.techelevator;

public class SquareWall extends RectangleWall {

	private int sideLength;

	public int getSideLength() {
		return sideLength;
	}
	
	//Constructor
	public SquareWall(String name, String color, int sideLength) {
	super (name, color, sideLength, sideLength);
	this.sideLength = sideLength;
	}
	
	// toString
	
	public String toString() {
		return (super.getName() + " (" + getSideLength() + "x" + getSideLength() + ") square");
		}
}
