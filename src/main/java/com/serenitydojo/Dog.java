package com.serenitydojo;

public class Dog extends Pet{

    private String favoriteToy;

    public Dog(String name, int age, String favoriteToy) {
        super(name, age);
        this.favoriteToy = favoriteToy;
    }

    public String getFavoriteToy() {
        return favoriteToy;
    }
}
