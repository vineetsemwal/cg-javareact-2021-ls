package com.cg.apps.schoolmswithoutjpa.studentms.service;

import com.cg.apps.schoolmswithoutjpa.studentms.dao.StoreHolder;
import com.cg.apps.schoolmswithoutjpa.studentms.dao.StudentDaoImpl;
import com.cg.apps.schoolmswithoutjpa.studentms.entities.Student;
import com.cg.apps.schoolmswithoutjpa.studentms.exceptions.InvalidIdException;
import com.cg.apps.schoolmswithoutjpa.studentms.exceptions.InvalidStudentNameException;
import com.cg.apps.schoolmswithoutjpa.studentms.exceptions.StudentNotFoundException;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.api.function.Executable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Import;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(SpringExtension.class)
@Import({StudentServiceImpl.class, StudentDaoImpl.class, StoreHolder.class})
class StudentServiceImplTest {

    @Autowired
    StudentServiceImpl service;

    @Autowired
    StoreHolder storeHolder;

    Map<Integer,Student>store;

    @BeforeEach
    public void setup(){
    store=storeHolder.getStudentsStore();
    }

    @AfterEach
    public void clear() {
        store.clear();
    }

    /**
     * scenario: student exist in the store
     * precondition :student is in the store so added in it
     */
    @Test
    public void testFindById_1(){
       Student student=new Student("rohit",90);
       student.setId(12);
       store.put(12,student);
       Student result =service.findById(12);
       Assertions.assertNotNull(result);
       Assertions.assertEquals(12,result.getId());
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
     */
    @Test
    public void testAdd_1(){
        String name="raja";
        int score=95;
        Student result=service.addStudent(name, score);
        Assertions.assertNotNull(result);
        Assertions.assertEquals(1,store.size());
        int addedId=result.getId();
        Student stored=store.get(addedId);
        Assertions.assertEquals(name,stored.getName());
        Assertions.assertEquals(name,result.getName());
        Assertions.assertEquals(score,stored.getScore());
        Assertions.assertEquals(score,result.getScore());
    }

    /**
     * sceneario : name is passed empty
     * expetation : InvalidStudentNameException is thrown
     */
    @Test
    public void testAdd_2(){
        Executable executable=()->service.addStudent("",20);
        Assertions.assertThrows(InvalidStudentNameException.class,executable);
    }


}