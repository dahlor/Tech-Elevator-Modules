package com.techelevator;

public class BankAccount {
	
	// MUH VARITABLES
	
	private String accountHolderName;
	private String accountNumber;
	private int balance;
	
	
	// MUH GEDDERS
	
	public String getAccountHolderName() {
		return accountHolderName;
	}
	public String getAccountNumber() {
		return accountNumber;
	}
	public int getBalance() {
		return balance;
	}
	
	// MUH CORNSHUCKERS
	
	// TOO ARGH
	
	public BankAccount (String accountHolderName, String accountNumber) {
		this.accountHolderName = accountHolderName;
		this.accountNumber = accountNumber;
		balance = 0;
	}
	
	// TREE ARGH
	
	public BankAccount (String accountHolderName, String accountNumber, int balance) {
		this.accountHolderName = accountHolderName;
		this.accountNumber = accountNumber;
		this.balance = balance;
	}
	
	// MEFFIDS
	
	public int deposit (int amountToDeposit) {
	
		balance = (getBalance() + amountToDeposit); 
		return balance;
	}
	
	public int withdraw (int amountToWithdraw) {
		
		balance = (getBalance() - amountToWithdraw); 
		return balance;
	}
	
}
