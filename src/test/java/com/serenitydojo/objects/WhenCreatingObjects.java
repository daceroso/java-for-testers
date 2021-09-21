package com.serenitydojo.objects;

import com.serenitydojo.Cat;
import com.serenitydojo.Dog;
import com.serenitydojo.Hampster;
import com.serenitydojo.Pet;
import org.junit.Assert;
import org.junit.Test;

import static com.serenitydojo.Cat.usualFood;

public class WhenCreatingObjects {

    @Test
    public void creating_a_cat(){

        Cat felix = new Cat("Felix", "Tuna", 4);
        Assert.assertEquals(felix.getName(), "Felix");
        Assert.assertEquals(felix.getFavoriteFood(), "Tuna");
        Assert.assertEquals(felix.getAge(), 4);



        Cat spot = new Cat("Spot", "Tuna", 3);
        System.out.println("Spot's age is " + spot.getAge());
    }



    @Test
    public void creating_a_dog() {
        Dog fido = new Dog("Fido", "Bone", 5);
        Assert.assertEquals(fido.getName(), "Fido");
        Assert.assertEquals(fido.getFavoriteToy(), "Bone");
        Assert.assertEquals(fido.getAge(), 5);
    }

    @Test
    public void creating_a_hampster() {
        Hampster budy = new Hampster("Budy", 1, "Swinging");
        Assert.assertEquals(budy.getName(), "Budy");
        Assert.assertEquals(budy.getAge(), 1);
        Assert.assertEquals(budy.getFavouriteGame(), "Swinging");
    }


    @Test
    public void cat_makes_noise() {
        Cat felix = new Cat("Felix", 4);
        Cat spot = new Cat("Spot", "Salmon", 3);

        felix.makeNoise();
        felix.feed(" Tuna");
        felix.groom();

        spot.makeNoise();
        spot.feed("Salom");


        System.out.println("Felix's favorite food:  " + felix.getFavoriteFood());
        System.out.println("Cats like: " + usualFood());
        System.out.println("Felix goes: " + felix.makeNoise());


    }

    @Test
    public void dog_makes_noise() {
        Dog fido = new Dog("Fido", "Bone", 5);
        System.out.println("Fido goes: " + fido.makeNoise());
    }


    @Test
    public void pets_make_noise() {
        Pet felix = new Cat("Felix", 4);
        Pet fido = new Dog("Fido", "bone", 5);
        Pet rusty = new Hampster("Rusty", 1, "Wheels");

        System.out.println("Felix goes " + felix.makeNoise());
        System.out.println("Fido goes " + fido.makeNoise());
        System.out.println("Rusty goes " + rusty.makeNoise());

    }



    @Test
    public void pets_can_play() {
        Pet felix = new Cat("Felix", 4);
        Pet fido = new Dog("Fido", "bone", 5);
        Pet rusty = new Hampster("Rusty", 1, "Wheels");

        System.out.println("Felix " + felix.play());
        System.out.println("Fido " + fido.play());
        System.out.println("Rusty " + rusty.play());


        Assert.assertEquals(felix.play(), "plays with string");
        Assert.assertEquals(fido.play(), "plays with bone");
        Assert.assertEquals(rusty.play(), "runs in wheel");
    }



}
