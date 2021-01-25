package com.techelevator;

public class FruitTree {
	
	private String typeOfFruit;
	private int piecesOfFruitLeft;

	public String getTypeOfFruit() {
		return typeOfFruit;
	}
	public int getPiecesOfFruitLeft() {
		return piecesOfFruitLeft;
	}
	
	// Ctor - 2-arg Constructor
	public FruitTree(String typeOfFruit, int piecesOfFruitLeft){
	this.typeOfFruit = typeOfFruit;  // Set the data member to the parameter
	this.piecesOfFruitLeft = piecesOfFruitLeft;  // Set the data member to the parameter
	}
	
	
	public boolean pickFruit(int numberOfPiecesToRemove) { 
				
		if (piecesOfFruitLeft >= numberOfPiecesToRemove) {
			piecesOfFruitLeft = (piecesOfFruitLeft - numberOfPiecesToRemove);
			return true;
		}
		return false;
	}
	
}