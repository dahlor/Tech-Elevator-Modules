package com.techelevator;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestMaxEnd3 {
	
	MaxEnd3 testCode = new MaxEnd3();

	@Test
	public void testPassesIfAIsLargerAndOutputIsAllAs() {
		assertArrayEquals("It was supposed to be all A's and IT WASN'T! You dissapoint me!",(new int[]{38,38,38}), testCode.makeArray(new int[]{38,5,7}));
		assertArrayEquals("It was supposed to be all A's and IT WASN'T! You dissapoint me!",(new int[]{14,14,14}), testCode.makeArray(new int[]{14,4,6}));
	}
	
	@Test
	public void testPassesIfCIsLargerAndOutputIsAllCs() {
		assertArrayEquals("It was supposed to be all C's and IT WASN'T! You dissapoint me!",(new int[]{13,13,13}), testCode.makeArray(new int[]{1,6,13}));
		assertArrayEquals("It was supposed to be all C's and IT WASN'T! You dissapoint me!",(new int[]{7,7,7}), testCode.makeArray(new int[]{2,3,7}));
	}
}
