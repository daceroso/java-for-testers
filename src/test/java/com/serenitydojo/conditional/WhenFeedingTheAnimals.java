package com.serenitydojo.conditional;

import com.serenitydojo.model.AnimalType;
import com.serenitydojo.model.Feeder;
import org.junit.Assert;
import org.junit.Test;

import static com.serenitydojo.model.AnimalType.*;

public class WhenFeedingTheAnimals {

    @Test
    public void shouldFeedCatsTuna() {
        Feeder feeder = new Feeder();

        String food  = feeder.feeds(CAT, false);
        Assert.assertEquals("Tuna", food );
    }



    @Test
    public void shouldFeedHampsterCabbage() {
        Feeder feeder = new Feeder();
        String food  = feeder.feeds(HAMPSTER, false);
        Assert.assertEquals("Cabbage", food );

    }

    @Test
    public void shouldFeedDogsDogFood() {
        Feeder feeder = new Feeder();
        String food  = feeder.feeds(DOG, false);
        Assert.assertEquals("Dog food", food );

    }

    @Test
    public void shouldFeedPremiumCatsPremiumFood() {
        Feeder feeder = new Feeder();
        String food = feeder.feeds(CAT, true);

        Assert.assertEquals("Salmon", food);
    }

    @Test
    public void shouldFeedPremiumDogsDeluxeDogFood() {
        Feeder feeder = new Feeder();
        String food = feeder.feeds(DOG, true);

        Assert.assertEquals("Deluxe food", food);
    }

    @Test
    public void shouldFeedPremiumHampsterLettuce() {
        Feeder feeder = new Feeder();
        String food = feeder.feeds(HAMPSTER, true);

        Assert.assertEquals("Lettuce", food);
    }



}
