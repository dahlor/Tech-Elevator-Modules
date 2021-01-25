package com.techelevator;

public class CheckingAccount extends BankAccount {


	// MUH CORNSHUCKERS
	
		// TOO ARGH
		
		public CheckingAccount (String accountHolderName, String accountNumber) {
			super (accountHolderName, accountNumber);
		}
		
		// TREE ARGH
		
		public CheckingAccount (String accountHolderName, String accountNumber, int balance) {
			super (accountHolderName, accountNumber, balance);
		}

	
	
	
	public int withdraw(int amountToWithdraw) {
		if (amountToWithdraw >= getBalance() + 100) {
			super.withdraw(0);
			return getBalance();
		} else {
		if ((getBalance() - amountToWithdraw) < 0 && (getBalance() - amountToWithdraw) > -100 ) {
			super.withdraw(amountToWithdraw + 10);
			return getBalance();
		} else {
			super.withdraw(amountToWithdraw);
			return getBalance();
		}

		}
	}
}
