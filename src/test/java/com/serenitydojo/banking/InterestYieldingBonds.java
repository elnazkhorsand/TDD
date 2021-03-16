package com.serenitydojo.banking;

public class InterestYieldingBonds implements IinterestBearing {

    private int value;
    private double interest;

    public InterestYieldingBonds(int value, double interest) {
        this.value = value;
        this.interest = interest;
    }

    public double getInterest() {
        return interest;
    }

    public int getValue() {
        return value;
    }

    @Override
    public double calculateMonthlyInterest(){
        return value*interest/12;
    }
}
