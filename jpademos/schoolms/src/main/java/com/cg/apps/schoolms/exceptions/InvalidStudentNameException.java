package com.cg.apps.schoolms.exceptions;

public class InvalidStudentNameException extends RuntimeException{

    public InvalidStudentNameException(String msg){
        super(msg);
    }
}
