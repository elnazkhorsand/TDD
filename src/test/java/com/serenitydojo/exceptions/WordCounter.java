package com.serenitydojo.exceptions;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Paths;

public class WordCounter {

    public int numberOfWordsInString(String stringValue){

        if(stringValue == null || stringValue.isBlank())
            return 0;
        else
            return stringValue.split("\\W").length;
    }

    public int numberOfWordsInFile(String fileName) {
        try {
            String fileContent = Files.readString(Paths.get(fileName));

            if (numberOfWordsInString(fileContent) == 0) {
                throw new FileHAsNoWordException("There is no word in the " + fileName);
            }else {
                return numberOfWordsInString(fileContent);
            }

        }catch (NoSuchFileException noFileExist){

            throw new FileHAsNoWordException("There is no word in the no exist  " + fileName);

        }catch (IOException otherExceptionRatherThanNoFile){

            return -1;

        }finally {

            System.out.println("FILE PROCESSED FOR " + fileName);

        }
    }
}
