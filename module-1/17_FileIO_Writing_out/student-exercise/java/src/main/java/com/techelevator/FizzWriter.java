package com.techelevator;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

public class FizzWriter {

	public static void main(String[] args) throws IOException {
		
		// Instantiate FizzBuzz
		File fizzyFile = new File("./FizzBuzz.txt");
		
		// Create FizzBuzz.txt in directory
		fizzyFile.createNewFile();

		// Create my PrintWriter to write to FizzBuzz.txt
		PrintWriter fizzWriter = new PrintWriter(fizzyFile);		
	
		// Let's get iterating.
		for(Integer i = 1; i < 301; i++) {
			
			// Just trust me with this.
			int counter = 0;
	
			// Value Plinko.
			if((i.toString().contains("135"))) {
			fizzWriter.write("#"+i+": " + "FizzBuzz and also Fizz and Buzz separately.\n");	
			counter++;
			}	
			if(((i % 5 == 0) && (i % 3 == 0)) && counter == 0) {
			fizzWriter.write("#"+i+": FizzBuzz\n");
			counter++;	
			}
			if((i.toString().contains("5") && i.toString().contains("3")) && counter == 0) {
			fizzWriter.write("#"+i+": Both Fizz and Buzz, but separately.\n");	
			counter++;
			}
			if((i % 3 == 0 || i.toString().contains("3")) && counter == 0) {
			fizzWriter.write("#"+i+": Fizz\n");	
			counter++;
			}
			if((i % 5 == 0 || i.toString().contains("5")) && counter == 0) {
			fizzWriter.write("#"+i+": Buzz\n");	
			counter++;
			}	
			if((i % 5 != 0) && (i % 3 != 0) && !i.toString().contains("5") && !i.toString().contains("3")) {
			fizzWriter.write("#"+i+": " + i + "\n");	
			}
		}
		fizzWriter.close();
		System.out.println("FizzBuzz.txt has been created.");
	}	
}



