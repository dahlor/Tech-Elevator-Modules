package com.techelevator;

import java.util.Scanner;

public class TempConvert {

	public static void main(String[] args) {
		
		Scanner userInput  = new Scanner(System.in);
		
		String tempInput = "";
		String freedomUnits = "";
		int tempCelsius = 0;
		int tempFahrenheit = 0;

		while(true) {
		System.out.println("Please enter the temperature to be converted: " );
		tempInput = userInput.nextLine();
		
		int convertedNum = Integer.parseInt(tempInput);
	
		System.out.println("Would you like the result converted to (C)elsius or (F)ahrenheit? " );
		freedomUnits = userInput.nextLine();
		
		if (freedomUnits.equals("C") || freedomUnits.equals("c"))	{
			tempCelsius = ((convertedNum-32) * 5/9);
			System.out.println("Once converted, " + tempInput + "°F becomes " + tempCelsius + "°C.");
		}
		if (freedomUnits.equals("F") || freedomUnits.equals("f"))	{
			tempFahrenheit = ((convertedNum * 9/5) + 32);
			System.out.println("Once converted, " + tempInput + "°C becomes " + tempFahrenheit + "°F.");
		}

		}

	}

}
