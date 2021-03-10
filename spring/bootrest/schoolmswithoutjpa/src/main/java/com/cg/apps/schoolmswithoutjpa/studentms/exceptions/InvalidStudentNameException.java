package com.cg.apps.schoolmswithoutjpa.studentms.exceptions;

public class InvalidStudentNameException extends RuntimeException{

    public InvalidStudentNameException(String msg){
        super(msg);
    }
}
