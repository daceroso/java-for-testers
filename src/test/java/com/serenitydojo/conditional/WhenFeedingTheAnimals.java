package com.serenitydojo.conditional;

import com.serenitydojo.model.Feeder;
import com.serenitydojo.model.FoodType;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

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

    @Test
    public void listOfColors() {

        String[] color = {"red", "green", "blue"};
        int[] ages = {1,2,3};

        String[] moreColors = new String[3];

        moreColors[0] = "yellow";
        moreColors[1] = "purple";
        moreColors[2] = "pink";

        for (int i = 0; i < moreColors.length; i++) {
            System.out.println(moreColors[i]);
        }

        
        System.out.println();

        List<String> myColors = new ArrayList<>();

        myColors.add("red");
        myColors.add("blue");
        myColors.add("purple");
        myColors.add("red");

        myColors.get(0);

        for (String someColor: myColors) {
            System.out.println("Color: " + someColor);
        }


        Set<String> myColor = new HashSet<>();

        myColor.add("red");
        myColor.add("blue");
        myColor.add("purple");
        myColor.add("red");

        for (String someColor: myColor) {
            System.out.println("Color: " + someColor);
        }


    }



}
