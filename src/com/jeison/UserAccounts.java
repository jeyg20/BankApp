package com.jeison;

public class UserAccounts {
	private double accountBalance;

	public double getAccountBalance() {
		return accountBalance;
	}

	/**
	 * @param deposit Accept any amount to be deposit
	 */
	public void deposit(double deposit) {
		accountBalance += deposit;
	}

	/**
	 * @param withdraw Accept any amount to be withdraw
	 */
	public void withdraw(double withdraw) {
		accountBalance -= withdraw;
	}



}
