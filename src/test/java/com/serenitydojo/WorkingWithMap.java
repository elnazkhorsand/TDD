package com.serenitydojo;

import org.assertj.core.api.Assertions;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

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

        Assertions.assertThat(peopleAge.get("Dad")).isEqualTo(40);
        Assertions.assertThat(peopleAge.get("Mom")).isEqualTo(32);
        Assertions.assertThat(peopleAge.get("Elnaz")).isEqualTo(25);
        Assertions.assertThat(peopleAge.get("Irene")).isEqualTo(24);



    }

    @Test
    public void testingMapHashMapMapOf(){
        Map<String, Integer> peopleAge = Map.of("First", 23, "Second", 32, "Third", 40);

        System.out.println("The age of First is: " + peopleAge.get("First"));
        System.out.println("The age of Second is: " + peopleAge.get("Second"));
        System.out.println("The age of Third is: " + peopleAge.get("Third"));

        Assertions.assertThat(peopleAge.get("First")).isEqualTo(23);
        Assertions.assertThat(peopleAge.get("Second")).isEqualTo(32);
        Assertions.assertThat(peopleAge.get("Third")).isEqualTo(40);

    }

}
