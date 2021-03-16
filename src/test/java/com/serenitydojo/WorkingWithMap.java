package com.serenitydojo;

import org.assertj.core.api.Assertions;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.assertj.core.api.Assertions.assertThat;

public class WorkingWithMap {

    @Test
    public void testingMapHashMap(){
        Map<String, Integer> peopleAge = new HashMap<>();
        peopleAge.put("Elnaz", 25);
        peopleAge.put("Irene", 24);
        peopleAge.put("Mom", 32);
        peopleAge.put("Dad", 40);

        System.out.println("The age of Dad is: " + peopleAge.get("Dad"));
        System.out.println("The age of Mom is: " + peopleAge.get("Mom"));
        System.out.println("The age of Elnaz is: " + peopleAge.get("Elnaz"));
        System.out.println("The age of Irene is: " + peopleAge.get("Irene"));

        assertThat(peopleAge.get("Dad")).isEqualTo(40);
        assertThat(peopleAge.get("Mom")).isEqualTo(32);
        assertThat(peopleAge.get("Elnaz")).isEqualTo(25);
        assertThat(peopleAge.get("Irene")).isEqualTo(24);

        peopleAge.remove("Elnaz");
    }

    @Test
    public void testingMapHashMapMapOf(){

        //Using Map.of is immutableMap and you cannot remove item from it.

        Map<String, Integer> peopleAge = Map.of("First", 23, "Second", 32, "Third", 40);

        System.out.println("The age of First is: " + peopleAge.get("First"));
        System.out.println("The age of Second is: " + peopleAge.get("Second"));
        System.out.println("The age of Third is: " + peopleAge.get("Third"));

        assertThat(peopleAge.get("First")).isEqualTo(23);
        assertThat(peopleAge.get("Second")).isEqualTo(32);
        assertThat(peopleAge.get("Third")).isEqualTo(40);

        Map<String, Integer> morePeopleAge = new HashMap<>();

        morePeopleAge.put("More", 2);

        morePeopleAge.putAll(peopleAge);

        System.out.println("The third item of 'Second' in the 'morePeopleAge' is: " + morePeopleAge.get("Second"));

        System.out.println(morePeopleAge.get("First"));
    }

    @Test
    public void testingMapHashMapContainsKey(){
        Map<String, Integer> peopleAge = new HashMap<>();
        peopleAge.put("Elnaz", 25);
        peopleAge.put("Irene", 24);
        peopleAge.put("Mom", 32);
        peopleAge.put("Dad", 40);

        System.out.println(peopleAge.containsKey("Arnika"));
        System.out.println(peopleAge.containsKey("Elnaz"));

        assertThat(peopleAge.containsKey("Arnika")).isFalse();
        assertThat(peopleAge.containsKey("Elnaz")).isTrue();
    }

    @Test
    public void testingMapHashMapDefaultValue(){
        Map<String, Integer> peopleAge = new HashMap<>();
        peopleAge.put("Elnaz", 25);
        peopleAge.put("Irene", 24);
        peopleAge.put("Mom", 32);
        peopleAge.put("Dad", 40);

        System.out.println(peopleAge.getOrDefault("Arnika", 11));

    }

    @Test
    public void testingMapHashMapReplace(){
        Map<String, Integer> peopleAge = new HashMap<>();
        peopleAge.put("Elnaz", 25);
        peopleAge.put("Irene", 24);
        peopleAge.put("Mom", 32);
        peopleAge.put("Dad", 40);

        //If the key exists it will replace the value of it.
        peopleAge.replace("Elnaz", 22);
        //If the key doesn't exist, it wont do anything.
        peopleAge.replace("Arnika", 223);

        System.out.println(peopleAge.get("Arnika"));
        System.out.println("Elnaz is " + peopleAge.get("Elnaz") + " Years old.");

    }
}
