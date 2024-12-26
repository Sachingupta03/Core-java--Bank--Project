package com.Bank;

import java.util.HashMap;
import java.util.Map;

public class BankSerevice {
    private static Map<String,BankAccount> accounts = new HashMap<>();

    public static void createAccount (String accountNumber, String accountHolderName, double initialBalance) {
        if (accounts.containsKey(accountNumber)) {
            BankAccount account = new BankAccount();
            accounts.put(accountNumber, account);
            System.out.println("Account created successfully!");
        } else {
            System.out.println("Account with this number already exists.");
        }
    }

    public static BankAccount getAccount (String accountNumber) {
        return accounts.get(accountNumber);
    }

    public static void deleteAccount (String accountNumber) {
        if (accounts.remove(accountNumber) != null) {
            System.out.println("Account deleted successfully.");
        } else {
            System.out.println("Account not found.");
        }
    }
}

