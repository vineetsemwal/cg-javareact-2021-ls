package com.cg.apps.schoolmswithjpa.studentms.controllers;

import com.cg.apps.schoolmswithjpa.studentms.exceptions.InvalidScoreException;
import com.cg.apps.schoolmswithjpa.studentms.exceptions.InvalidStudentNameException;
import com.cg.apps.schoolmswithjpa.studentms.exceptions.StudentNotFoundException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class CentralizedExceptionHandler {
   private static final Logger Log= LoggerFactory.getLogger(CentralizedExceptionHandler.class);

    @ResponseStatus(HttpStatus.NOT_FOUND)
    @ExceptionHandler(StudentNotFoundException.class)
    public String handleStudentNotFound(StudentNotFoundException e){
        return  e.getMessage();
    }

    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ExceptionHandler(InvalidStudentNameException.class)
    public  String handleInvalidName(InvalidStudentNameException e){
        return e.getMessage();
    }

    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ExceptionHandler(InvalidScoreException.class)
    public String handleInvalidScore(InvalidScoreException e){
        return e.getMessage();
    }

    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    @ExceptionHandler(Exception.class)
    public String handleCatchAll(Exception e){
        Log.error("exception caught",e);
        return e.getMessage();
    }


}
