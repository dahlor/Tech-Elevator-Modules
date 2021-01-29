package com.techelevator;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestStringBits {
	
	StringBits testCode = new StringBits();

	@Test
	public void testSendsThroughNothingWithBlankInput() {
		assertEquals("THESE ARE WORDS SIR! WE HAVE NO USE FOR WORDS IN THIS HERE METHOD!","", testCode.getBits(""));
	}
	
	@Test
	public void testDoesWhatItsSupposedToDoAndGivesTheCorrectOutput() {
		assertEquals("It doesn't work like it's supposed to! It's all your fault!","TEST", testCode.getBits("TOEOSOT"));
		assertEquals("It doesn't work like it's supposed to! It's all your fault!","test", testCode.getBits("toeosot"));
		assertEquals("It doesn't work like it's supposed to! It's all your fault!","test", testCode.getBits("tOeOsOt"));
	}
	
	@Test
	public void testSendsAStringOfOneBecauseIOnlyPutOneIn() {
		assertEquals("Somehow you're not returning the one-character string you're supposed to!","A", testCode.getBits("A"));
	}
	
	@Test
	public void testSendsAStringOfTwoBecauseIOnlyPutTwoIn() {
		assertEquals("Somehow you're not returning the two-character string you're supposed to!","B", testCode.getBits("Bc"));
	}
	
	@Test
	public void testSendsAStringOfThreeBecauseImFeelingThoroughToday() {
		assertEquals("Somehow you're not returning the three-character string you're supposed to!","CE", testCode.getBits("CdE"));
	}

}
