package com.techelevator.exceptions;



// Define a class that extends the Exception class
public class OverdraftException extends Exception {

// Code what the Exception is supposed to do	
// In this example if a withdrawal would result in an overdraft, the application will throw this exception
// The system and Java don't care or know what an overdraft is or that we consider it a problem
	private double overdraftAmount = 0; // Data member to hold the amount sent when this Exception is thrown
	
	// The constructor for the Exception is where the code for the Exception goes
	// This Exception receives two parameters: a message and the overdraft amount
	public OverdraftException(String message, double overdraftAmount) {
		super(message);		// Call the super class constructor with the message passed in when the Exception was thrown
		this.overdraftAmount = overdraftAmount;
	}

	public double getOverdraftAmount() {
		return overdraftAmount;
	}
}
