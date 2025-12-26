package com.bankapp.service;

public class Savings extends Account{
	public final int MIN_BALANCE = 2000;

	public Savings(double balance) {
		super(balance);
	}

	@Override
	public void withdraw(double amount) {
		if (amount < 0) {
			System.out.println("Invalid withdrawal amount!");
		} else if (balance - amount < MIN_BALANCE) {
			System.out.println("Withdrawal denied! Minimum balance of " + MIN_BALANCE + " must be maintained.");
		} else {
			balance -= amount;
			System.out.println("Balance in Savings Account: " + balance);
		}
	}

	@Override
	public void deposit(double amount) {
		if (amount < 0) {
			System.out.println("Invalid amount!");
		} else {
			balance += amount;
			System.out.println("Balance in Savings Account: " + balance);
		}
	}
	
	public void showDepositSchemes() {
		System.out.println("Fixed Deposit / Term Deposit");
		System.out.println("Recurring Deposit");
		System.out.println("Flexi Deposit");
	}
}
