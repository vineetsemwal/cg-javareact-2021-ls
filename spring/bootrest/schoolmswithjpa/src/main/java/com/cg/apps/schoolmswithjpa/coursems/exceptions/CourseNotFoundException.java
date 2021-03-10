package com.cg.apps.schoolmswithjpa.coursems.exceptions;


public class CourseNotFoundException extends RuntimeException{
    public CourseNotFoundException(String msg){
        super(msg);
    }
}
