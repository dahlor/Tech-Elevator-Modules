package com.techelevator;

import java.util.HashMap;
import java.util.Map;

public class Tutorial {
	

    public static void main(String[] args) {

        // Step One: Declare a Map

    	Map<String, String> projects = new HashMap<String, String>();
    
    	
    	// Step Two: Add items to a Map

    	projects.put("Ada", "Working on COBOL Programming");
    	projects.put("Grace", "COBOL");
    	projects.put("Steve", "Janitor at the High School");
    	projects.put("Carl", "Cannibal and Used Car Salesman");
    	
    	
    	// Step Three: Loop through a Map
    	
    	projects.remove("Grace");
    	for (Map.Entry<String, String> project : projects.entrySet()) {
    		System.out.println("The key " + project.getKey() + " is linked to the value " + project.getValue());
    	}
    	
    }

}
