package com.serenitydojo.exceptions;


//Extending the RuntimeException rather than Exception because it wont need declaration by 'throw'
public class FileHAsNoWordException extends RuntimeException{

    public FileHAsNoWordException(String message) {
        super(message);
    }

    public FileHAsNoWordException(String message, Throwable cause) {
        super(message, cause);
    }

}