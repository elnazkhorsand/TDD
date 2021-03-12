package com.serenitydojo;

import com.serenitydojo.model.AnimalType;
import com.serenitydojo.model.Feeder;
import com.serenitydojo.model.FoodType;
import org.junit.Assert;
import org.junit.Test;

import static com.serenitydojo.model.FoodType.*;

import static com.serenitydojo.model.AnimalType.*;

public class WhenFeedingTheAnimals {

    FoodType food;

    @Test
    public void shouldFeedTheHamsterWithCabbage(){
        Feeder feeder = new Feeder();

        food = feeder.feeds(Hamster, false);
        Assert.assertEquals(CABBAGE, food);
    }

    @Test
    public void shouldFeedPremiumHamsterPremiumFood(){
        Feeder feeder = new Feeder();

        food = feeder.feeds(Hamster, true);
        Assert.assertEquals(LETTUCE, food);
    }

    @Test
    public void shouldFeedTheDogWithBone(){
        Feeder feeder = new Feeder();

        food = feeder.feeds(Dog, false);
        Assert.assertEquals(DOG_FOOD, food);
    }

    @Test
    public void shouldFeedPremiumDogPremiumFood(){
        Feeder feeder = new Feeder();

        food = feeder.feeds(Dog, true);
        Assert.assertEquals(DELUXE_DOG_FOOD, food);
    }

    @Test
    public void shouldFeedTheCatWithTuna(){
        Feeder feeder = new Feeder();

        food = feeder.feeds(Cat, false);
        Assert.assertEquals(TUNA, food);
    }

    @Test
    public void shouldFeedPremiumCatPremiumFood(){
        Feeder feeder = new Feeder();

        food = feeder.feeds(AnimalType.Cat, true);
        Assert.assertEquals(SALMON, food);
    }
}
