package com.serenitydojo.banking;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class WhenCalculatingMonthyInterest {

    @Test
    public void shouldCalculateInterestForSavingAccount() {
        //GIVEN

        SavingAccount savingAccount = new SavingAccount(1200,0.01);
        savingAccount.setBalance(1200);
        savingAccount.setInterestRate(0.01);

        //WHEN
        double earnedInteres = savingAccount.calculateMonthlyInterest();


        //THEN

        assertThat(earnedInteres).isEqualTo(1.0);
    }

    @Test
    public void shouldCalculateInterestOfBonds()  {

        //GIVEN
        InterestYieldingBonds bonds = new InterestYieldingBonds(1200.0, 0.01);


        //WHEN

        double earnedInterest = bonds.calculateMonthlyInterest();

        //THEN

        assertThat(earnedInterest).isEqualTo(1.0);

    }


    @Test
    public void calculateInterestPortfolio() {
        //GIVEN

        Portfolio  portfolio = new Portfolio();
        portfolio.add(new SavingAccount(1200,0.01 ));
        portfolio.add(new InterestYieldingBonds(1200.0, 0.01));


        //WHEN

        double totalEarnedInterest = portfolio.calculateMonthlyInterest();

        //THEN

        assertThat(totalEarnedInterest).isEqualTo(2.0);
    }
}
