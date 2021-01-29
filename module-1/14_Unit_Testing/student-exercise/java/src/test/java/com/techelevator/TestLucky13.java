package com.techelevator;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestLucky13 {
	
	Lucky13 testCode = new Lucky13();

	@Test
	public void testPassesIfNoOnesAndThreesFound() {
		assertEquals("Ones and threes! ONEESS ADNNND THREREESSS!",true, testCode.getLucky(new int[]{2,5,7}));
		assertEquals("Ones and threes! ONEESS ADNNND THREREESSS!",true, testCode.getLucky(new int[]{0,4,6}));
	}
	
	@Test
	public void testFailsIfDirtyBastardOnesAndThreesSnuckInThere() {
		assertEquals("Not ONESY OR THREESY ENOUGH! Try again!",false, testCode.getLucky(new int[]{1,6,13}));
		assertEquals("Not ONESY OR THREESY ENOUGH! Try again!",false, testCode.getLucky(new int[]{2,3,7}));
	}


}
