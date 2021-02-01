package com.techelevator;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class WordSearch {

	public static void main(String[] args) throws FileNotFoundException {
		
		// Print dat sexy banner
		printApplicationBanner();
		
		// Instantiate my jabberwocky & a jabberwocky Scanner object
		File aliceFile = new File("./alices_adventures_in_wonderland.txt");
		Scanner aliceReader = new Scanner(aliceFile);
		
		// Getting all the inputs inputted
		Scanner searchInput = new Scanner(System.in);							
		System.out.print("What is the search word you are looking for? \n");	
		String searchedWord = searchInput.nextLine();						  
		System.out.print("Should the search be case sensitive? (Y/N) \n");	
		String caseSensitive = searchInput.nextLine();						
		searchInput.close();
		System.out.print("\nSearch Results:\n\n");

		// Declare my line counter
		int counter = 1;
		
		// If/Else for what to do depending on the case sensitivity answer.
		if (caseSensitive.contains("Y") || caseSensitive.contains("y")) {
			// Look for the word in the text
			while(aliceReader.hasNext()) { 					 
				String aLine = aliceReader.nextLine();
				if (aLine.contains(searchedWord)){
					System.out.println(counter + ") " + aLine);
					}
				counter++;
			}			
		} else {
			// Look for the word in the text
			while(aliceReader.hasNext()) { 					 
				String aLine = aliceReader.nextLine();
				if (aLine.toLowerCase().contains(searchedWord.toLowerCase())){
					System.out.println(counter + ") " + aLine);		 
					}
				counter++;
		}			
	}
}
	private static void printApplicationBanner() {
		System.out.println("****************************************************");
		System.out.println("*  E A T  M E   D R I N K  M E   S E A R C H  M E  *");
		System.out.println("****************************************************");
		System.out.println();
	}	
}