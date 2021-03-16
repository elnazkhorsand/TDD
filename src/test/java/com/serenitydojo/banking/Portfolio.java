package com.serenitydojo.banking;

import java.util.ArrayList;
import java.util.List;

public class Portfolio {

    private List<IinterestBearing> interestBearings = new ArrayList<>();

    public void add(IinterestBearing interestBearing){
        interestBearings.add(interestBearing);
    }

    public double calculateMonthlyInterest(){

        double sum = 0.0;

        for (IinterestBearing interestBearing: interestBearings){
            sum =  sum + interestBearing.calculateMonthlyInterest();
        }

        return sum;
    }

}
