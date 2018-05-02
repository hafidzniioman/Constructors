package com.hafidzniioman;

public class Main {

    public static void main(String[] args) {
        // write your code here
//        Create a new class for a bank account
//        create fields for the account number, balance, customer name, email, and phone number
        // create getters and setters for each field
        // create two additional methods
        // 1. to allow the customer to deposit funds (this should increment the balance field).
        // 2. to allow the customer to withdraw funds. this should deduct from the balance fields,
        // but not allow the withdrawal to complete if their are insufficient funds.
        // you will want to create various code in the main class (the one created by Intellij) to
        // confirm your code is working
        // add some output in the two methods above as well

        Account bobAccount = new Account("123", 0, "Bob", "bob@email.com",
                "08723635");

        System.out.println("Account Number " + bobAccount.getNumber());
        System.out.println("Balance is " + bobAccount.getBalance());
        System.out.println("Customer Name " + bobAccount.getCustomerName());
        System.out.println(bobAccount.getCustomerEmail());
        System.out.println(bobAccount.getCustomerPhoneNumber());

        bobAccount.deposit(1500);
        bobAccount.withdrawal(350);

        VipCustomer vipCust1 = new VipCustomer();
        System.out.println(vipCust1.getName());
        System.out.println(vipCust1.getCreditLimit());
        System.out.println(vipCust1.getEmailAddress());

        VipCustomer vipCust2 = new VipCustomer("Bob", 25000);
        System.out.println(vipCust2.getName());
        System.out.println(vipCust2.getCreditLimit());
        System.out.println(vipCust2.getEmailAddress());

        VipCustomer vipCust3 = new VipCustomer("Tim", 10000, "tim@email");
        System.out.println(vipCust3.getName());
        System.out.println(vipCust3.getCreditLimit());
        System.out.println(vipCust3.getEmailAddress());
    }
}
