package com.serenitydojo;

import org.junit.Assert;
import org.junit.Test;

public class WhenCreatingObjects {

    @Test
    public void creating_a_dog(){
        Dog fido = new Dog("Fido", 5, "Bone");

        Assert.assertEquals(fido.getName(),"Fido");
        Assert.assertEquals(fido.getFavoriteToy(),"Bone");
        Assert.assertEquals(fido.getAge(),5);
    }

    @Test
    public void creating_a_cat(){
        Cat felix = new Cat("Felix", 4, "Tuna");

        Assert.assertEquals(felix.getName(), "Felix");
        Assert.assertEquals(felix.getAge(), 4);
        Assert.assertEquals(felix.getFavoriteFood(), "Tuna");
    }

    @Test
    public void creating_a_hamster(){
        Hamster rusty = new Hamster("Rusty", 1, "Wheel");

        Assert.assertEquals(rusty.getName(), "Rusty");
        Assert.assertEquals(rusty.getAge(), 1);
        Assert.assertEquals(rusty.getFavoriteGame(), "Wheel");
    }

    @Test
    public void pets_can_play() {
        Pet felix = new Cat("Felix",4);
        Pet fido = new Dog("Fido",5, "bone");
        Pet rusty = new Hamster("Rusty", 1, "wheels");

        Assert.assertEquals(felix.play(), "plays with string");
        Assert.assertEquals(fido.play(), "plays with bone");
        Assert.assertEquals(rusty.play(), "runs in wheel");

    }

}
