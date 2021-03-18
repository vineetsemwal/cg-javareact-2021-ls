package com.cg.apps.schoolmswithjpa.studentms.service;

import com.cg.apps.schoolmswithjpa.studentms.entities.Student;
import com.cg.apps.schoolmswithjpa.studentms.exceptions.InvalidIdException;
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




}