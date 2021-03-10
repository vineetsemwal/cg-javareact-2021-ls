package com.cg.apps.schoolmswithoutjpa.coursems.exceptions;


public class CourseNotFoundException extends RuntimeException{
    public CourseNotFoundException(String msg){
        super(msg);
    }
}
