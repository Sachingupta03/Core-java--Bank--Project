package com.Bank;

public class BankAccount {
    public static class BannkAccunt {
        private String accountNumber;
        private String accountHolderName;
        private double balance;

        public void BankAccount (String accountNumber, String accountHolderName, double balance) {
            this.accountNumber = accountNumber;
            this.accountHolderName = accountHolderName;
            this.balance = balance;
        }

        //Getter and Setter

        public String getAccountNumber () {
            return accountNumber;
        }

        public void setAccountNumber (String accountNumber) {
            this.accountNumber = accountNumber;
        }

        public String getAccountHolderName () {
            return accountHolderName;
        }

        public void setAccountHolderName (String accountHolderName) {
            this.accountHolderName = accountHolderName;
        }

        public double getBalance () {
            return balance;
        }

        public void setBalance (double balance) {
            this.balance = balance;
        }

        // Methods
        public void deposit (double amount) {
            if (amount > 0) {
                balance += amount;
                System.out.println("Deposit:" + amount);
            } else {
                System.out.println("Invalid deposit amount.");
            }
        }

        public void withdraw (double amount) {
            if (amount > 0 && amount <= balance) {
                balance -= amount;
                System.out.println("Withdrawn: " + amount);
            } else {
                System.out.println("Invalid withdrawal amount or insufficient balance.");
            }
        }

        public void displayAccountInfo () {
            System.out.println("Account Number:" + accountNumber);
            System.out.println("Account Holder Name:" + accountHolderName);
            System.out.println("Balance:" + balance);
        }
    }

    public void Withdraw (double withdrawAmount) {
    }

    public void displayAccountInfo () {

    }

    public void main () {
    }
}

