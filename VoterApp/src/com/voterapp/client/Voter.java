package com.voterapp.client;

import java.util.Scanner;

import com.voterapp.service.ElectionBoothServiceImpl;

public class Voter {
	public static void main(String[] args) {
		ElectionBoothServiceImpl election = new ElectionBoothServiceImpl();

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your age:");
		int age = sc.nextInt();
		
		System.out.println("Enter your Voter ID: ");
		int voterId = sc.nextInt();
		
		sc.nextLine();
		System.out.println("Enter your Locality: ");
		String locality = sc.nextLine();
		
		
		try {
			if(election.checkEligibility(age, locality, voterId)) {
				System.out.println("You are Eligible to vote!!");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
