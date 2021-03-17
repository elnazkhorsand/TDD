package com.serenitydojo.exceptions;

import org.junit.Test;

import java.io.IOException;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class WhenWorkingWithExceptions {

    //Given
    WordCounter wordCounter = new WordCounter();

    @Test
    public void shouldCountNumberOfWordsInString(){

        //When
        int numberOfWords = wordCounter.numberOfWordsInString("some string");

        //Then
        assertThat(numberOfWords).isEqualTo(2);
    }

    @Test
    public void shouldReturnZeroWhenStringIsEmpty(){

        //When
        int numberOfWords = wordCounter.numberOfWordsInString(null);

        //The
        assertThat(numberOfWords).isEqualTo(0);

    }

    @Test
    public void shouldCountNumberOfWordsInFile() throws IOException {

        //When
        int numberOfWords = wordCounter.numberOfWordsInFile("src/main/resources/hello.txt");

        //Then
        assertThat(numberOfWords).isEqualTo(3);

    }

}
