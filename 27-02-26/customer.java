package com.bank.customer;

public class Customer {

    public int customerId;
    public String name;

    public void displayCustomerInfo(){
        System.out.println("Customer ID: " + customerId);
        System.out.println("Name: " + name);
    }
}