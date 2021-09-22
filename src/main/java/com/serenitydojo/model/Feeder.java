package com.serenitydojo.model;

import static com.serenitydojo.model.FoodType.*;

public class Feeder {


    public FoodType feeds(AnimalType animal, boolean isPremium) {

        switch (animal) {
            case CAT:
                return isPremium ? SALMON : FoodType.TUNA;
            case DOG:
                return isPremium ? DELUXE_FOOD_DOG : DOG_FOOD;
            case HAMPSTER:
                return isPremium ? LETTUCE : CABBAGE;
            default:
               return UNKNOWN;
        }

    }
}
