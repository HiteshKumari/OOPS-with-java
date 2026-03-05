package com.bank.account;

public class SavingsAccount extends Account{

    public double interestRate;

    public double calculateInterest(){
        return balance * interestRate;
    }
}