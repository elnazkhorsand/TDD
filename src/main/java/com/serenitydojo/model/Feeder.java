package com.serenitydojo.model;

import static com.serenitydojo.model.FoodType.*;

public class Feeder {

    public FoodType feeds(AnimalType animal, boolean isPremium) {

        switch (animal) {
            case Cat:
                return (isPremium) ? SALMON : TUNA;
            case Dog:
                return (isPremium) ? DELUXE_DOG_FOOD : DOG_FOOD;
            case Hamster:
                return (isPremium) ? LETTUCE : CABBAGE;
            default:
                return  UNKNOWN;
        }
    }
}
