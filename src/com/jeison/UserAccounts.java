package com.jeison;

public class UserAccounts {
	private double accountBalance;

	/**
	 * Description: method to get balance of the account
	 * @return current accountBalance
	 */
	public double getAccountBalance() { return accountBalance; }

	/**
	 * Description: deposit method to deposit money in the account
	 * @param deposit Accept any amount to be deposit
	 */
	public void deposit(double deposit) { accountBalance += deposit; }

	/**
	 * Description: deposit withdraw to withdraw money from the account
	 * @param withdraw Accept any amount to be withdraw
	 */
	public void withdraw(double withdraw) { accountBalance -= withdraw; }
}
