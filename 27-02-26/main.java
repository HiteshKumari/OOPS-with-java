package com.bank;

import com.bank.account.Account;
import com.bank.customer.Customer;
import com.bank.loan.Loan;
import com.bank.util.Util;

public class Main {

    public static void main(String[] args) {

        Customer c1 = new Customer();
        c1.customerId = 123;
        c1.name = "Hitesh";
        c1.displayCustomerInfo();

        Account a1 = new Account();
        a1.accountNumber = 456;
        a1.balance = 1000;

        a1.deposit(500);
        a1.withdraw(200);

        System.out.println("Final balance: " + a1.balance);

        Loan l1 = new Loan();
        l1.loanAmount = 10000;

        int emi = l1.calculateEMI(5, 10);

        System.out.println("EMI: " + emi);

        System.out.println("Generated Customer ID: " + Util.generateCustomerId());
        System.out.println("Generated Account Number: " + Util.generateAccountNumber());
    }
}