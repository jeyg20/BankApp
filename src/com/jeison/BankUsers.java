package com.jeison;

public class BankUsers {
	private int accountNumber = 0;
	private String firstName;
	private String middleName;
	private String lastName;
	private String birthDate;

	public BankUsers() {
		firstName = "example first name";
		middleName = "example middle name";
		lastName = "example last name";
	}
	/*
		Todo: perform capitalization to names
	 	'.substring(0, 1).toUpperCase() + firstName.substring(1)'
	 */
	public BankUsers(int accountNumber, String firstName, String middleName, String lastName, String birthDate) {
		this.accountNumber = accountNumber;
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
		this.birthDate =  birthDate;
	}

	public int getAccountNumber() { return accountNumber;}

	public void setAccountNumber(int accountNumber) {this.accountNumber = accountNumber;}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getMiddleName() {
		return middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(String birthDate) { this.birthDate = birthDate; }

	// Display user information
	public String getUserInfo() {
		return String.format(
					"Account number: %s\n" +
					"First name: %s\n" +
					"Middle name: %s\n" +
					"Last name: %s\n" +
					"Birthday: %s\n",accountNumber, firstName, middleName, lastName, birthDate) ;
	}

	// Menu to perform account changes
	public String changeUserInfo() {
		return String.format(
						"1. First name: %s\n" +
						"2. Middle name: %s\n" +
						"3. Last name: %s\n" +
						"4. Birthday: %s\n" +
						"5. Confirm information", firstName, middleName, lastName, birthDate) ;
	}
}
