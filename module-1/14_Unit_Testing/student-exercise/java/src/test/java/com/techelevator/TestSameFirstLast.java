package com.techelevator;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestSameFirstLast {
	
	SameFirstLast testCode = new SameFirstLast();

	@Test
	public void testSendsFalseBecauseFirstAndLastNotTheSame() {
		assertEquals("Um, this is awkward, but your first and last are the same and they're not supposed to be.",false, testCode.isItTheSame(new int[] {2,5,7,9,13}));
		assertEquals("Um, this is awkward, but your first and last are the same and they're not supposed to be.",false, testCode.isItTheSame(new int[] {3,6,14,38,76}));
	}
	
	@Test
	public void testSendsTrueBecauseFirstAndLastAreTheSame() {
		assertEquals("Um, this is awkward, but your first and last are not the same and they're supposed to be.",true, testCode.isItTheSame(new int[] {13,5,7,9,13}));
		assertEquals("Um, this is awkward, but your first and last are not the same and they're supposed to be.",true, testCode.isItTheSame(new int[] {13,5,7,9,13}));
	}
}
