package com.techelevator;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

// This is the application program for the assessment

public class Module1CodingAssessment {

	public static void main(String[] args) throws FileNotFoundException {
		
		System.out.println("Module 1 Coding Assessment\n");
		
		ArrayList<Order> orderMap = new ArrayList<Order>();
		
		File aFile = new File("./FlowerInput.csv");

		Scanner inputDataFile = new Scanner(aFile);

		while(inputDataFile.hasNext()) {	
		String aLine = inputDataFile.nextLine();
		String[] valuesInLine = aLine.split(",");
			
		// Turning String array into manipulatable variables.
		String inputBouquetType = valuesInLine[0];
		Integer inputNumberOfRoses = Integer.parseInt(valuesInLine[1]);
	
		Order newOrder = new Order(inputBouquetType, inputNumberOfRoses);
		
		orderMap.add(newOrder);
		}		
		
		for (Order loopy : orderMap) {
			System.out.println(loopy.toString());
		}
	}
		
	public static double deliveryTotal(boolean sameDayDelivery, String zipCode) {
		
		if(Integer.parseInt(zipCode) >= 10000 && Integer.parseInt(zipCode) <=19999) {
			return 0.00;
		}
		if(Integer.parseInt(zipCode) >= 20000 && Integer.parseInt(zipCode) <=29999) {
			if (sameDayDelivery == true){
				return (3.99 + 5.99);
			} else {
				return 3.99;
			}	
		}
		if(Integer.parseInt(zipCode) >= 30000 && Integer.parseInt(zipCode) <=39999) {
			if (sameDayDelivery == true){
				return (6.99 + 5.99);
			} else {
				return 6.99;
			}	
		} else {
			return 19.99;
		}
	}
		// Put the code to test your assessment classes here
	
		// Didn't get to the JUNIT tests. Sorry, Frank.	
	}

