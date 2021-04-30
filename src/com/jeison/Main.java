package com.jeison;

import java.awt.event.InputEvent;
import java.util.Scanner;

public class Main {
    private static boolean exit = false;
    public static byte consoleInputStream;
    public static Scanner scanner = new Scanner(System.in);


    public static void main(String[] args) {
        BankUsers[] user = new BankUsers[10];
        user[0] = new BankUsers(); // Default user.
        UserAccounts[] account = new UserAccounts[10];
        account[0] = new UserAccounts();
        byte accountNumber = 1;

        System.out.println(
                "Welcome to J.S.A Bank\n\n" +
                "!To navigate in our app type the corresponding number of the menu you want to access!\n");
        // Bank main menu.
        do {
            System.out.println(
                        "1. Log in\n" +
                        "2. Create and account\n" +
                        "3. Exit");
            consoleInputStream = scanner.nextByte();

            switch (consoleInputStream) {
                case 1: // Log in.
                    Login(user, account);
                    exit = false;
                    break;
                case 2: // Register.
                    Register(user, account, accountNumber++);
                    exit = false;
                    break;
                case 3: // Exit.
                    exit = true;
                    break;
                default:
                    System.out.println("Selected menu does not exit or wrong input type");
                    break;
            }

        } while (!exit);

    }
    /**
     * Description: class Login to access account of registered users.
     * @param user Array user type BankUser access registered users.
     * @param account Array userAccount type UserAccount to access users account.
     */
    public static void Login(BankUsers[] user, UserAccounts[] account) {
        byte accountNumber;

        System.out.print("Account number: ");
        accountNumber = scanner.nextByte();
        System.out.printf("Welcome %s %s \n", user[accountNumber].getFirstName(), user[accountNumber].getLastName());

        // Account menu.
        do {
            System.out.println(
                        "\n1. Deposit\n" +
                        "2. Withdraw\n" +
                        "3. Account balance\n" +
                        "4. Information\n" +
                        "5. Log out \n");

            switch (scanner.nextByte()) {
                case 1: // Deposit.
                    System.out.print("Type the amount you want to deposit: ");
                    account[accountNumber].deposit(scanner.nextDouble());
                    break;
                case 2: // Withdraw.
                    System.out.print("Type the amount you want to withdraw: ");
                    account[accountNumber].withdraw(scanner.nextDouble());
                    break;
                case 3: // Balance.
                    System.out.printf("Balance: %s", account[accountNumber].getAccountBalance());
                    break;
                case 4: // User information.
                    System.out.println(user[accountNumber].getUserInfo());
                    System.out.println("[1] To change information [2] Continue");

                    byte c = scanner.nextByte();

                    if (c == 1) {
                        ChangeInfo(user, accountNumber);
                        exit = false;
                    } else if (c == 2) {
                        continue;
                    } else {
                        System.out.println("option selected does not exist");
                    }
                    break;
                case 5: // log out.
                    exit = true;
                    break;
                default:
                    System.out.println("Selected menu does not exit");
                    break;
            }
        } while (!exit);
    }

    /**
     * Description: class Register to create new account.
     * @param user Array user type BankUser to create new user.
     * @param account Array account type UserAccount to create new account.
     */
    public static void Register(BankUsers[] user, UserAccounts[] account, byte accountNumber) {
       // accountNumber increments to create new instance in the next array index.
        System.out.println(accountNumber);
        String firstName;
        String middleName;
        String lastName;
        String birthDate;
        
        // getting user info to register into the bank.
        System.out.println("Welcome to register fill the following data");
        System.out.printf("Your account number is: %d\n", accountNumber );
        System.out.print("First name: ");
        firstName = scanner.next();
        System.out.print("Middle name: ");
        middleName = scanner.next();
        System.out.print("Last name: ");
        lastName = scanner.next();
        System.out.print("Birthday DD/MM/YYYY: ");
        birthDate = scanner.next();

        // new instances of userAccount and user in the arrays.
        account[accountNumber] = new UserAccounts();
        user[accountNumber] = new BankUsers(accountNumber, firstName, middleName, lastName, birthDate);
        
        System.out.print("Is all the information above correct: [Y] Yes , [N] No ");
        do {
            char c = scanner.next().charAt(0);
            if (Character.toLowerCase(c) == 'n') {
                ChangeInfo(user, accountNumber);
            } else if (Character.toLowerCase(c) == 'y') {
                // condition to accept correct information.
                exit = true;
            }
            else {
                throw new IllegalStateException("Unexpected value: " + c);
            }
        } while (!exit);

    }

    /**
     * Description: Class ChangeInfo to perform changes to the account information.
     * @param user Array user type UserAccount to perform changes in its information.
     * @param accountNumber byte number of the account to perform changes.
     */
    public static void ChangeInfo(BankUsers[] user, byte accountNumber) {
        // Change user information menu.
        do {
            System.out.println("\nWhat do you want to change\n");
            System.out.println(user[accountNumber].changeUserInfo());

            switch(scanner.nextByte()) {
                case 1:
                    System.out.println(user[accountNumber].getFirstName());
                    System.out.print("New first name: ");
                    user[accountNumber].setFirstName(scanner.next());
                    break;
                case 2:
                    System.out.println(user[accountNumber].getMiddleName());
                    System.out.print("New middle name: ");
                    user[accountNumber].setMiddleName(scanner.next());
                    break;
                case 3:
                    System.out.println(user[accountNumber].getLastName());
                    System.out.print("New last name: ");
                    user[accountNumber].setLastName(scanner.next());
                    break;
                case 4:
                    System.out.println(user[accountNumber].getBirthDate());
                    System.out.print("New Birthday: ");
                    user[accountNumber].setBirthDate(scanner.next());
                    break;
                case 5:
                    exit = true;
                    break;
                default:
                    System.out.println("Option does not exist");
            }
        } while(!exit);
    }

}
