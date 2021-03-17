package com.serenitydojo.exceptions;

public class WordCounter {

    public int numberOfWordsIn(String sentence){
        if(sentence==null)
            return 0;
        else
            return sentence.split("\\W").length;
    }
}
