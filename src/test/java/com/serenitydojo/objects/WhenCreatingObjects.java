package com.serenitydojo.objects;

import com.serenitydojo.Cat;
import com.serenitydojo.Dog;
import org.junit.Assert;
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

        Cat spot = new Cat("Spot", "Tuna", 3);
        System.out.println("Spot' age is " + spot.getAge());
    }



    @Test
    public void creating_a_dog() {
        Dog fido = new Dog("Fido", "Bone", 5);
        Assert.assertEquals(fido.getName(), "Fido");
        Assert.assertEquals(fido.getFavoriteToy(), "Bone");
        Assert.assertEquals(fido.getAge(), 5);
    }
}
