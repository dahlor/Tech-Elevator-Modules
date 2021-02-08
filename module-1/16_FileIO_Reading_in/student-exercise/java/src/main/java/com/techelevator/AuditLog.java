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
		// File checkLogFile = new File("./Log.txt");
		// if (checkLogFile.exists()) {
		//	checkLogFile.delete();
		// }
		
		
		// The method for inserting money into the vending machine
		public static void insertMoney(int moneyFed) throws IOException {
		  if ((moneyFed == 1) || (moneyFed == 2) || (moneyFed == 5) || (moneyFed == 10)) {
			
			// Instantiates the log file and flags for appended writing
			FileWriter feedWriter = new FileWriter("./Log.txt", true);
			PrintWriter printFeedWriter = new PrintWriter(feedWriter);
			
			//Add the money to the books.
			setBalance() = getBalance()+moneyFed;
			
			//Print the time, money inserted, and new balance.
			printFeedWriter.println(dateTime() + " FEED MONEY: $"+moneyFed+".00 $"+getBalance());  //New line
			printFeedWriter.close();
			}
		  System.out.println("Invalid dollar amount entered. Please try again.");
		}		
		
		
		
		
		// The method for purchasing an item from the vending machine.
		public static void itemPurchase(Map<String, String> // <----------THIS IS WRONG  itemSlot) throws IOException {

			// Making sure the entered slot exists.
			if (itemSlot = aRealSlotThatExists){ //<--- This is phrased wrong, but you know what it's supposed to be.

				//If you have the money...
				if (itemPrice <= getBalance()){
			
					//If it's in stock...
					if (slotLocation.itemStock() > 0) { //<--- This is phrased wrong, but you know what it's supposed to be.	
			
						// Instantiates the log file and flags for appended writing
						FileWriter itemWriter = new FileWriter("./Log.txt", true);
						PrintWriter printItemWriter = new PrintWriter(itemWriter);
		
			
						// The inventory part
						//!!!!!!!!!! DOUBLE CHECK THIS SHIT!!!!!!!!
						itemMap.put(slotLocation, newSlot.get(newSlot.quantity()) - 1);
						
				
						// Subtract the item price from the balance.
						setBalance() = (getBalance()-itemPrice);
						
						// Add to total sales.
						setTotalSales() = (getTotalSales() + itemPrice);
				
						//Print the transaction to the console.
						System.out.println("Your "+itemName+" has been dispensed. It cost $"+itemPrice+". Your remaining balance is $"+getBalance()+"\n");
			
						//Audit Log the time, item purchased, slot #, price, and remaining balance.
						printItemWriter.println(dateTime()+" "+itemName+" "+slotLocation+" $"+itemPrice+" $"+getBalance());
				
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
						else { 
							System.out.println("Chew Chew, Yum!\n");
						}
					} else {
					// ...it's not in stock.
					System.out.println("That item is SOLD OUT.\n");
					}
				} else {
				//...you don't have the money.
				System.out.println("Not enough money has been inserted to make this purchase.\n");
				}
			// User had a stroke and typed in some bullshit.
			System.out.println(slotLocation + " is not a valid choice. Please try again.\n");
		}
	}
	
		
	public static void finishTransaction() {
		
			System.out.println("CHANGE DISPENSING...\n");

	
			System.out.println("Your change is $"+getBalance()+".\n")
			System.out.println("This will be returned to you as " + returnChange()+".");
	
			printItemWriter.println(dateTime() + " GIVE CHANGE: $"+getBalance()+" $0.00\n");
			printItemWriter.close();
			
			// Change has been returned, so... 
			setBalance() = 0.00;
	}

	public static String returnChange() {

		  double quarter = 0.25;
	      double nickel = 0.05;
	      double dime = 0.10;
	      double penny = 0.01;
	      

	      double changeDue = ( (double)((int) Math.round(getBalance())*100)) / 100.0 );
	      double modQuarters = ( (double)((int) Math.round((changeDue % quarter)*100)) / 100.0 );
	      double modDimes = ( (double)((int) Math.round((modQuarters % dime)*100)) / 100.0 );
	      double modNickels = ( (double)((int) Math.round((modQuarters % nickel)*100)) / 100.0 );
	      double modPennies = ( (double)((int) Math.round((modQuarters % penny)*100)) / 100.0 );
	      
	      int numQuarters = (int)((changeDue - modQuarters) / (quarter));
	      int numDimes = (int)((modQuarters - modDimes) / (dime));
	      int numNickels = (int)((modDimes - modNickels) / (nickel));
	      int numPennies = (int)((modNickels - modPennies) / (penny));
	      
	      
	      String total = (numQuarters + "quarters, " + numDimes + "dimes, " + numNickels + "nickels, and " + numPennies + "pennies");
	      return total;
	}
	
		
		
		

		// Date and time formatted as requested.
		public static String dateTime() {
			DateFormat dateFormat2 = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss aa");
			String dateString2 = dateFormat2.format(new Date()).toString();
			return dateString2;
    }

}