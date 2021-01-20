package com.techelevator;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import java.util.HashMap;

public class Tutorial {
	
    public static void main(String[] args) {

    	// Step One: Declare a List

    	List<String> nameList = new ArrayList<String>();
    	
    	// Step Two: Add values to a List

    	nameList.add("Bob");
    	nameList.add("Rory");
    	nameList.add("Steve");
    	
    	// Step Three: Looping through a List in a for loop

    	for(int i = 0; i < nameList.size(); i++) {
    		System.out.println("These are the names: " + nameList.get(i));
    	}
    	
    	// Step Four: Remove an item
    	
    	nameList.remove(0);
    	

    	
    	// Step Five: Looping through List in a for-each loop
    	
    	for(String loop : nameList) {
    		System.out.println("These are the names: " + loop);
    	}

    }

}
