package com.techelevator;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestAnimalGroupName {
	//First we need to define an object with the methods we want to test
	
	AnimalGroupName testCode = new AnimalGroupName(); // Object with the methods we want to test

	@Test
	public void test_correct_animal_group_returned_based_on_animal() { // JUnit test method
		// Methods in the class we are testing are:
		//
		// String getHerd(String animalName)
		//
		// This method returns a String - assertEquals
		//
		// Test 1 - send it 'Elephant' and expect 'Herd'
		// Test 2  - send it 'Walrus' and expect 'unknown'
		// Test 3 - send it 'elephant' and expect 'Herd'
		// Test 4  - send it 'ELEPHANT' and expect 'Herd'
		// Test 5 - send it 'ElEpHaNt' and expect 'Herd'
		
		assertEquals("Wrong animal group returned","Herd", testCode.getHerd("Elephant"));
		assertEquals("Wrong animal group returned","unknown", testCode.getHerd("Walrus"));
		assertEquals("Wrong animal group returned","Herd", testCode.getHerd("elephant"));
		assertEquals("Wrong animal group returned","Herd", testCode.getHerd("ELEPHANT"));
		assertEquals("Wrong animal group returned","Herd", testCode.getHerd("ElEpHaNt"));	
	}

}
