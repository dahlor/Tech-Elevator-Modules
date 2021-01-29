package com.techelevator;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestLess20 {
	
	Less20 testCode = new Less20();

	@Test
	public void testFailsIfFedAMultipleOfTwenty() {
		assertEquals("That's not a multiple of 20! Try again!",false, testCode.isLessThanMultipleOf20(20));
		assertEquals("That's not a multiple of 20! Try again!",false, testCode.isLessThanMultipleOf20(40));
		assertEquals("That's not a multiple of 20! Try again!",false, testCode.isLessThanMultipleOf20(60));
		assertEquals("That's not a multiple of 20! Try again!",false, testCode.isLessThanMultipleOf20(80));
	}
	
	@Test
	public void testFailsIfFedAnIrrelevantNumber() {
		assertEquals("Your number is too useful! Try again!",false, testCode.isLessThanMultipleOf20(7));
		assertEquals("Your number is too useful! Try again!",false, testCode.isLessThanMultipleOf20(54));
		assertEquals("Your number is too useful! Try again!",false, testCode.isLessThanMultipleOf20(129));
		assertEquals("Your number is too useful! Try again!",false, testCode.isLessThanMultipleOf20(16));
	}
	
	@Test
	public void testSucceedsWithOneLessThanAMultipleOfTwenty() {
		assertEquals("I can't do anything with this number! Try again!",true, testCode.isLessThanMultipleOf20(19));
		assertEquals("I can't do anything with this number! Try again!",true, testCode.isLessThanMultipleOf20(39));
		assertEquals("I can't do anything with this number! Try again!",true, testCode.isLessThanMultipleOf20(59));
	}
	
	@Test
	public void testSucceedsWithTwoLessThanAMultipleOfTwenty() {
		assertEquals("I can't do anything with this number! Try again!",true, testCode.isLessThanMultipleOf20(18));
		assertEquals("I can't do anything with this number! Try again!",true, testCode.isLessThanMultipleOf20(38));
		assertEquals("I can't do anything with this number! Try again!",true, testCode.isLessThanMultipleOf20(58));
	}

}
