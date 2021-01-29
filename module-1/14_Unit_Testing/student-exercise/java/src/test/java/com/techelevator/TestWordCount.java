package com.techelevator;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

public class TestWordCount {
	
	WordCount testCode = new WordCount();
	
	@Test
	public void test_getCount_to_return_the_correct_map() {
	
	// Arrange - Set up data for the test
	
	// Define a String array to use in the test - needs to be some duplicates
	
	String[] stringArray = {"Jeff", "Aiden", "Avery", "Sam", "Sam", "Avery"};
	
	// Define a Map with my expected result using the test data
	
	Map<String, Integer> expectedResultMap = new HashMap<String, Integer>();
	
	expectedResultMap.put("Jeff", 1);
	expectedResultMap.put("Aiden", 1);
	expectedResultMap.put("Avery", 2);
	expectedResultMap.put("Sam", 2);
	
	// Run the method to be tested and check it returns what we expect
	assertEquals("getCount TestFailed", expectedResultMap, testCode.getCount(stringArray));
	
	}
	
	
}

/* getCount(["ba", "ba", "black", "sheep"]) → {"ba" : 2, "black": 1, "sheep": 1 }
* getCount(["a", "b", "a", "c", "b"]) → {"a": 2, "b": 2, "c": 1}
* getCount([]) → {}
* getCount(["c", "b", "a"]) → {"c": 1, "b": 1, "a": 1}
*
*
* Map<String, Integer> getCount(String[] words)  - Receives a String array, returna a Map
* 
* 
*
*
*
*/