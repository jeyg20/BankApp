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

	public String getUserInfo() {
		return String.format(
					"Account number: %s\n" +
					"First name: %s\n" +
					"Middle name: %s\n" +
					"Last name: %s\n" +
					"Birthday: %s\n",accountNumber, firstName, middleName, lastName, birthDate) ;
	}
}
