// slash-slash indicated a comment in your Java code
// a comment is information for a human who might be reading your code
// a comment line is ignored by the compiled
/* start of a block comment
 *		slash-asterisk starts a block comment
 *		all lines between the slash-asterisk and asterisk-slash
 *		are treated as comment and ignored by the compiler.
 */		// end of block comment

package com.techelevator;		// the package that holds the classes for this application

public class Lecture {			// A class within the application
		
	public static void main(String[] args) {	// a function in the application class
												// every Java application has at least a main() function
		
		
		// variables are used to hold data needed for the program
		// Data and understanding the data is fundamental to writing a successful program
		
		// in Java, a variable is defined:	datatype name;
		// 									datatype name = initial-value;
		//
		// If an initial value is not specified when you define the variable
		//		its content is unknown which may lead to errors or unpredictable results.
		// It's a good idea to ALWAYS initialize variables
		//
		// variable names must be unique within a block of code (between {})
		//
		//  Common Java Datatypes Based on What They Represent:
		//
		//	If the value is numeric, without a decimal point:	int
		//	If the value is numeric, with a decimal point:		double
		//	If the value is a single character:					char
		//	If the value is multiple characters or words:		String
		//	If the value is going to be true or false:			boolean
		//
		//	String is a special data type which we will discuss later.
		
		
		
		
		
		/*
		1. Create a variable to hold an int and call it numberOfExercises.
			Then set it to 26.
		*/

		int numberOfExercises = 26;
		
		System.out.println("The value in numberOfExercises is " + numberOfExercises + ".");

		/*
		2. Create a variable to hold a double and call it half.
			Set it to 0.5.
		*/

		double half = 0.5;
		
		System.out.println(half);

		/*
		3. Create a variable to hold a String and call it name.
			Set it to "TechElevator".
		*/
		
		String name = "TechElevator";

		System.out.println("name is: " + name);

		/*
		4. Create a variable called seasonsOfFirefly and set it to 1.
		*/

		int seasonsOfFirefly = 1;
		
		System.out.println(seasonsOfFirefly);

		/*
		5. Create a variable called myFavoriteLanguage and set it to "Java".
		*/

		String myFavoriteLanguage = "Java";
		
		System.out.println("Favorite language: " + myFavoriteLanguage);

		/*
		6. Create a variable called pi and set it to 3.1416.
		*/

		double pi = 3.1416;
		
		System.out.println("Pi is " + pi);

		/*
		7. Create and set a variable that holds your name.
		*/

		String myFirstName = "Eric";
		
		System.out.println("My name is " + myFirstName + ".");

		
		/*
		8. Create and set a variable that holds the number of buttons on your mouse.
		*/

		int mouseButtons = 5;
		System.out.println("There are " + mouseButtons + " buttons on my mouse.");
		
		/*
		9. Create and set a variable that holds the percentage of battery left on
		your phone.
		*/
		
		double batteryPercent = 0; // Initialized to 0 because percentage unspecified.
		System.out.println("Battery life: " + batteryPercent);

		/*
		10. Create an int variable that holds the difference between 121 and 27.
		*/

		int learningDifferences = (121 - 27);
		System.out.println("Deefrence: " + learningDifferences);
		
		/*
		11. Create a double that holds the addition of 12.3 and 32.1.
		*/
		
		double addDatStuffs = (12.3 + 32.1);
		System.out.println("Sum-de-dum: " + addDatStuffs); // sum is displayed as 44.40...6
														   // due to converting internal format of a double to a display
		/*
		12. Create a String that holds your full name.
		*/

		String fullName = "Eric Charles Dahl";
		System.out.println("My full name is " + fullName + ".");
		
		/*
		13. Create a String that holds the word "Hello, " concatenated onto your
		name from above.
		*/
		
		String hiMyNameIs = ("Hello, " + fullName + ".");
		System.out.println(hiMyNameIs);
		

		/*
		14. Add a " Esquire" onto the end of your full name and save it back to
		the same variable.
		*/
		
		fullName = (fullName + ", Esquire");
		System.out.println("fullName first revision: " + fullName);

		/*
		15. Now do the same as exercise 14, but use the += operator.
		*/
		
		fullName += (", Esquire");
		System.out.println("fullName second revision: " + fullName);


		/*
		16. Create a variable to hold "Saw" and add a 2 onto the end of it.
		*/
		
		String movie = "Saw";
		movie += " 2"; // movie = movie + "2" is okay also
		System.out.println(movie);

		/*
		17. Add a 0 onto the end of the variable from exercise 16.
		*/
		
		movie = movie + 0;
		System.out.println(movie);

		/*
		18. What is 4.4 divided by 2.2?
		*/
		
		System.out.println("4.4 / 2.2 is: " + 4.4/2.2);

		/*
		19. What is 5.4 divided by 2?
		*/

		System.out.println("5.4 / 2 is: " + 5.4/2);
		
		/*
		20. What is 5 divided by 2?
		*/

		System.out.println("5 / 2 is: " + 5/2);   // Integer divides result in a quotient and remainder.
											      // Quotient = 2 & Remainder = 1
		
		/*
		21. What is 5.0 divided by 2?
		*/
		
		System.out.println("5.0 / 2 is: " + 5.0/2);
		
		// When presented with different data types, Java will promote lesser to higher.
		// Hierarchy: double, float, long, int, byte/char

		System.out.println("5F / 2 is: " + 5F/2);
		
		
		System.out.println("(double) 5 / 2 is: " + (double) 5/2);


		
		
		/*
		22. What is 66.6 divided by 100? Is the answer you get right or wrong?
		*/

		System.out.println("66.6 / 100 is: " + 66.6/100); // Answer is displayed oddly, due to issue of conversion.
		
		/*
		23. If I divide 5 by 2, what's my remainder?
		
		*/
		
		System.out.println("If I divide 5 by 2, the remainder is: " + 5%2);


		/*
		24. What is 1,000,000,000 * 3?
		*/

		System.out.println("1,000,000,000 * 3 is: " +  1000000000*3); // Result is not correct because 3,000,000,000 doesn't fit in an integer.
		System.out.println("1,000,000,000L * 3 is: " +  1000000000L*3);
		
		/*
		25. Create a variable that holds a boolean called doneWithExercises and
		set it to false.
		*/
		
		boolean doneWithExercises = false;
		System.out.println("doneWithExercises = " + doneWithExercises);
		/*
		26. Now set doneWithExercise to true.
		*/
		
		doneWithExercises = true;
		System.out.println("doneWithExercises = " + doneWithExercises);

		
		
		
		
	}

}
