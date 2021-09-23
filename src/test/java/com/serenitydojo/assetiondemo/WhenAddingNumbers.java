package com.serenitydojo.assetiondemo;


import org.junit.Test;

import java.sql.Struct;
import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.as;
import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.data.Percentage.withPercentage;

public class WhenAddingNumbers {

    @Test
    public void shouldAddTwoIntegersCorrectly() {

        int a = 1;
        int b = 2;

        int sum = a + b;

        assertThat(sum).isEqualTo(4);
        assertThat(sum).isBetween(1,10);
        assertThat(sum).isCloseTo(4, withPercentage(10));



        String color = "red";
        String otherColor = "Red";

        assertThat(color).isEqualToIgnoringCase(otherColor);
        assertThat(color).isEqualTo(otherColor);
        assertThat(color).contains("red");
        assertThat(color).startsWith("r");
    }


    @Test
    public void shouldVerifyStrings() {
        String color = "red,green,blue";

        assertThat(color).containsPattern("[g|G]reen");
    }

    @Test
    public void assertCollections(){
        List<String> colors = Arrays.asList("red", "green", "blue");

        assertThat(colors).hasSize(3);
        assertThat(colors).contains("green");
        assertThat(colors).containsExactly("red", "green", "blue");
        assertThat(colors).containsExactlyInAnyOrder("blue", "green", "red");
        assertThat(colors).doesNotContain("yellow");
    }


}
