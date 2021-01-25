package com.techelevator;

public class IntroToClassesCard {
        //------------------------------------------------------------------------------------------------------------
        // Application program for the Intro To Classes App
        //------------------------------------------------------------------------------------------------------------
        // 
		// Every Java application must have one method called main()
		//
		// main() is where execution starts for any Java application
		//
		// main() is the Application Program
		//
		// Application Program instantiates and manipulates objects to get its work done
	
		public static void main(String[] args) {
        /*
        *  This program will demonstrate several concepts presented in the Java cohort
        *  in the topic Introduction to Classes 		
        */
		//  To instantiate an object:
		//	
		//	ClassName objName = new ClassName();   the () after the class name causes a constructor for
		//										   the class to be run if no  
			PlayingCard aCard = new PlayingCard(); // Instantiate a PlayingCard object
			
		
			
			System.out.println(aCard);	// display aCard
										// System.out.println - displays Strings
										// Whatever you give it inside () must be convertible
										// 	 to a String
										// aCard is a PlayingCard type - not a string
										// System.out.println look to find a method to convert
										//   aCard to a String
										// A class may provide a method called toString() to
										//   return a String
										// String representation of an object of the class
										// If a toString() is not provided for the class
										//   an error occurs when a String is needed
										// System.out.println looks for a toString() for the
										//   PlayingCard class
										// If a toString() is NOT found for the class of an object,
										//   it looks to any class in the family of classes that
										//   the object belongs to
			
			PlayingCard anotherCard = new PlayingCard(1, "Black", "Clubs");
			System.out.println("anotherCard is: " + anotherCard);
			
			PlayingCard anotherNotherCard = new PlayingCard(12, "Red", "Spades");
			System.out.println("anotherNotherCard is: " + anotherNotherCard);
			
			System.out.println("The value of the card is " + anotherNotherCard.getCardValue());
			
			anotherNotherCard.setCardValue(7);
			System.out.println("The value of the card is " + anotherNotherCard.getCardValue());

	}
}
		 

