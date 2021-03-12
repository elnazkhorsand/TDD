package com.serenitydojo;

import com.serenitydojo.model.Feeder;
import org.junit.Assert;
import org.junit.Test;

public class WhenFeedingTheAnimals {

    @Test
    public void shouldFeedTheHamsterWithCabbage(){
        Feeder feeder = new Feeder();

        String food = feeder.feeds("Hamster", false);
        Assert.assertEquals("Cabbage", food);
    }

    @Test
    public void shouldFeedPremiumHamsterPremiumFood(){
        Feeder feeder = new Feeder();

        String food = feeder.feeds("Hamster", true);
        Assert.assertEquals("Lettuce", food);
    }

    @Test
    public void shouldFeedTheDogWithBone(){
        Feeder feeder = new Feeder();

        String food = feeder.feeds("Dog", false);
        Assert.assertEquals("Bone", food);
    }

    @Test
    public void shouldFeedPremiumDogPremiumFood(){
        Feeder feeder = new Feeder();

        String food = feeder.feeds("Dog", true);
        Assert.assertEquals("Premium Dog Food", food);
    }

    @Test
    public void shouldFeedTheCatWithTuna(){
        Feeder feeder = new Feeder();

        String food = feeder.feeds("Cat", false);
        Assert.assertEquals("Tuna", food);
    }

    @Test
    public void shouldFeedPremiumCatPremiumFood(){
        Feeder feeder = new Feeder();

        String food = feeder.feeds("Cat", true);
        Assert.assertEquals("Salmon", food);
    }
}
