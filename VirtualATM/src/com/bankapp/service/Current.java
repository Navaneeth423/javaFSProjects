package com.bankapp.service;

public class Current extends Account{
	public final int OVERDRAFT_LIMIT = 50000;
	public final int TRANSACTION_FEE = 100;
	
	public Current(double balance) {
		super(balance);
	}

	@Override
	public void withdraw(double amount) {
		if (amount < 0) {
			System.out.println("Invalid amount entered!");
		} else if (balance + OVERDRAFT_LIMIT < amount) {
			System.out.println("Withdrawal denied! Overdraft limit of ₹" + OVERDRAFT_LIMIT + " exceeded.");
		} else {
			balance -= amount;
			System.out.println("Balance of Current Account: " + balance);
		}
	}

	@Override
	public void deposit(double amount) {
		if (amount <=0) {
			System.out.println("Deposit amount must be positive!");
		} else {
			double netDeposit = amount - TRANSACTION_FEE;
			balance += netDeposit;
			System.out.println("Deposited " + amount + " (Transaction Fee: " + TRANSACTION_FEE + "). Net Balance: " + balance);
		}
	}
	
	public void transactionsAllowed() {
		System.out.println("Only 20 transactions per day");
	}
}
