package com.voterapp.service;

import com.voterapp.exception.InvalidVoterIDException;
import com.voterapp.exception.LocalityNotFoundException;
import com.voterapp.exception.NotEligibleException;
import com.voterapp.exception.UnderAgeException;

public class ElectionBoothServiceImpl implements IElectionBoothService {

	@Override
	public boolean checkEligibility(int age, String locality, int vid) throws NotEligibleException {
		try {
			if (checkAge(age)) {
				if (checkLocality(locality)) {
					if (checkVoterId(vid)) {
						return true;
					}
				}
			}
		} catch (NotEligibleException e) {
			System.out.println("Eligibility Criteria Error: " + e.getMessage());
		}
		return false;
	}

	private boolean checkAge(int age) throws UnderAgeException {
		if (age < 18) {
			throw new UnderAgeException("You are under the age of 18");
		}
		return true;
	}

	private boolean checkLocality(String locality) throws LocalityNotFoundException {
		String[] localities = {"JP Nagar", "MG Road", "Whitefield"};
		for(String local : localities) {
			if(local.equalsIgnoreCase(locality)) {
				return true;
			}
		}
		throw new LocalityNotFoundException("You are not within this locality!");
	}

	private boolean checkVoterId(int voterId) throws InvalidVoterIDException {
		if (voterId < 1000 || voterId > 9999) {
			throw new InvalidVoterIDException("Invalid Voter ID");
		}
		return true;
	}
}
