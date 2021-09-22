package com.serenitydojo.model;

public class Feeder {


    public String feeds(AnimalType animal, boolean isPremium) {

        switch (animal) {
            case CAT:
                return isPremium ? "Salmon" : "Tuna";
            case DOG:
                return isPremium ? "Deluxe food" : "Dog food";
            case HAMPSTER:
                return isPremium ? "Lettuce" : "Cabbage";
            default:
               return "Don't know this animal - Don't know the food";
        }



        /*if (animal.equals("Cat")) {
            return isPremium ? "Salmon" : "Tuna";
        } else if (animal.equals("Dog")) {
            return isPremium ? "Deluxe food" : "Dog food";
        }
        return isPremium ? "Lettuce" : "Cabbage";*/

    }
}
