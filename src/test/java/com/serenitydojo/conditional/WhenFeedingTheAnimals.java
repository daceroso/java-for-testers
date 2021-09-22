package com.serenitydojo.conditional;

import com.serenitydojo.model.Feeder;
import com.serenitydojo.model.FoodType;
import org.junit.Assert;
import org.junit.Test;

import static com.serenitydojo.model.AnimalType.*;
import static com.serenitydojo.model.FoodType.*;

public class WhenFeedingTheAnimals {

    @Test
    public void shouldFeedCatsTuna() {
        Feeder feeder = new Feeder();

        FoodType food  = feeder.feeds(CAT, false);
        Assert.assertEquals(TUNA, food );
    }



    @Test
    public void shouldFeedHampsterCabbage() {
        Feeder feeder = new Feeder();
        FoodType food  = feeder.feeds(HAMPSTER, false);
        Assert.assertEquals(CABBAGE, food );

    }

    @Test
    public void shouldFeedDogsDogFood() {
        Feeder feeder = new Feeder();
        FoodType food  = feeder.feeds(DOG, false);
        Assert.assertEquals(DOG_FOOD, food );

    }

    @Test
    public void shouldFeedPremiumCatsPremiumFood() {
        Feeder feeder = new Feeder();
        FoodType food = feeder.feeds(CAT, true);

        Assert.assertEquals(SALMON, food);
    }

    @Test
    public void shouldFeedPremiumDogsDeluxeDogFood() {
        Feeder feeder = new Feeder();
        FoodType food = feeder.feeds(DOG, true);

        Assert.assertEquals(DELUXE_FOOD_DOG, food);
    }

    @Test
    public void shouldFeedPremiumHampsterLettuce() {
        Feeder feeder = new Feeder();
        FoodType food = feeder.feeds(HAMPSTER, true);

        Assert.assertEquals(LETTUCE, food);
    }



}
