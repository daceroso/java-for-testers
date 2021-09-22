package com.serenitydojo.model;

public class Feeder {


    public String feeds(String animal, boolean isPremium) {

        switch (animal) {
            case "Cat":
                return isPremium ? "Salmon" : "Tuna";
            case "Dog":
                return isPremium ? "Deluxe food" : "Dog food";
            case "Hampster":
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
