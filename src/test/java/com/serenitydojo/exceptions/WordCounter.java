package com.serenitydojo.exceptions;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Paths;

public class WordCounter {

    public int numberOfWordsInString(String sentence){
        if(sentence==null)
            return 0;
        else
            return sentence.split("\\W").length;
    }

    public int numberOfWordsInFile(String filePath) {
        try {
            String fileContent = Files.readString(Paths.get(filePath));
            return numberOfWordsInString(fileContent);
        }catch (NoSuchFileException noFileExist){
            System.out.println("There is no such a file exist!");
            return 0;
        }catch (IOException otherExceptionRatherThanNoFile){
            return -1;
        }finally {
            System.out.println("FILE PROCESSED FOR " + filePath);
        }
    }
}
