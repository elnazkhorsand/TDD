package com.serenitydojo.model;

public class Feeder {

    public String feeds(String animal, boolean isPremium) {

        String food;
        switch (animal) {
            case "Cat":
                food = (isPremium) ? "Salmon" : "Tuna";
                break;
            case "Dog":
                food = (isPremium) ? "Premium Dog Food" : "Bone";
                break;
            case "Hamster":
                food = (isPremium) ? "Lettuce" : "Cabbage";
                break;
            default:
                food = "Unknown animal - Unknown food!";
        }

        return food;
    }
}
