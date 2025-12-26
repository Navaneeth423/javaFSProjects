package com.bankapp.service;

public abstract class Account {
	double balance;

	public Account(double balance) {
		this.balance = balance;
	}
	
	public abstract void withdraw(double amount);
	public abstract void deposit(double amount);
	
	public double getBalance() {
		return this.balance;
	}
}
