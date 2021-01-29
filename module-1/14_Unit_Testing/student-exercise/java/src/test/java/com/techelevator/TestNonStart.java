package com.techelevator;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestNonStart {
	
	NonStart testCode = new NonStart();

	@Test
	public void testPassesWithProperConcatenationMinusFirstLetter() {
		assertEquals("YOU DIDN'T CONCATENATE PROPERLY! FRANK IS MAD!","paghettieatballs", testCode.getPartialString("Spaghetti", "Meatballs"));
		assertEquals("YOU DIDN'T CONCATENATE PROPERLY! FRANK IS MAD!","altepper", testCode.getPartialString("Salt", "Pepper"));
	}
	
	@Test
	public void testFailsBecauseOfImproperSubtractionAndConcatenation() {
		assertNotEquals("You concatenated too well! Do worse next time!","SpaghettiMeatballs", testCode.getPartialString("Spaghetti", "Meatballs"));
		assertNotEquals("You concatenated too well! Do worse next time!","aghettiatballs", testCode.getPartialString("Spaghetti", "Meatballs"));
		assertNotEquals("You concatenated too well! Do worse next time!","SaltPepper", testCode.getPartialString("Salt", "Pepper"));
		assertNotEquals("You concatenated too well! Do worse next time!","ltpper", testCode.getPartialString("Salt", "Pepper"));
	}
}
