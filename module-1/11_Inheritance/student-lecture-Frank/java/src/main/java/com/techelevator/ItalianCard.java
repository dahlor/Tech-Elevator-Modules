package com.techelevator;

public class ItalianCard extends PlayingCard {// This is a subclass of PlayingCard
	
	public ItalianCard() { // Default ctor
	// Because this is a subclass, we need to run a ctor of the superclass.
	// The superclass has only one 3-arg ctor that takes a value, suit, and color.
	//
	// Default Italian card: 1, SWORDS, RED
	
	super(1, "SWORDS", "RED"); // Call the superclass ctor to initialize the data it knows about
	
	}
	
}
