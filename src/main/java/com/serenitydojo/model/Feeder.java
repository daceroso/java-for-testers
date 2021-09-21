package com.serenitydojo.model;

public class Feeder {


    public String feeds(String animal) {

        if (animal.equals("Cat")) {
            return "Tuna";
        } else {
            return "Cabbage";
        }
    }
}
