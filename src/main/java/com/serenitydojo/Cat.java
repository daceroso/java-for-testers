package com.serenitydojo;

public class Cat extends Pet {
    /**
     * The name of the cat
     *
     */

    private String favoriteFood;
    private int age;

    static final String CAT_NOISE = "Meow";

    public static String usualFood() {
        return "Tuna";
    }


    public Cat(String name, int age) {
        super(name,age);
        this.age = age;
        this.favoriteFood = Cat.usualFood();
    }

    public Cat(String name, String favoriteFood, int age) {
        super(name, age);
        this.favoriteFood = favoriteFood;

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
        System.out.println(getName() + " eats some " + food);
    }

    public void groom() {
        lickPaws();
        cleanFur();
    }

    private void cleanFur() {
        System.out.println(getName() + " clean his fur");
    }

    private void lickPaws() {
        System.out.println(getName() + " licks his paws");
    }
}
