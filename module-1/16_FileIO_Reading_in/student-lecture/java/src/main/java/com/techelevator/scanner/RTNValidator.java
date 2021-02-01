package com.techelevator.scanner;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class RTNValidator {
	
	// This program will validate bank routing numbers stored in a file.
	
	// constant of values used to determine if a rtn is valid - has nothing to do with File I/O
	private static final int[] CHECKSUM_WEIGHTS = new int[] { 3, 7, 1, 3, 7, 1, 3, 7, 1 };

	public static void main(String[] args) throws FileNotFoundException {
		
		printApplicationBanner();		// Display a polite hello message
		
		// Instantiate a File object for the path
		
//		File inputFile = getInputFileFromUser();				// Define a file object for the file
																// We get the File object from a method
		File inputFile = new File ("rtn.txt");					// Hardcode the value. 

// Instantiating the Scanner object in a try() causes it to be automatically closed at the end of the program
// If you define the Scanner object yourself, you are responsible for closing it at the end of the program
// Leaving a file open at the end of the program, you are causing a Resource Leak
// A resource leak is when resources (memory) used by the program are not freed at the end of the program
// Resource leaks can lead to slower processing, unexpected errors, or computer just stopping
		
		
//		try(Scanner fileScanner = new Scanner(inputFile)); 		// Define Scanner object for the file
		Scanner fileScanner = new Scanner(inputFile); {		
			
			// If you try to read more lines than in the file, an exception is thrown - program terminates with a message
			while(fileScanner.hasNextLine()) {					// Loop through the file as long as the file has a line to read
				String line = fileScanner.nextLine();			//		Get the next line from the file
				String rtn = line.substring(0, 9);				//		Extract the first 9 chars as the rtn
				
				if(checksumIsValid(rtn) == false) {				// Pass the rtn to the validation method
					System.out.println(line);					//		if the rtn was not valid - display it
				}
			}
		
			// before program ends, close any files that were not instantiated in a try()
			fileScanner.close();  // Close the file to release resources used to process it
			// end of main ()
		}
	}

	private static void printApplicationBanner() {
		System.out.println("******************");
		System.out.println("RTN Validator 9000");
		System.out.println("******************");
		System.out.println();
	}

	@SuppressWarnings("resource")
	// This method will get a path from a user and if it's valid, return a File object for the path
	private static File getInputFileFromUser() {
		Scanner userInput = new Scanner(System.in);					// Instantiate an objece for keyboard
		System.out.print("Please enter path to input file >>> ");	// Display a user prompt for input
		String path = userInput.nextLine();						    // Get a line of input from the keyboard
		
		File inputFile = new File(path);	// Instantiate a File object for the fpath entered by the user
		
		// Check to be sure what the user entered was a valid, existing path to a file
		
		if(inputFile.exists() == false) {                           // does the path given NOT exist
			System.out.println(path+" does not exist");				// if so, display a message
			System.exit(1); // Ends the program						// 		and end the program with return code 1
		} else if(inputFile.isFile() == false) {					// was the path given NOT a file?
			System.out.println(path+" is not a file");				// if so, display a message
			System.exit(1); 										//  	and ends the program with return code 1					
		}
		// If we get here, we know the path given was a valid, existing file
		return inputFile;		// return the File object for the path given
	}

	private static boolean checksumIsValid(String routingNumber) {
		int checksum = 0;
		for(int i = 0; i < 9; i++) {
			int digit = Integer.parseInt(routingNumber.substring(i, i+1));
			checksum += digit * CHECKSUM_WEIGHTS[i];
		}
		return checksum % 10 == 0;
	}
}
