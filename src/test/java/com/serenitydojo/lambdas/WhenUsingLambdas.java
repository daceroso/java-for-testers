package com.serenitydojo.lambdas;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;


public class WhenUsingLambdas {

    @Test
    public void printingOutColors() {
        List<String> colors = Arrays.asList("red", "green", "blue");

        colors.forEach(
                color -> System.out.println("COLOR: " + color)
        );

//        for (String color: colors) {
//            printColorOf(color);
//        }
    }

//    public void printColorOf(String color) {
//        System.out.println("COLOR: " + color);
//    }

}
