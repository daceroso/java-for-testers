package com.serenitydojo.objects;

import com.serenitydojo.Cat;
import org.junit.Test;

public class WhenCreatingObjects {

    @Test
    public void creating_a_cat(){
        String name = "Felix";
        String favoriteFood = "Tuna";
        int  age = 4;


        Cat felix = new Cat("Felix", "Tuna", 4);


        System.out.println(felix.getName());
        System.out.println(felix.getFavoriteFood());
        System.out.println(felix.getAge());

        felix.age = 4;


        Cat spot = new Cat("Spot", "Tuna", 3);
        spot.name = "Spot";
        spot.age = 3;
    }
}
