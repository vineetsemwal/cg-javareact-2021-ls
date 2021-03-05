package com.cg.apps.schoolmswithoutjpa.exceptions;

public class InvalidScoreException extends RuntimeException{
    public InvalidScoreException(String msg){
        super(msg);
    }
}
