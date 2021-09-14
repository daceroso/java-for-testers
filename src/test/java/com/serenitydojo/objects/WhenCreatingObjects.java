package com.serenitydojo.objects;

import com.serenitydojo.Cat;
import org.junit.Test;

public class WhenCreatingObjects {

    @Test
    public void creating_a_cat(){
        String name = "Felix";
        String favoriteFood = "Tuna";
        int  age = 4;


        Cat felix = new Cat("Felix");
        felix.setName("Felix");
        felix.setFavoriteFood("Tuna");


        System.out.println(felix.getFavoriteFood());
        System.out.println(felix.getName());

        felix.age = 4;


        Cat spot = new Cat();
        spot.name = "Spot";
        spot.age = 3;
    }
}
