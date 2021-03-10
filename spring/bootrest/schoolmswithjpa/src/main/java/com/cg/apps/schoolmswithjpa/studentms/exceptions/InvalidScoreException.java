package com.cg.apps.schoolmswithjpa.studentms.exceptions;

public class InvalidScoreException extends RuntimeException{
    public InvalidScoreException(String msg){
        super(msg);
    }
}
