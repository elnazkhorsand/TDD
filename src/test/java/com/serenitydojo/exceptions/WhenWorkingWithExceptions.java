package com.serenitydojo.exceptions;

import org.assertj.core.api.Assertions;
import org.junit.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class WhenWorkingWithExceptions {

    @Test
    public void shouldCountNumberOfWordsInString(){

        //Given
        WordCounter wordCounter = new WordCounter();

        //When
        int numberOfWords = wordCounter.numberOfWordsIn("some string");

        //Then
        assertThat(numberOfWords).isEqualTo(2);
    }

    @Test
    public void shouldReturnZeroWhenStringIsEmpty(){

        //Given
        WordCounter wordCounter = new WordCounter();

        //When
        int numberOfWords = wordCounter.numberOfWordsIn(null);

        //The
        assertThat(numberOfWords).isEqualTo(0);

    }

}
