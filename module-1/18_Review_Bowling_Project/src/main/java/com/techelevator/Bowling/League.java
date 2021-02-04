package com.techelevator.Bowling;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;

public class League {
	
	private String leagueName;
	private Map<Integer, ArrayList<Bowler>> leagueMembers;	 // Key = teamNumber, Value = a set of Bowlers
	
	
	// Default constructor
	public League() {
		leagueName = null;
		leagueMembers = null;
	}
	
	// 2-Arg constructor
	public League(String leagueName, String dataFileName) throws FileNotFoundException {
		this.leagueName = leagueName; // this. is required because the parameter has the same name as the data name
		// Load the data from the file given into leagueMembers using member function
		loadFile(dataFileName); // Run the loadFile method sending the file to be loaded
	}
	
// Method to load the file given into leagueMembers - it's private because we don't want users to run it	
// Only members of the class can call this method
	private void loadFile(String fileNameToLoad) throws FileNotFoundException {
		File aFile = new File(fileNameToLoad);	// Define a File object for the file
		Scanner inputDataFile = new Scanner(aFile);
		
		// Define variables to hold data from file
		int teamNumber = 0;
		int bowlerNumber = 0;
		String bowlerName = null;
		ArrayList<Integer> scores = new ArrayList<Integer>();	// Define a place to hold a set of scores
		
		
		while(inputDataFile.hasNext()) {	// Loop while the file has lines to read
			String aLine = inputDataFile.nextLine(); // Read a line from the file
			String[] valuesInLine = aLine.split(",");  // Separate the values between the commas
			
			// Define variables needed to instantiate a bowler			
			
			teamNumber = Integer.parseInt(valuesInLine[0]); // convert the first value from a line to an int and store it
			bowlerNumber = Integer.parseInt(valuesInLine[1]); // convert the second value from the to an int and store it
			bowlerName = valuesInLine[2];	// Store the third value from line;
			
			scores.add(Integer.parseInt(valuesInLine[3]));	// Convert the first score to an int and add to ArrayList
			scores.add(Integer.parseInt(valuesInLine[4]));	// Convert the second score to an int and add to ArrayList
			scores.add(Integer.parseInt(valuesInLine[5]));	// Convert the third score to an int and add to ArrayList
			
			// We have all the data from the file stored in variables
			// We can define a Bowler using the constructor
			Bowler aBowler = new Bowler(teamNumber, bowlerNumber, bowlerName, scores);
		

		
		}
	}
}
