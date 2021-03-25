package com.serenitydojo.collections;

import org.assertj.core.api.Assertions;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class WhenWorkingWithJavaLists {

    //List: An ordered collection in Java which duplicate values are possible as well.

    @Test
    public void creatingSimpleLists(){
        List simpleList = new ArrayList();

        simpleList.add("a simple list");
        simpleList.add(123);
        simpleList.add(true);

        assertThat(simpleList).contains("a simple list", 123, true);
    }

}
