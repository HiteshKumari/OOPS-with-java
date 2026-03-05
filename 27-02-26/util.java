package com.bank.util;

public class Util {

    public static int generateCustomerId(){
        return (int)(Math.random() * 1000);
    }

    public static double generateAccountNumber(){
        return Math.random() * 1000000;
    }

    public static int minimumBalance(){
        return 500;
    }
}