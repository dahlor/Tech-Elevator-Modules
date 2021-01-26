package com.techelevator;

/**
 * CreditCardAccount
 */
public class CreditCardAccount implements Accountable {
	
/*******************************************************************
 * Place the code for  your CreditCard class here
 *******************************************************************/
	
	//These things.
	private String accountHolder;
	private String accountNumber;
	private int debt;
	
	

	//I don't remember what these do.
    public String getAccountHolder() {
		return accountHolder;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public int getDebt() {
		return debt;
	}

	
	//Um, this makes it work, right?
	public CreditCardAccount (String accountHolder, String accountNumber) {
		this.accountHolder = accountHolder;
		this.accountNumber = accountNumber;
		debt = 0;
	}


	public int getBalance() {
    	//***************************************************************
    	// This should return the negative of the debt data member
    	//***************************************************************
    	int negativeDebt = (0 - debt);
        return negativeDebt;
    }
	
	// Mor meffids.
	
	public int pay(int amountToPay) {
		debt = (debt - amountToPay);
		return getBalance();
	}
	
	public int charge(int amountToCharge) {
		debt = (debt + amountToCharge);
		return getBalance();
	}
}