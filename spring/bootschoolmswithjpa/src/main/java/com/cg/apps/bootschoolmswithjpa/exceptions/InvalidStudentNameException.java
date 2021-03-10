package com.cg.apps.bootschoolmswithjpa.exceptions;

public class InvalidStudentNameException extends RuntimeException{

    public InvalidStudentNameException(String msg){
        super(msg);
    }
}
