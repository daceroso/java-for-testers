package com.serenitydojo;

public class Cat {
    private String name;
    private String favoriteFood;
    private int age;

    static final String CAT_NOISE = "Meow";

    public static String usualFood() {
        return "Tuna";
    }


    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
        this.favoriteFood = Cat.usualFood();
    }

    public Cat(String name, String favoriteFood, int age) {
        this.name = name;
        this.favoriteFood = favoriteFood;
        this.age = age;
    }

    public String getName() {
        return name;
    }
    public int getAge(){ return age;}

    public String getFavoriteFood() {
        return favoriteFood;
    }

    public void setFavoriteFood(String favoriteFood) {
        this.favoriteFood = favoriteFood;
    }

    public void makeNoise() {
        System.out.println(CAT_NOISE);
    }

    public void feed(String food) {
        System.out.println(name + " eats some " + food);
    }

    public void groom() {
        lickPaws();
        cleanFur();
    }

    private void cleanFur() {
        System.out.println(name + " clean his fur");
    }

    private void lickPaws() {
        System.out.println(name + " licks his paws");
    }
}
