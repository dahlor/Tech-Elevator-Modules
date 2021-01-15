package com.techelevator;

public class FranksArrayExample {
	
	public static void main(String[] args) {  
		
		System.out.println("Welcome to Frank's Array Example Program"); 
		
		int score1 = 10;
		int score2 = 20;
		int score3 = 30;
		int score4 = 40; 	// this was added after the code was written and tested
		int score5 = 50;	// this was added after the code was written and tested
		
		int sum = 0; 		// this will hold the sum of the scores
		double avg = 0.0; 	// this will hold the average of the scores
		
		sum = score1 + score2 + score3 + score4 + score5;  // change in data req. change in code
		avg = sum / 5;
		
		// This code is tightly coupled because changes to the data requires changes to code.
		// Tightly coupled code is considered a bad practice because one might forget to change
		//		code in one or more places.
		
		System.out.println("Sum of scores: " + sum);
		System.out.println("Average of scores: " + avg);
		
		/* Use an array to hold and process the scores to make the code loosely coupled.
		 * 
		 * Loosely coupled means the code is not directly bound to the data.
		 * A SIGN OF A PROFESSIONAL PROGRAMMER
		 * 
		 * Changes to the data does not require changes to the code.
		 */
		
		int[] scores = new int[3];	// define a new int array with 3 elements
		
		scores[0] = 10;				// set the first element in the array to value 10
		scores[1] = 20;				// second ... to value 20
		scores[2] = 30;				// third ... to value 30
		
		sum = 0;					// reset sum to 0 to remove previous value in sum
		
		// use a for-loop to process each element in the array to determine the sum
		//
		// for loop will iterate through a block until the condition is false
		// a loop variable is defined in the for-loop and incremented each time through the loop
		// a condition in the for-loop is tested BEFORE each loop to see if it should loop
		//
		// for(int i=0; i < scores.length; i++)  -  the value in i will start at 0 and go to length of scores (0,1,2,3)
		//		1. i will be set to 0
		//		2. check to see if i is less than number of elements in array
		//		3. if #2 is true - continue to step 4; if #2 is false - exit the loop
		//		4. execute the statement in the block
		//		5. increment i (add 1 to i)
		//		6. go back to step #2
		
		//  init         condition      increment
		for(int i=0; i < scores.length; i++ ) { 	// loop while i is a valid index for scores array
			sum = sum + scores[i];					// add the element in scores to sum
													// scores[i] is called the current element
													// at the end of the loop, sum will contain
													// total of all the elements
			
		}
			System.out.println(sum);
			
 		
		
	   
	}
}