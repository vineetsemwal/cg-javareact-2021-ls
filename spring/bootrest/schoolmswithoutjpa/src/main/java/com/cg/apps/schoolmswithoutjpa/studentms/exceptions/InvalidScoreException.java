package com.cg.apps.schoolmswithoutjpa.studentms.exceptions;

public class InvalidScoreException extends RuntimeException{
    public InvalidScoreException(String msg){
        super(msg);
    }
}
