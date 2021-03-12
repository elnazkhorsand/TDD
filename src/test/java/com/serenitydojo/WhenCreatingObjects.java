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
        Cat kitty = new Cat("Kitty", 3, "Tuna");

        Assert.assertEquals(kitty.getName(), "Kitty");
        Assert.assertEquals(kitty.getAge(), 3);
        Assert.assertEquals(kitty.getFavoriteFood(), "Tuna");
    }

    @Test
    public void creating_a_hamster(){
        Hamster hami = new Hamster("Hami", 2, "Hide & Seek");

        Assert.assertEquals(hami.getName(), "Hami");
        Assert.assertEquals(hami.getAge(), 2);
        Assert.assertEquals(hami.getFavoriteGame(), "Hide & Seek");
    }

}
