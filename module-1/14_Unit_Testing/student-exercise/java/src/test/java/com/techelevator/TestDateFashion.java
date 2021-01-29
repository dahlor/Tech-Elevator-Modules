package com.techelevator;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestDateFashion {
	
	DateFashion testCode = new DateFashion();

	@Test
	public void testDeniedZeroIfAnybodysLessThanTwo() {
		assertEquals("Nobody's ugly enough! Try again!",0, testCode.getATable(1, 4));
		assertEquals("Nobody's ugly enough! Try again!",0, testCode.getATable(4, 1));
		assertEquals("Nobody's ugly enough! Try again!",0, testCode.getATable(1, 8));
		assertEquals("Nobody's ugly enough! Try again!",0, testCode.getATable(8, 1));
	}
	
	@Test
	public void testMaybeOneIfEverybodysRightInTheMiddle() {
		assertEquals("Somebody's either too hot or too uggo. You tell me.",1, testCode.getATable(3, 5));
		assertEquals("Somebody's either too hot or too uggo. You tell me.",1, testCode.getATable(4, 4));
		assertEquals("Somebody's either too hot or too uggo. You tell me.",1, testCode.getATable(5, 3));

	}
	
	@Test
	public void testSuccessTwoIfAnybodysAHottieEightOrOver() {
		assertEquals("Only hotties get tables here! Go to Burger King!",2, testCode.getATable(4, 8));
		assertEquals("Only hotties get tables here! Go to Burger King!",2, testCode.getATable(8, 4));
	}

}
