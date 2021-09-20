package com.serenitydojo;

public class Cat {
    private String name;
    private String favoriteFood;
    private int age;


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
}
