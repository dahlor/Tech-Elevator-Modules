package com.techelevator;

import java.util.ArrayList;

// Define the behaviors that much be implemented to be considered a CardHand

public interface CardHand {	// If you want to be considered a CardHand, you
							// must define these methods (behaviors)
	
	public ArrayList<PlayingCard> getHand(); // Returns cards in the hand as an ArrayList

	public void addCard(PlayingCard aCard); // receive a PlayingCars and add to the hand
	
	public void emptyHand();				// Remove all PlayingCards from the hand

	public void show();						// Display all the cards in the hand

}
