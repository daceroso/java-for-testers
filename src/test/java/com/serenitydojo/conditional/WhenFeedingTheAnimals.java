package com.serenitydojo.conditional;

import com.serenitydojo.model.Feeder;
import org.junit.Assert;
import org.junit.Test;

public class WhenFeedingTheAnimals {

    @Test
    public void shouldFeedCatsTuna() {
        Feeder feeder = new Feeder();

        String food  = feeder.feeds("Cat", false);
        Assert.assertEquals("Tuna", food );
    }



    @Test
    public void shouldFeedHampsterCabbage() {
        Feeder feeder = new Feeder();
        String food  = feeder.feeds("Hampster", false);
        Assert.assertEquals("Cabbage", food );

    }

    @Test
    public void shouldFeedDogsDogFood() {
        Feeder feeder = new Feeder();
        String food  = feeder.feeds("Dog", false);
        Assert.assertEquals("Dog food", food );

    }

    @Test
    public void shouldFeedPremiumCatsPremiumFood() {
        Feeder feeder = new Feeder();
        String food = feeder.feeds("Cat", true);

        Assert.assertEquals("Salmon", food);
    }

    @Test
    public void shouldFeedPremiumDogsDeluxeDogFood() {
        Feeder feeder = new Feeder();
        String food = feeder.feeds("Dog", true);

        Assert.assertEquals("Deluxe food", food);
    }

    @Test
    public void shouldFeedPremiumHampsterLettuce() {
        Feeder feeder = new Feeder();
        String food = feeder.feeds("Hampster", true);

        Assert.assertEquals("Lettuce", food);
    }



}
