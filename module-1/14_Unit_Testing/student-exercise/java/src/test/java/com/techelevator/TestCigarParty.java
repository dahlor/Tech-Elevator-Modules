package com.techelevator;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestCigarParty {
	
	CigarParty testCode = new CigarParty();

	@Test
	public void testSuccessOnWeekdayWithCigarsInRange() {
		assertEquals("Wrong amount of cigars for success!",true, testCode.haveParty(40, false));
		assertEquals("Wrong amount of cigars for success!",true, testCode.haveParty(60, false));
	}
	
	@Test
	public void testFailureOnWeekdayWithCigarsOutOfRange() {
		assertEquals("You had a successful amount of cigars! You fail!",false, testCode.haveParty(39, false));
		assertEquals("You had a successful amount of cigars! You fail!",false, testCode.haveParty(61, false));
	}
	
	@Test
	public void testSuccessOnWeekendWithCigarsInRange() {
		assertEquals("Wrong amount of cigars for success!",true, testCode.haveParty(40, true));
		assertEquals("Wrong amount of cigars for success!",true, testCode.haveParty(400, true));
	}
	
	@Test
	public void testFailureOnWeekendWithCigarsOutOfRange() {
		assertEquals("You had a successful amount of cigars! You fail!",false, testCode.haveParty(1, true));
		assertEquals("You had a successful amount of cigars! You fail!",false, testCode.haveParty(39, true));
	}

}
