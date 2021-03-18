package com.cg.apps.schoolmswithjpa.studentms.service;

import com.cg.apps.schoolmswithjpa.studentms.entities.Student;
import com.cg.apps.schoolmswithjpa.studentms.exceptions.InvalidIdException;
import com.cg.apps.schoolmswithjpa.studentms.exceptions.InvalidStudentNameException;
import com.cg.apps.schoolmswithjpa.studentms.exceptions.StudentNotFoundException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.api.function.Executable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.context.annotation.Import;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import javax.persistence.EntityManager;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(SpringExtension.class)
@Import(StudentServiceImpl.class)
@DataJpaTest
@AutoConfigureTestDatabase
class StudentServiceImplTest {

    @Autowired
    private StudentServiceImpl service;

    @Autowired
    private EntityManager entityManager;

    /**
     * scenario: student exist in the store
     * precondition :student is in the store so added in it
     */

    @Test
    public void testFindById_1(){
        Student student=new Student("rohit",90);
        entityManager.persist(student);
        int assignedStudentId=student.getId();

        Student result =service.findById(assignedStudentId);
        Assertions.assertNotNull(result);
        Assertions.assertEquals(assignedStudentId,result.getId());
        Assertions.assertEquals("rohit",result.getName());
        Assertions.assertEquals(90, result.getScore());
    }


    /**
     * scenario : student doesn't exist in store
     * expectation :StudentNotFoundException is thrown
     */
    @Test
    public void testFindBy_2(){
        /*
        Executable executable=new Executable(){
            @Override
            public void execute() throws Throwable {
                service.findById(154);
            }
        };
        */

        Executable executable=()->service.findById(123);
        Assertions.assertThrows(StudentNotFoundException.class,executable);

    }

    /**
     * scenario : when id is negative
     * expectation: InvalidIdException is thrown
     */

    @Test
    public void testFindById_3(){
        Executable executable=()->service.findById(-10);
        Assertions.assertThrows(InvalidIdException.class,executable);

    }


    /**
     * scenario : student added successfully
     * expectation: student added in the database
     */
    @Test
    public void testAdd_1(){
        String name="raja";
        int score=95;
        Student result=service.addStudent(name, score);
        Assertions.assertNotNull(result);
        List<Student> fetched=entityManager.createQuery("from Student",Student.class).getResultList();
        Assertions.assertEquals(1,fetched.size());
        Student stored=fetched.get(0);
        Assertions.assertEquals(stored.getId(),result.getId());
        Assertions.assertEquals(name,stored.getName());
        Assertions.assertEquals(name,result.getName());
        Assertions.assertEquals(score,stored.getScore());
        Assertions.assertEquals(score,result.getScore());
    }

    /**
     * scenario : name is passed empty
     * expectation : InvalidStudentNameException is thrown
     */
    @Test
    public void testAdd_2(){
        Executable executable=()->service.addStudent("",20);
        Assertions.assertThrows(InvalidStudentNameException.class,executable);
    }



}