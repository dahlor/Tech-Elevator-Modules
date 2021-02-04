package com.techelevator;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;

public class AuditLog {
	
	public static void main(String args[]) throws IOException {
		

		
		// Add this to beginning of VendingMachine, when pulling the input file.
		// If a Log.txt exists, it will delete it, so we start fresh every time.
		File checkLogFile = new File("./Log.txt");
		if (checkLogFile.exists()) {
			checkLogFile.delete();
		}
		
		
		// The method for inserting money into the vending machine
		public static void insertMoney(int moneyFed) throws IOException {
			
			// Instantiates the log file and flags for appended writing
			FileWriter feedWriter = new FileWriter("./Log.txt", true);
			PrintWriter printFeedWriter = new PrintWriter(feedWriter);
			
			//Add the money to the books.
			setBalance() = getBalance()+moneyFed;
			
			//Print the time, money inserted, and new balance.
			printFeedWriter.println(dateTime() + " FEED MONEY: $"+moneyFed+".00 $"+getBalance());  //New line
			printFeedWriter.close();
		}		
		
		
		
		
// The method for purchasing an item from the vending machine.
public static void itemPurchase(Map<String, String> //THIS IS WRONG slotLocation) throws IOException {

	// Making sure the entered slot exists.
	if (slotLocation = aRealSlotThatExists){ //<--- This is phrased wrong, but you know what it's supposed to be.

		//If you have the money...
		if (itemCost <= getBalance()){
			
			//If it's in stock...
			if (slotLocation.itemStock() > 0) { //<--- This is phrased wrong, but you know what it's supposed to be.	
			
			// Instantiates the log file and flags for appended writing
				FileWriter itemWriter = new FileWriter("./Log.txt", true);
				PrintWriter printItemWriter = new PrintWriter(itemWriter);
			
			
				// INVENTORY CODE GOES HERE. SUBTRACTING THE ITEM FROM CURRENT STOCK, ETC.
				
				
				// Subtract the item price from the balance.
				setBalance() = (getBalance()-itemCost);
				
				//Print the transaction to the console.
				System.out.println("Your "+itemName+" has been dispensed. It cost $"+itemCost+". Your remaining balance is $"+getBalance()+"\n");
			
				//Audit Log the time, item purchased, slot #, price, and remaining balance.
				printItemWriter.println(dateTime()+" "+itemName+" "+slotLocation+" $"+itemCost+" $"+getBalance());
				
				//Response Plinko.
				if (itemType == "chip"){
					System.out.println("Crunch Crunch, Yum!\n");
				}
				if (itemType == "candy"){
					System.out.println("Munch Munch, Yum!\n");
				}
				if (itemType == "drink"){
					System.out.println("Glug Glug, Yum!\n");
				}
				if (itemType == "gum"){
					System.out.println("Chew Chew, Yum!\n");
				}
			} else {
				// ...it's not in stock.
				System.out.println("That item is SOLD OUT.\n");
			}
		} else {
			//...you don't have the money.
			System.out.println("You have not inserted enough money to make this purchase.\n");
		  }
	// User had a stroke and typed in some bullshit.
	System.out.println("That was some bullshit you just typed in right there. Try again.");
  }
}
	
		
		
		//This is code for the [3] FINISH TRANSACTION AREA
		//Print the GIVE CHANGE, etc. to the Audit Log
		//printItemWriter.println(dateTime() + " GIVE CHANGE: $"+itemCost+" $"+getBalance());
		//printItemWriter.close();
		
		
		

		// Date and time formatted as requested.
		public static String dateTime() {
			DateFormat dateFormat2 = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss aa");
			String dateString2 = dateFormat2.format(new Date()).toString();
			return dateString2;
    }

}