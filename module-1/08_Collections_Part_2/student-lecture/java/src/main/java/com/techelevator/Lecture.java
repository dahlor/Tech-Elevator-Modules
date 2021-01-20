package com.techelevator;

import java.util.HashMap; 		 // Include the code to support a HashMap
import java.util.LinkedHashMap;  // Include the code to support a LinkedHashMap
import java.util.Map;	  		 // Include the code to support a generic Map
import java.util.Set;	 		 // Include the code to support a Set
import java.util.TreeMap;		 // Include the code to support a TreeMap

public class Lecture {

	public static void main(String[] args) {

		System.out.println("####################");
		System.out.println("        MAPS");
		System.out.println("####################");
		System.out.println();

		
//  Map is a Collections to hold and access key-value pairs
//  The key is a unique value that identifies the pair
// 	The value is what you want associated with the key
//  A Map is also known as an "associative array"
//
// 	A key must be unique within the Map
//
// 	Types of Maps:
//		  HashMap - entries are stored in an unknown order
//	   	  TreeMap - entries are stored in key sequence
//  LinkedHashMap - entries are stored in the order they are added to the Map
//
//  To define a Map:
//					 Map<key-data-type, value-data-type> name-of-map = new type-of-map();
//					 type-of-map<key-data-type, value-data-type> name-of-map = type-of-map();
//
//  Define a Map where the key is a String and the value is a String:		
//		
//					 Map<String, String> myMap     = new HashMap();
//		 			 HashMap<String, String> myMap = new HashMap();		
//		             Map<String, String> myMap     = new HashMap<String, String>();		
//                   HashMap<String, String> myMap = new HashMap<String, String>();		
//
// 	All of these ways are correct.
//
//  Define a Map to associate a person's name to where they live = ex. "Frank" & "Mayfield"
//	key - person's names	 -	a String
//  value - where they live  -	a String

		//	   key, value
		//    type, type	  name     type-of-map()
		Map<String,String> residence = new LinkedHashMap();   // LinkedHashMap stores in entry sequence - best when entry sequence is important
															  // TreeMap stores in key sequence - best for lots of searching
															  // HashMap stores in unknown sequence - best when you don't care
		
		//Let's add people to the Map
		residence.put("Frank", "Mayfield");
		residence.put("Jeff", "Istanbul");
		residence.put("Brianna", "North Tonawanda");
		residence.put("D", "Wakanda");
		residence.put("Sam", "Youngstown");
		residence.put("Avery", "Cleveland Heights");
		residence.put("Daniel", "Lakewood");
		residence.put("Wally", "Mayfield");
		
		// Use .get(key-value) to access a Map using the key
		// The value associated with the key is returned
		// .get returns a null if the key is not in the map
		
		System.out.println("D lives in: " + residence.get("D"));
		System.out.println("Brianna lived in: " + residence.get("Brianna"));
		System.out.println("Jeff lives in: " + residence.get("Jeff"));
		
		String name = "Sam";
		
		System.out.println(name + " lives in: " + residence.get(name));
		
		System.out.println("--------------------------------------------------------------------------------");
		
		// Top process all the entries in the Map, you need to get a list of keys in the Map
		// and use them to process the entries in the Map.
		//
		// We need to get the list of keys out of the Map and then iterate through the list
		// of keys using some sort of for-loop.
		//
		// 		.keySet() - returns the list of keys in a Map as a Set object
		//
		// A Set object is an instance of the Collection class set
		// Set class is an unordered set of elements that must be unique
		//		(different from ArrayList because elements in ArrayList do not have to be unique)
		//
		// To define a Set: Set<data-type>
		//
		// Get the list of keys in our Map
				Set<String> theKeys = residence.keySet(); // Get the keys from residence as a Set
														  // String is used because keys are Strings
		//
		// Go through the Set of keys using a for-each loop since we want to process all the keys
		//		for(data-type  name-of-element : object-you-use)
		        for(String anElement : theKeys) {	// Loop through theKeys one at a time assigning the current key to anElement
		        	String theValue = residence.get(anElement); // Get the value for current key and store it in theValue
		        	System.out.println(anElement + " lives in " + theValue);
		        }
				    System.out.println("--------------------------------------------------------------------------------");
			
		// .remove(key-value) will remove an entry from the map
				residence.remove("Frank"); // Remove the entry with the key Frank
				    
				System.out.println("Frank lives in: " + residence.get("Frank"));
				
			    System.out.println("--------------------------------------------------------------------------------");

	   // Since keys must be unique in a Map, if you try to add a key that already exists,
	   // the value for the key will be updated.
			    
			    System.out.println("Try to add Daniel living in Timbuktu");
			    
			    residence.put("Daniel", "Timbuktu"); // If Daniel is already in the Map, the value is updated
			    
			    for(String anElement : theKeys) {	// Loop through theKeys one at a time assigning the current key to anElement
		        	String theValue = residence.get(anElement); // Get the value for current key and store it in theValue
		        	System.out.println(anElement + " lives in " + theValue);
		        }
		     
		
	}

}
