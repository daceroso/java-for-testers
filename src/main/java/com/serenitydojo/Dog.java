package com.serenitydojo;

public class Dog extends Pet{
    private final String favoriteToy;
    private final int age;

    static final String DOG_NOISE = "Woof";
    public Dog(String name, String favoriteToy, int age) {
        super(name, age);
        this.favoriteToy = favoriteToy;
        this.age = age;
    }


    public String getFavoriteToy() {
        return favoriteToy;
    }

    public int getAge() {
        return age;
    }

    public String makeNoise() {
        return DOG_NOISE;
    }

    @Override
    public String play() {
        return "plays with bone";
    }
}
