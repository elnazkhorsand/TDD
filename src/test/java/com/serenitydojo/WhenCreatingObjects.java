package com.serenitydojo;

import org.junit.Assert;
import org.junit.Test;

public class WhenCreatingObjects {

    @Test
    public void creating_a_dog(){
        Dog fido = new Dog("Fido", 5, "Bone");

        Assert.assertEquals("Fido", fido.getName());
        Assert.assertEquals("Bone", fido.getFavoriteToy());
        Assert.assertEquals(5, fido.getAge());
    }

    @Test
    public void creating_a_cat(){
        Cat felix = new Cat("Felix", 4, "Tuna");

        Assert.assertEquals("Felix", felix.getName());
        Assert.assertEquals(4, felix.getAge());
        Assert.assertEquals("Tuna", felix.getFavoriteFood());
    }

    @Test
    public void creating_a_hamster(){
        Hamster rusty = new Hamster("Rusty", 1, "Wheel");

        Assert.assertEquals("Rusty", rusty.getName());
        Assert.assertEquals(1, rusty.getAge());
        Assert.assertEquals("Wheel", rusty.getFavoriteGame());
    }

    @Test
    public void pets_can_play() {
        Pet felix = new Cat("Felix",4);
        Pet fido = new Dog("Fido",5, "bone");
        Pet rusty = new Hamster("Rusty", 1, "wheels");

        Assert.assertEquals("plays with string", felix.play());
        Assert.assertEquals("plays with bone", fido.play());
        Assert.assertEquals("runs in wheel", rusty.play());

    }

}
