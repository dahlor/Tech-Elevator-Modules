package com.techelevator;

public class Lecture {

	public static void main(String[] args) {

		System.out.println("************************************");
		System.out.println("****** MAKING A STRING OBJECT ******");
		System.out.println("************************************");

		/* The String class gets special treatment in the Java language.  One
		 * example of this is that there is a literal representation of a
		 * String (i.e. characters appearing between two double quotes.  This
		 * is not the case for most classes */

		/* create an new instance of String using a literal
		 * 
		 *  Two ways to create a new String:
		 *  
		 *  	String name = new String(); 				// Create a new empty string
		 *  
		 * 		String name = "some value whatever"; 		// Create a new String with a value
		 * 
		 * 		A String literal is enclosed in " "	 - A series of one or more characters
		 * 
		 * 		A char literal is enclosed in ' '	 - A char is a single character
		 * 
		 * 		A String is NOT a char and a char is NOT a String 
		 *  
		 *  */
		
		String softDrink = "Diet Mtn. Dew";
		
		String beverage = softDrink +  " by Pepsi"; // + with Strings - concatenation
		
		System.out.println(beverage); // expecting to see "Diet Mtn. Dew by Pepsi"
		
		



//--------------------------------------------------------------------------------------------------------		
		System.out.println();
		System.out.println("******************************");
		System.out.println("****** MEMBER METHODS ******");
		System.out.println("******************************");
		System.out.println();

		/* 
		 *	String is a Class
		 *
		 *	A Class is a description of what an object of the class should look like
		 *	and what the object can do - A LOT tomorrow and the rest of the week.
		 *
		 *	An Object is an instance of a class.
		 *
		 *	In cooking, a recipe describes the ingredients and process for creating a food dish.
		 *
		 *	A cake recipe descrives how to make a cake - it is NOT the cake.
		 *
		 *	The cake you make from a recipe of an instance of the recipe. (An Object)
		 *
		 *	A Class contains methods to interact and manipulate Objects of the Class
		 *
		 *	A method is a function associated with a Class.
		 *
		 *	A member method is a method associated with a specific Class.
		 *
		 *	Methods are the same thing as functions. Methods in classes. Functions standalone.
		 *
		 *	To use a method for Class: anObjectOfTheClass.method(parameters)
		 *
		 */
		
		
		
		/* Commonly used String Class methods:  stringname.methodname(parameters)
		 *
		 * .length() - return the number of characters in a String
		 * .charAt(index) - returns the character at the index - 0 is first character
		 * .endsWith(search-string) - return true if the String ends with the search-string 
		 * .startsWith(search-string) - return true if the String starts with the search-string
		 * .indexOf(search-string) - return the index of the start of the 1st occurrence of search-string in the String
		 * .lastIndexOf(search-string) - return the index of the start of the last occurrence of search-string in the Stri
		 * .substring(start-index) - return from the start-index to rest of String
		 * .substring(start-index,end-index) - return from the start-index to the end-index (but not the char at end-index)
		 * .toLowerCase() - return the String in all lowercase
		 * .toUpperCase() - retrn the String in all uppercase
		 * .trim() - return the String with spaces removed from beginning and end of the String
		 * .split(delimiter) - returns and array of strings containing the characters between the delimiter specified
		 */

		String name = "Baker Mayfield";
		
		System.out.println("The variable name contains: " + name);
		System.out.println("The length of the value in name is: " + name.length());
		
		System.out.println("Does name end with the word 'field'? " + name.endsWith("field"));
		System.out.println("Does name end with the word 'Baker'? " + name.endsWith("Baker"));
		
		System.out.println("Does name start with the word 'field'? " + name.startsWith("field"));
		System.out.println("Does name start with the word 'Baker'? " + name.startsWith("Baker"));
		System.out.println("Does name start with the word 'Baker'? " + name.startsWith("Baker"));

		if (name.startsWith("Baker")) {
			System.out.println("Yea!!!");
		}
		else {
			System.out.println("Boooo!");
		}
		
		System.out.println("Does name contain the word 'May'? " + name.contains("May"));

		// charAt(index) - index starts at 0 - positions start at 1
		System.out.println("The character at position 4 is: " + name.charAt(3));
		
		System.out.println(name.charAt(8)); // Display the 'y' in "Baker Mayfield"
		
		System.out.println("The characted at position 9 is: " + name.charAt(8));
		
		System.out.println("Where is the 'f' in the name?: Position " + name.indexOf("f"));

		System.out.println("Where is the 'f' in the name?: Position " + name.indexOf("f"));
		
		System.out.println("Name in all lowercase is: " + name.toLowerCase());
		System.out.println("Name in all uppercase is: " + name.toUpperCase());
		
		// You can chain methods passing the result from one method to the next.
		System.out.println("Position of the F is: " + name.toUpperCase().indexOf("F"));

		// substring(index) - give me chars from the index specified to the end (index start at 0)
		System.out.println("Chars from the fifth to the end in name: " + name.substring(4)); // index 4 = fifth character.

		// substring(start-index,end-index) - give me chars from the start-index 
		//									  to the end-index but not including 
		//									  the char at end-index. Index to be
		//									  one more than the one you want.
		//
		//									  ALWAYS BE CAREFUL WITH THIS ONE!
		//
		System.out.println("Chars from the fifth to the eighth in name: " + name.substring(4,8)); // index 4 = fifth character.


		
//--------------------------------------------------------------------------------------------------------	
		
		/*   A String may also be created easily from an array of characters (char) */

		char[] helloArray = new char[] { 'H', 'e', 'l', 'l', 'o' }; // Array of characters
		
		String hello1 = new String(helloArray);  // Create a String using the array of characters
		String hello2 = new String(helloArray);  // Create a String using the array of characters
		
//--------------------------------------------------------------------------------------------------------			
		System.out.println();
		System.out.println("**********************");
		System.out.println("****** EQUALITY ******");
		System.out.println("**********************");
		System.out.println();

		/* Double equals will compare to see if the two variables, hello1 and
		 * hello2 point to the same object in memory. Are they the same object? */

		if (hello1 == hello2) {
			System.out.println("They are equal!");
		} else {
			System.out.println(hello1 + " is not equal to " + hello2);
		}

		String hello3 = hello1;
		if (hello1 == hello3) {
			System.out.println("hello1 is the same reference as hello3");
		}

		/* So, to compare the values of two objects, we need to use the equals method.
		 * Every object type has an equals method */
		if (hello1.equals(hello2)) {
			System.out.println("They are equal!");
		} else {
			System.out.println(hello1 + " is not equal to " + hello2);
		}

//--------------------------------------------------------------------------------------------------------			
		System.out.println();
		System.out.println("**************************");
		System.out.println("****** USING .split ******");
		System.out.println("**************************");
		System.out.println();
		
		String movieTitle = "Eternal Sunshine of the Spotless Mind";
		
		// We want to display each world in the movie title on a separate line
		// That means we need to split the movie title based on the space
		// The String .split method will separate a String into parts based on
		// 	 a character you give it
		// .split method returns an array of Strings with the part of the original String
		
		String[] wordsInTitle = movieTitle.split(" "); // Seperate parts of movieTitle based on a space
		
		System.out.println("Movie Title: " + movieTitle); // .print does NOT go to new line when done
		System.out.println(" contains " + wordsInTitle.length + " words\n"); // '\n' is a new line character to give us a new line
		
		for(int i=0; i < wordsInTitle.length; i++) {
			System.out.println("Word #" + (i+1) + " is " + wordsInTitle[i]);
		}

		String newTitle = "The Good, the Bad, and the Ugly";
		
		// We want to display each world in the movie title on a separate line
		// That means we need to split the movie title based on the space
		// The String .split method will separate a String into parts based on
		// 	 a character you give it
		// .split method returns an array of Strings with the part of the original String
		
		String[] newWordsInTitle = newTitle.split(" "); // Seperate parts of movieTitle based on a space
		
		System.out.println("Movie Title: " + newTitle); // .print does NOT go to new line when done
		System.out.println(" contains " + newWordsInTitle.length + " words\n"); // '\n' is a new line character to give us a new line
		
		for(int i=0; i < newWordsInTitle.length; i++) {
			System.out.println("Word #" + (i+1) + " is " + newWordsInTitle[i].trim()); // .trim() will remove unnecessary spaces.
		}
	
	
		// Make a String array of numbers from one to three.
		String[] numbersFromOneToThree = {"1", "2", "3", "4", "5"};
			
		// The For Loop
		for (int i = 0; i < 2; i++) {
			System.out.println(numbersFromOneToThree[i]);
		}
		
		
		// The For-Each Loop
		//				come up with a name  : the array to loop through
		for (String nameThisLiterallyWhatever: numbersFromOneToThree) {
			System.out.println(nameThisLiterallyWhatever);
			   }
			 }	
	}

//	public String[] repeatingText(String inputText, int numberOfTimes) {
		
//		String theAnswerString = "";
		
		
		
	
//		return theAnswerString;
	
	
	


