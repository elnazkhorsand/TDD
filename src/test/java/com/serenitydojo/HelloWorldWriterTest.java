package com.serenitydojo;

import org.assertj.core.api.Assertions;
import org.junit.Test;

import java.lang.reflect.Array;
import java.sql.SQLOutput;
import java.util.*;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.in;

public class HelloWorldWriterTest {

    @Test
    public void shouldWriteHelloWorldToTheConsole(){
        HelloWorldWriter writer = new HelloWorldWriter();
        writer.writeHelloWorld();
    }
}