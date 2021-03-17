package com.serenitydojo.exceptions;

import org.junit.Test;

import java.io.IOException;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class WhenWorkingWithExceptions {

    int numberOfWords;

    //Given
    WordCounter wordCounter = new WordCounter();

    @Test
    public void shouldCountNumberOfWordsInString(){

        //When
        numberOfWords = wordCounter.numberOfWordsInString("some string");

        //Then
        assertThat(numberOfWords).isEqualTo(2);
    }

    @Test
    public void shouldReturnZeroWhenStringIsEmpty(){

        //When
        numberOfWords = wordCounter.numberOfWordsInString(null);

        //The
        assertThat(numberOfWords).isEqualTo(0);

    }

    @Test
    public void shouldCountNumberOfWordsInFile() {

        //When
        numberOfWords = wordCounter.numberOfWordsInFile("src/main/resources/hello.txt");

        //Then
        assertThat(numberOfWords).isEqualTo(3);

    }

    @Test
    public void shouldReportAnErrorIfFileDoesNotExist(){

        //When
        numberOfWords = wordCounter.numberOfWordsInFile("FileDoesNotExist.txt");

        //Then
        assertThat(numberOfWords).isEqualTo(0);

    }

    @Test
    public void shouldReportAnErrorIfWronfFileFormat(){

        //When
        numberOfWords = wordCounter.numberOfWordsInFile("");

        //Then
        assertThat(numberOfWords).isEqualTo(-1);

    }
}
