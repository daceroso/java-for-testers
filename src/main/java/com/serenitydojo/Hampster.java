package com.serenitydojo;

public class Hampster extends Pet{
    private final String favouriteGame;

    public Hampster(String name, int age, String favouriteGame) {
        super(name, age);
        this.favouriteGame = favouriteGame;
    }


    public String getFavouriteGame() {
        return favouriteGame;
    }

    @Override
    public String makeNoise() {
        return " Squeak";
    }

    @Override
    public String play() {
        return "runs in wheel";
    }
}
