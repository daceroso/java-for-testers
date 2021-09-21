package com.serenitydojo.conditional;

import com.serenitydojo.model.Feeder;
import org.junit.Assert;
import org.junit.Test;

public class WhenFeedingTheAnimals {

    @Test
    public void shouldFeedCatsTuna() {
        Feeder feeder = new Feeder();

        String food  = feeder.feeds("Cat");
        Assert.assertEquals("Tuna", food );
    }



    @Test
    public void shouldFeedHampsterCabbage() {
        Feeder feeder = new Feeder();
        String food  = feeder.feeds("Hampster");
        Assert.assertEquals("Cabbage", food );

    }
}
