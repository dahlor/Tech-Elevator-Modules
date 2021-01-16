package com.techelevator;

import java.util.Scanner;

public class LinearConvert {

	public static void main(String[] args) {

		Scanner userInput  = new Scanner(System.in);
		
		String lengthInput = "";
		String freedomUnits = "";
		double lengthMeters = 0;
		double lengthFeet = 0;

		while(true) {
		System.out.println("Please enter the length to be converted: " );
		lengthInput = userInput.nextLine();
		
		double convertedNum = Double.parseDouble(lengthInput);
		
		System.out.println("Would you like the result converted to (M)eters or (F)eet? " );
		freedomUnits = userInput.nextLine();
		
		if (freedomUnits.equals("M") || freedomUnits.equals("m"))	{
			lengthMeters = (convertedNum * 0.3048);
			System.out.println("Once converted, " + lengthInput + " feet becomes " + lengthMeters + " meters.");
		}
		if (freedomUnits.equals("F") || freedomUnits.equals("f"))	{
			lengthFeet = (convertedNum * 3.2808399);
			System.out.println("Once converted, " + lengthInput + " meters becomes " + lengthFeet + " feet.");
		}

		}

	}

}