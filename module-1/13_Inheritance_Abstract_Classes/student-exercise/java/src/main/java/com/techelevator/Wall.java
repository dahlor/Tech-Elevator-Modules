package com.techelevator;

public abstract class Wall {

	// Variables
	private String name;
	private String color;
	
	
	// Getters
	public String getName() {
		return name;
	}
	public String getColor() {
		return color;
	}

	
	// Constructor
	public Wall (String name, String color) {
		this.name = name;
		this.color = color;
	}

	// Method
	public abstract int getArea();
	
}
