package com.techelevator;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestFrontTimes {
	
	FrontTimes testCode = new FrontTimes();

	@Test
	public void testSuccessWithWordLongerThanThreeLettersThreeTimes() {
		assertEquals("Your code sucks and doesn't work!","ChoChoCho", testCode.generateString("Chocolate", 3));
	}
	
	@Test
	public void testSuccessWithThreeLettersThreeTimes() {
		assertEquals("Your code sucks and doesn't work!","ChoChoCho", testCode.generateString("Cho", 3));

	}
	
	@Test
	public void testSuccessWithTwoLettersThreeTimes() {
		assertEquals("Your code sucks and doesn't work!","ChChCh", testCode.generateString("Ch", 3));

	}
	
	@Test
	public void testSuccessWithOneLetterThreeTimes() {
		assertEquals("Your code sucks and doesn't work!","CCC", testCode.generateString("C", 3));
	}
	
	@Test
	public void testSuccessWithWordLongerThanThreeLettersTwice() {
		assertEquals("Your code sucks and doesn't work!","ChoCho", testCode.generateString("Chocolate", 2));
	}
	
	@Test
	public void testSuccessWithThreeLettersTwice() {
		assertEquals("Your code sucks and doesn't work!","ChoCho", testCode.generateString("Cho", 2));

	}
	
	@Test
	public void testSuccessWithTwoLettersTwice() {
		assertEquals("Your code sucks and doesn't work!","ChCh", testCode.generateString("Ch", 2));

	}
	
	@Test
	public void testSuccessWithOneLetterTwice() {
		assertEquals("Your code sucks and doesn't work!","CC", testCode.generateString("C", 2));
	}
	
	@Test
	public void testSuccessWithWordLongerThanThreeLettersOnce() {
		assertEquals("Your code sucks and doesn't work!","Cho", testCode.generateString("Chocolate", 1));
	}
	
	@Test
	public void testSuccessWithThreeLettersOnce() {
		assertEquals("Your code sucks and doesn't work!","Cho", testCode.generateString("Cho", 1));

	}
	
	@Test
	public void testSuccessWithTwoLettersOnce() {
		assertEquals("Your code sucks and doesn't work!","Ch", testCode.generateString("Ch", 1));

	}
	
	@Test
	public void testSuccessWithOneLetterOnce() {
		assertEquals("Your code sucks and doesn't work!","C", testCode.generateString("C", 1));
	}
	
	@Test
	public void testFailWithNegativeInt() {
		assertEquals("YOU TYPED IN AN INTEGER! STRAIGHT TO JAIL!","", testCode.generateString("Chocolate", -3));
	}
	@Test
	public void testSuccessWithZeroInt() {
		assertEquals("YOU TYPED IN AN INTEGER! STRAIGHT TO JAIL!","", testCode.generateString("Chocolate", 0));
	}
	

}
