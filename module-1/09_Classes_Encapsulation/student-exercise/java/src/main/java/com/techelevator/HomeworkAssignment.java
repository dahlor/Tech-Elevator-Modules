package com.techelevator;

public class HomeworkAssignment {
	
	
// Private means only members of the class have access to the date
// 		Outsiders have to use methods.
	
	private int    earnedMarks;
	private int    possibleMarks;
	private String submitterName;
	
	public int getEarnedMarks() {
		return earnedMarks;
	}
	public void setEarnedMarks(int earnedMarks) {
		this.earnedMarks = earnedMarks;
	}
	public int getPossibleMarks() {
		return possibleMarks;
	}
	public String getSubmitterName() {
		return submitterName;
	}
	
// Ctor - 2-arg Constructor
	public HomeworkAssignment(int possibleMarks, String submitterName) {
		this.possibleMarks = possibleMarks;  // Set the data member to the parameter
		this.submitterName = submitterName;  // Set the data member to the parameter
	}	

	
// A derived attribute/value is one that a method determines and returns	
// Method to determine the derived value letterGrade
// We make it public so anyone with an object of this class can access the methods.
	public String getLetterGrade() {
		
		String letterGrade = "";	// Storage for letter grade to be returned

//					   int         / int      result is an int (90/100 = 0)
		double grade = (double) earnedMarks / possibleMarks;   // We are allowed to use the data members
													  // because this method is members of class.
		
		if (grade >= 0.90) {
			letterGrade = "A";
		}
		else if (grade >= 0.80) {
			letterGrade = "B";
		}
		else if (grade >= 0.70) {
			letterGrade = "C";
		}
		else if (grade >= 0.60) {
			letterGrade = "D";
		} else { 
			letterGrade = "F";
		}
		return letterGrade;			// Return the letter grade
	}
	
	
}
