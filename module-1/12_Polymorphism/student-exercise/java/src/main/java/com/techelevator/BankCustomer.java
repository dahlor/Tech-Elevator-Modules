package com.techelevator;

import java.util.ArrayList;
import java.util.List;

/**
 * BankCustomer
 */
public class BankCustomer {
	
	// Stuffs.
	private String name;
	private String address;
	private String phoneNumber;
	private Accountable[] accounts;
	
	// Moar stuffs.
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	public Accountable[] getAccounts() {
		return accountArray.toArray(new Accountable[accountArray.size()]);
	}


	// Everybody Loves []mond 
    private List<Accountable> accountArray = new ArrayList<>();  // List of Accountable objects

    
    // Mur Mur Meffids
    public void addAccount(Accountable newAccount) {
    	accountArray.add(newAccount);
    }

    public boolean isVip() { 
	
    	int totalMoney = 0;
    	
    	for(Accountable looper : accountArray) {
    	totalMoney = (totalMoney + looper.getBalance());
    	}
    			
    	if (totalMoney >= 25000) {
    	return true;
    		}  		  	
    	return false;
    	}
}  	