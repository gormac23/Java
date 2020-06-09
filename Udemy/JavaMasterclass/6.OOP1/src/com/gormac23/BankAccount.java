package com.gormac23;

public class BankAccount {

    private int accountNumber;
    private int balance;
    private String customerName;
    private String customerEmail;
    private int customerPhoneNo;

    // This is a constructor. It has to have the same name as the class itself and it is used when creating an
    // instance of the class for the first time. Refer to Classes.java for usage
    public BankAccount(int accountNumber, int balance, String customerName, String customerEmail, int customerPhoneNo) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.customerName = customerName;
        this.customerEmail = customerEmail;
        this.customerPhoneNo = customerPhoneNo;
    }
    // It is not unusual to have multiple constructors having different parameters
    public BankAccount() {
        this(12345, 500, "Default Name", "email@email.com", 8888);
        System.out.println("Empty constructor called. Used default values");
    }

    public int depositFunds(int amount) {
        if(amount < 0) {
            System.out.print("Invalid amount deposited. ");
        } else {
            System.out.println("Depositing €" + amount + " into your account...");
            this.balance += amount;
        }

        System.out.println("Current balance = €" + this.balance);
        return this.balance;
    }

    public int withdrawFunds(int amount) {
        if (amount < 1 ) {
            System.out.print("Invalid withdrawal amount. ");
        } else if (this.balance - amount < 0) {
            System.out.println("Not enough funds to withdraw €" + amount);
        } else {
            System.out.println("Withdrawing €" + amount + " from your account...");
            this.balance -= amount;
        }

        System.out.println("Current balance = €" + this.balance);
        return this.balance;
    }


    public int getAccountNumber() {
        return accountNumber;
    }

    public int getBalance() {
        return balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public int getCustomerPhoneNo() {
        return customerPhoneNo;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public void setCustomerPhoneNo(int customerPhoneNo) {
        this.customerPhoneNo = customerPhoneNo;
    }
}
