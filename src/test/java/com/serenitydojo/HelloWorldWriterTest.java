package com.serenitydojo;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class HelloWorldWriterTest {

    @Test
    public void shouldWriteHelloWorldToTheConsole(){
        HelloWorldWriter writer = new HelloWorldWriter();
        writer.writeHelloWorld();
    }


    @Test
    public void workingWithTheMostBasicCollectionsArrayInJava(){
        String[] colors = {"Red","Blue", "Green"};

        String[] moreColors = new String[3];

        moreColors[0] = "Yellow";
        moreColors[1] = "Pink";

        System.out.println("The first color is: " + moreColors[0]);
        System.out.println("The second color is: " + moreColors[1]);
    }

    @Test
    public void workingWithLoops(){
        String[] colors = {"Red","Blue", "Green", "Black", "White", "Yellow", "Grey", "Purple"};

        System.out.println("The colors in order are: \n");

        for (int i=0; i<colors.length; i++){
            System.out.println(colors[i]);
        }

    }

    @Test
    public void workingWithListArrayList(){
        List<String> colors = new ArrayList<>();

        colors.add("Yellow");
        colors.add("Black");
        colors.add("White");
        colors.add("Red");
        colors.add("Blue");
        colors.add("Silver");
        colors.add("Gold");

        System.out.println("Colors in the List are:\n");
        for (String eachColor: colors){
            System.out.println("---- " + eachColor);
        }
    }
}
