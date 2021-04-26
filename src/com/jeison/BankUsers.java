package com.jeison;

import java.util.Date;

public class BankUsers {
	private String firstName;
	private String middleName;
	private String lastName;
	private byte age;
	private Date birthDate = new Date();

	public BankUsers() {
		firstName = "example first name";
		middleName = "example middle name";
		lastName = "example last name";
		age = 0;
	}
	/**
	 * @param firstName
	 * @param middleName
	 * @param lastName
	 * @param age
	 * @param birthDate
	 */
	public BankUsers(String firstName, String middleName, String lastName, byte age, Date birthDate) {
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
		this.age = age;
		this.birthDate = birthDate;
	}

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

	public byte getAge() {
		return age;
	}

	public void setAge(byte age) {
		this.age = age;
	}

	public Date getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}

	public String getUserInfo() {
		return String.format(
				"First name: %s" +
				"Last name: %s", firstName, lastName) ;
	}
}
