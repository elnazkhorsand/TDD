package com.serenitydojo.banking;

import org.junit.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class WhenCalculatingMonthlyInterest {

    @Test
    public void shouldCalculateInterestForSavingsAccounts(){
        //Given
        SavingAccount mySavingAccount = new SavingAccount(1200, 0.01);

        //When
        double interest = mySavingAccount.calculateMonthlyInterest();

        //Then
        assertThat(interest).isEqualTo(1.0);
    }

    @Test
    public void shouldCalculateInterestForBonds(){

        //Given
        InterestYieldingBonds myInterestYieldingBonds = new InterestYieldingBonds(1200, 0.01);

        //When
        double interest = myInterestYieldingBonds.calculateMonthlyInterest();

        //Then
        assertThat(interest).isEqualTo(1.0);
    }

    @Test
    public void calculateInterestEarnedInPortfolio(){

        //Given
        Portfolio myPortfolio = new Portfolio();
        myPortfolio.add(new SavingAccount(1200, 0.01));
        myPortfolio.add(new InterestYieldingBonds(1200, 0.01));

        //When
        double totalEarnedInterest = myPortfolio.calculateMonthlyInterest();

        //Then
        assertThat(totalEarnedInterest).isEqualTo(2);
    }

}
