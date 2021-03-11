package com.cg.apps.schoolmswithjpa.studentms.exceptions;

public class InvalidStudentNameException extends RuntimeException{

    public InvalidStudentNameException(String msg){
        super(msg);
    }
}
