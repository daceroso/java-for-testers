package com.serenitydojo.collection;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

public class WhenWorkingWithMaps {

    @Test
    public void creatingAMap() {
        Map<String, Integer> numberOfBallsByColor = new HashMap<>();

        numberOfBallsByColor.put("red", 3);
        numberOfBallsByColor.put("green", 6);
        numberOfBallsByColor.put("blue", 5);

        Integer numberOfRedBalls = numberOfBallsByColor.get("red");

        System.out.println("There are " + numberOfRedBalls + " red balls");
    }

    @Test
    public void creatingAMapMoreConcisely() {
        Map<String, Integer> numberOfBallsByColor;
        numberOfBallsByColor = Map.of("red", 3, "green", 6);

        Map<String, Integer> moreColors = new HashMap<>();
        moreColors.put("yellow", 10);
        moreColors.putAll(numberOfBallsByColor);

        System.out.println("Number of Color for white balls: " + moreColors.getOrDefault("white", 0));

        System.out.println("Purple tennis balls are present: " + moreColors.containsKey("blue"));

        moreColors.put("yellow", 20);
        moreColors.put("pink", 15);
        moreColors.replace("pink", 17);

        System.out.println("Number of yellow tennis balls " + moreColors.getOrDefault("yellow", 0));
        System.out.println("Number of yellow tennis balls " + moreColors.getOrDefault("pink", 0));

    }

    @Test
    public void iteratingOverMapKeys(){
        Map<String, Integer> numberOfBallsByColor = Map.of("red", 3, "green", 6);
        System.out.println("keys : " + numberOfBallsByColor.keySet());

        printMap(numberOfBallsByColor);

        Map<String, Integer> modifiableMap = new HashMap<>();
        modifiableMap.putAll(numberOfBallsByColor);
        modifiableMap.remove("red");
        modifiableMap.clear();
        printMap(modifiableMap);

    }


    private void printMap(Map<String, Integer> numberOfBallsByColor) {
        for(Map.Entry<String, Integer> entry :  numberOfBallsByColor.entrySet()){
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}
