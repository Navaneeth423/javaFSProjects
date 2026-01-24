# VoterApp
A Voter app application to find the eligibility of a voter using Exceptional Handling

This Project is a Java-based application that demonstrates Exceptional Handling concepts such as Custom Exceptions.
It allows users to find out if they are eligible to vote based on their age, locality, and voter ID.

## Features
 - Add Voter details.
 - Displays if Eligible or not.
 - If not, shows an error message of non-eligibility based on age, locality, or voter ID.
 - Clean object-oriented design.

## Technologies Used
 - Java
 - Eclipse IDE

## Project Structure
```bash
com.productapp
├── client
│ └── Voter.java (main class)
├── service
│ └── ElectionBoothServiceImpl.java
│ └── IElectionBoothService.java
├── exception
│ └── InvalidVoterIDException.java
│ └── LocalityNotFoundException.java
│ └── NotEligibileException.java
│ └── UnderAgeException.java
```
