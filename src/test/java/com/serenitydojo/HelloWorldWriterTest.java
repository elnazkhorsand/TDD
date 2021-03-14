package com.serenitydojo;

import org.junit.Test;

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
}
