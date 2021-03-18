package com.cg.apps.schoolmswithjpa.studentms.service;

import com.cg.apps.schoolmswithjpa.studentms.dao.IStudentRepository;
import com.cg.apps.schoolmswithjpa.studentms.entities.Student;
import com.cg.apps.schoolmswithjpa.studentms.exceptions.InvalidStudentNameException;
import com.cg.apps.schoolmswithjpa.studentms.exceptions.StudentNotFoundException;
import com.cg.apps.schoolmswithjpa.studentms.util.StudentUtil;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.api.function.Executable;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.Spy;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.util.Optional;

import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class StudentServiceImplUnitTest {

    @Mock
    IStudentRepository repository;
    @Mock
    StudentUtil util;

    @Spy
    @InjectMocks
    StudentServiceImpl service;

    /**
     * success scenario
     */
    @Test
    public void testAdd_1() {
        String name = "rohit";
        int score = 90;
        doNothing().when(service).validateName(name);
        doNothing().when(service).validateScore(score);
        Student saved = Mockito.mock(Student.class);
        Student student = Mockito.mock(Student.class);
        when(util.newStudent()).thenReturn(student);
        when(repository.save(student)).thenReturn(saved);
        Student result = service.addStudent(name, score);
        Assertions.assertNotNull(result);
        Assertions.assertEquals(saved, result);
        verify(repository).save(student);
        verify(service).validateScore(score);
        verify(service).validateName(name);

    }

    @Test
    public void testAdd_2(){
        String name="";
        doThrow(InvalidStudentNameException.class).when(service).validateName(name);
        Executable executable=()->service.addStudent(name,20);
        Assertions.assertThrows(InvalidStudentNameException.class,executable);
    }

    /**
     * name is empty
     */
    @Test
    public void testValidateName_1(){
        String name="";
       Executable executable=()-> service.validateName(name);
        Assertions.assertThrows(InvalidStudentNameException.class,executable);
    }

    /**
     * name is null
     */
    @Test
    public void testValidateName_2(){
        String name=null;
        Executable executable=()-> service.validateName(name);
        Assertions.assertThrows(InvalidStudentNameException.class,executable);
    }
    /**
     * name is not empty
     */
    @Test
    public void testValidateName_3(){
        String name="rohit";
       service.validateName(name);
    }

    /**
     * scenario: student found
     */
    @Test
    public void testFindById_1(){
        int id=10;
        Student student=mock(Student.class);
        Optional<Student>optional= Optional.of(student);
        when(repository.findById(10)).thenReturn(optional);
        Student result=service.findById(10);
        Assertions.assertEquals(student,result);
        verify(repository).findById(id);
    }

    /**
     * scenario :student not found
     */
    @Test
    public void testFindById_2(){
        int id=100;
        Optional<Student> optional=Optional.empty();
        when(repository.findById(id)).thenReturn(optional);
        Executable executable=()->service.findById(id);
        Assertions.assertThrows(StudentNotFoundException.class,executable);
    }

}
