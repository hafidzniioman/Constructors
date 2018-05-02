package com.hafidzniioman;

public class Account {
    //        create fields for the account number, balance, customer name, email, and phone number
    // create getters and setters for each field
    // create two additional methods
    // 1. to allow the customer to deposit funds (this should increment the balance field).
    // 2. to allow the customer to withdraw funds. this should deduct from the balance fields,
    // but not allow the withdrawal to complete if their are insufficient funds.
    // you will want to create various code in the main class (the one created by Intellij) to
    // confirm your code is working
    // add some output in the two methods above as well

    private String number;
    private double balance;
    private String customerName;
    private String customerEmail;
    private String customerPhoneNumber;

    public Account(String number, double balance, String customerName, String customerEmail, String customerPhoneNumber) {
        this.number = number;
        this.balance = balance;
        this.customerName = customerName;
        this.customerEmail = customerEmail;
        this.customerPhoneNumber = customerPhoneNumber;
    }

    public void deposit(double depositAmount) {
        this.balance += depositAmount;
        System.out.println("Deposit " + depositAmount + " made. New balance is " + this.balance);
    }

    public void withdrawal(double withdrawalAmount) {
        if (this.balance - withdrawalAmount < 0) {
            System.out.println("Only " + this.balance + " withdrawal not processed");
        } else {
            this.balance -= withdrawalAmount;
            System.out.println("Withdrawal of " + withdrawalAmount + " processed. Remaining balance is " + this.balance);
        }
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
        System.out.println("First Balance is " + this.balance);
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public String getCustomerPhoneNumber() {
        return customerPhoneNumber;
    }

    public void setCustomerPhoneNumber(String customerPhoneNumber) {
        this.customerPhoneNumber = customerPhoneNumber;
    }
}
