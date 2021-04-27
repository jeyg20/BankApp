package com.jeison;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    private static boolean exit = false;
    public static byte consoleInputStream;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BankUsers[] user = new BankUsers[10];
        user[0] = new BankUsers(); // Default user
        UserAccounts[] accountActions = new UserAccounts[10];
        accountActions[0] = new UserAccounts();



        do {
            System.out.println(
                    "Welcome to Jeison Bank\n\n" +
                            "!To navigate in our app type the corresponding number of the menu you want to access!\n\n" +
                            "1. Log in\n" +
                            "2. Create and account\n" +
                            "3. Exit");
            consoleInputStream = scanner.nextByte();

            switch (consoleInputStream) {
                case 1: // Log in
                    Login(user, accountActions);
                    break;
                case 2: // Register
                    break;
                case 3: // Exit
                    exit = true;
                    break;
                default:
                    System.out.println("Selected menu does not exit or wrong input type");
                    break;
            }

        } while (!exit);

    }
    /**
     *
     * @param user Array of user for registered accounts
     * @param userAccounts Array of userAccount to store register account info
     */
    public static void Login(BankUsers[] user, UserAccounts[] userAccounts) {
        Scanner scanner = new Scanner(System.in);
        byte accountNumber;

        System.out.print("Account number: ");
        accountNumber = scanner.nextByte();
        System.out.printf("Welcome %s", user[0].getFirstName()+ user[0].getLastName());

        do {
            System.out.println(
                        "1. Deposit\n" +
                        "2. Withdraw\n" +
                        "3. Account balance\n" +
                        "4. Log out");

            switch (scanner.nextByte()) {
                case 1: // Deposit
                    System.out.print("Type the amount you want to deposit: ");
                    userAccounts[accountNumber].deposit(scanner.nextByte());
                    break;
                case 2: // Withdraw
                    System.out.print("Type the amount you want to withdraw");
                    userAccounts[accountNumber].withdraw(scanner.nextByte());
                    break;
                case 3: // Balance
                    System.out.printf("Balance: %s", userAccounts[accountNumber].getAccountBalance());
                    break;
                case 4: //log out
                    exit = true;
                    break;
                default:
                    System.out.println("Selected menu does not exit");
                    break;

            }
        } while (!exit);

    }



}
