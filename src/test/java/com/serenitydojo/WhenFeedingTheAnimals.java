package com.serenitydojo;

import com.serenitydojo.model.Feeder;
import org.junit.Assert;
import org.junit.Test;

public class WhenFeedingTheAnimals {

    @Test
    public void shouldFeedTheAnimalWithTheRightFood(){
        Feeder feeder = new Feeder();

        String food = feeder.feed("Cat");
        Assert.assertEquals("Tuna", food);
    }
}
