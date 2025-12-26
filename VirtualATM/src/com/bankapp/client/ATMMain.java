package com.bankapp.client;

import com.bankapp.service.*;
import java.util.*;

public class ATMMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Account account = null;
		System.out.println("Select Account Type");
		System.out.println("1. Savings Account");
		System.out.println("2. Current Account");
		System.out.println("3. Exit");
		int accountChoice = sc.nextInt();
		System.out.println("------------------------------------------------");

		switch (accountChoice) {
		case 1:
			account = new Savings(10000.0);
			break;
		case 2:
			account = new Current(15000.0);
			break;
		case 3:
			System.out.println("Thank you for visting the ATM!!");
			System.exit(0);
		default:
			System.out.println("Invalid choice!");
			break;
		}

		while (true) {
			System.out.println("Enter Account action to be performed: ");
			System.out.println("1. Withdraw");
			System.out.println("2. Deposit");
			System.out.println("3. Check Balance");
			System.out.println("4. Exit");
			int usersChoice = sc.nextInt();
			System.out.println("------------------------------------------------");
			double amount;
			switch (usersChoice) {
			case 1:
				System.out.println("Enter amount to withdraw: ");
				amount = sc.nextDouble();
				account.withdraw(amount);
				break;
			case 2:
				if (accountChoice == 1) {
					((Savings) account).showDepositSchemes();
				} else if (accountChoice == 2) {
					((Current) account).transactionsAllowed();
				}
				System.out.println("Enter amount to deposit: ");
				amount = sc.nextDouble();
				account.deposit(amount);
				break;
			case 3:
				System.out.println("Account Balance: " + account.getBalance());
				break;
			default:
				System.out.println("Invalid option!");
				break;
			}
			sc.nextLine();
			System.out.println("Do you want to continue transactions? YES or NO");
			String continueTransaction = sc.nextLine();

			if (continueTransaction.equalsIgnoreCase("no")) {
				System.out.println("Thank you for visting the ATM!!");
				return;
			}
		}
	}
}
