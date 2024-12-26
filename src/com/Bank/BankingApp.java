package com.Bank;


import java.util.Scanner;

public class BankingApp {
    public static void main (String[] args) {
        BankAccount bankAccount = new BankAccount ();
        Scanner scanner = new Scanner (System.in);
        while (true) {
            System.out.println ("=== Banking System Menu === ");
            System.out.println ("1.Create Account");
            System.out.println ("2.Deposit");
            System.out.println ("3.withdraw");
            System.out.println ("4.Display Account Info");
            System.out.println ("5.Delete Account");
            System.out.println ("Exit");
            System.out.println ("Enter your choice: ");
            int choice = scanner.nextInt ();

            switch (choice) {
                case 1:
                    System.out.print ("Enter account number: ");
                    String accountNumber = scanner.next ();
                    System.out.print ("Enter account holder name: ");
                    String accountHolderName = scanner.next ();
                    System.out.print ("Enter initial balance: ");
                    double initialBalance = scanner.nextDouble ();
                    BankSerevice.createAccount (accountNumber, accountHolderName, initialBalance);
                    break;

                case 2:
                    System.out.print ("Enter account number: ");
                    accountNumber = scanner.next ();
                    BankAccount account = (BankAccount) BankSerevice.getAccount (accountNumber);
                    if (account != null) {
                        System.out.print ("Enter amount to deposit: ");
                        double depositAmount = scanner.nextDouble ();
                        depositAmount = (depositAmount);
                    } else {
                        System.out.println ("Account not found.");
                    }
                    break;
                case 3:
                    System.out.print ("Enter account number: ");
                    accountNumber = scanner.next ();
                    BankSerevice bankingService = null;
                    account = bankingService.getAccount (accountNumber);
                    if (account != null) {
                        System.out.print ("Enter amount to withdraw: ");
                        double withdrawAmount = scanner.nextDouble ();
                        account.Withdraw (withdrawAmount);
                    } else {
                        System.out.println ("Account not found.");
                    }
                    break;

                case 4:
                    System.out.print ("Enter account number: ");
                    accountNumber = scanner.next ();
                    account = BankSerevice.getAccount (accountNumber);
                    if (account != null) {
                        account.displayAccountInfo ();
                    } else {
                        System.out.println ("Account not found.");
                    }
                    break;

                case 5:
                    System.out.print ("Enter account number to delete: ");
                    accountNumber = scanner.next ();
                    BankSerevice.deleteAccount (accountNumber);
                    break;

                case 6:
                    System.out.println ("Exiting Banking System. Goodbye!");
                    scanner.close ();
                    System.exit (0);

                default:
                    System.out.println ("Invalid choice. Please try again.");
            }
        }
    }
}