package com.techelevator;

import java.util.Scanner; // Give me access to the Scanner stuff provided by Java

public class CommandLineSampleProgram {

	public static void main(String[] args) {
		
		System.out.println("Welcome to Frank's Command Line Sample Program");
		
		// This code will read input from the keyboard and process it
		//
		// Define and object to represent the keyboard
		//
		// Scanner is the class that Java provides for us to define
		// keyboard objects.
		//
		// Since Java provides the System.in to represent the actual
		// keyboard, we need to associate our program keyboard object
		// with System.in
		//
		//
		//
		
		Scanner userInput  = new Scanner(System.in);
		
		String aLine = ""; // Will hold the line of input from the keyboard
		
		System.out.println("Please enter a line:" ); // Send a prompt to user so they know they need to type something. 
		aLine = userInput.nextLine();  // Go to the userInput object and get the nextLine
		
		System.out.println("You entered the line: " + aLine);   // Display the line entered by the user
		
		System.out.println("Please enter a whole number: ");
		// used to be aLine = usetInput.nextLine();
		int aNumber = userInput.nextInt();	// Get an int from the keyboard
		userInput.nextLine(); 				// Remove enter left in keyboard buffer by nextInt
											// 	so subsequent keyboard requests allow user to type more input.
		
		System.out.println("You entered the number: " + aNumber); // Show them what we got
		
		// We want to divide what half of the user entered by 2 to get half the value
		// We stored what they entered as a String which cannot be used in arithmetic
		// We need to convert the value in the String to a numeric value so we can do arithmetic
		// We can use the Integer.parseInt() or Double.parseDouble() to convert a String to a numeric
		
		// No longer need to convert the user input to an int from a String because we are getting an int
		// int theNumber = Integer.parseInt(aLine); // Convert what is in aLine to an int and store in the number
		
		System.out.println("Half of that number is: " + aNumber / 2);
		
		
		// Get a series of values from a user and determine the sum and average
		// 1. Ask the user to enter a value or indicate they are done ('N' = done)
		// 2. If they aren't done:
		//	  a. convert the value entered into a numeric
		//	  b. add the converted value to a sum
		//    c. count that they entered a number so we can calculate the average
		// 3. Once they are done - display the sum and the average
		
		String theValue = "";	// Hold the value entered by the user
		double sum = 0;			// Hold the sum of the values they enter
								// double because we are allowing decimal values
		int numNums = 0;		// Hold the number of values they enter
		
		
		// We don't know how many times we will get input, so while loop.
		//The while-loop will loop while a condition is true - end when the condition is false
		//
		// In this case, we will specify a never-ending look by looping while true
		// We will use break to end the loop when we decide it needs to end
		//
		while(true) {	// Loop until the end of time or we break out of the loop
			System.out.println("Enter a value or 'N' to end: ");  // Prompt user for input
			theValue = userInput.nextLine(); // Get input from the user
			// To test a String for equels we CANNOT use the normal == or !=
			// We will learn why on Monday.
	
			if (theValue.equals("N") || theValue.equals("n")) {
				break;
			
			// Above two lines causing crash.
			// Use the .equals() method to check a String for the value.
			
			}
			double valueEntered = Double.parseDouble(theValue); // Convert what they entered from a String to a double
			sum = sum + valueEntered; 							// Add the value entered as a number to sum
			numNums++; 										    // Add 1 to the count of the how many numbers they entered
			
		}
		System.out.println("The sum of the numbers is: " + sum);
		System.out.println("You entered " + numNums + " numbers");
		System.out.println("The average of the numbers: " + (sum / numNums));
		
	}

}
