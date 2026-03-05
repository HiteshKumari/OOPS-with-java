package com.bank.account;

public class Account {

    public double accountNumber;
    public double balance;

    public int deposit(double amount){
        balance += amount;
        return 1;
    }

    public int withdraw(double amount){
        if(amount > balance){
            return -1;
        }
        else{
            balance -= amount;
            return 1;
        }
    }
}
