package com.cg.apps.schoolmswithjpa.studentms.controllers;

import com.cg.apps.schoolmswithjpa.studentms.dto.CreateStudentRequest;
import com.cg.apps.schoolmswithjpa.studentms.dto.StudentDetails;
import com.cg.apps.schoolmswithjpa.studentms.entities.Student;
import com.cg.apps.schoolmswithjpa.studentms.service.IStudentService;
import com.cg.apps.schoolmswithjpa.studentms.util.StudentUtil;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Spy;
import static org.mockito.Mockito.*;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
class StudentRestControllerUnitTest {

    @Mock
    IStudentService service;

    @Mock
    StudentUtil util;


    @Spy
    @InjectMocks
    StudentRestController controller;

    @Test
    public void testFetchStudent_1(){
        int id=5;
        Student student=mock(Student.class);
        StudentDetails studentDetails=mock(StudentDetails.class);
        when(service.findById(id)).thenReturn(student);
        when(util.toDetails(student)).thenReturn(studentDetails);
        StudentDetails result =controller.fetchStudent(id);
        assertSame(studentDetails,result);
        verify(service).findById(id);
        verify(util).toDetails(student);
    }

    @Test
    public void  testAddStudent_1(){
        String name="rohit";
        int score=80;
        CreateStudentRequest request=new  CreateStudentRequest();
        request.setName(name);
        request.setScore(score);
        Student student=mock(Student.class);
        when(service.addStudent(name,score)).thenReturn(student);
        StudentDetails details=mock(StudentDetails.class);
        when(util.toDetails(student)).thenReturn(details);
        StudentDetails result= controller.addStudent(request);
        assertSame(details,result);
        verify(service).addStudent(name,score);
    }

}