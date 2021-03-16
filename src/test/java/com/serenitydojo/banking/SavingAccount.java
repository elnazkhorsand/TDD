package com.serenitydojo.banking;

public class SavingAccount extends BankAccount implements IinterestBearing{
    private double interest;

    public SavingAccount(int balance, double interest) {
        setBalance(balance);
        this.interest = interest;
    }

    public double getInterest() {
        return interest;
    }

    @Override
    public double calculateMonthlyInterest() {
        return getBalance()*interest/12;
    }
}
