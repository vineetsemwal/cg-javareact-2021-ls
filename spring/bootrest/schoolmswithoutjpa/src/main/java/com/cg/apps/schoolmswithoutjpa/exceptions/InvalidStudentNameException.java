package com.cg.apps.schoolmswithoutjpa.exceptions;

public class InvalidStudentNameException extends RuntimeException{

    public InvalidStudentNameException(String msg){
        super(msg);
    }
}
