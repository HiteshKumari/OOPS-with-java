package com.bank.loan;

public class Loan {

    public double loanAmount;

    public int calculateEMI(int tenureInYears, double interestRate){

        double monthlyInterestRate = interestRate / 12 / 100;
        int totalMonths = tenureInYears * 12;

        double emi =
        (loanAmount * monthlyInterestRate *
        Math.pow(1 + monthlyInterestRate, totalMonths)) /
        (Math.pow(1 + monthlyInterestRate, totalMonths) - 1);

        return (int) emi;
    }
}