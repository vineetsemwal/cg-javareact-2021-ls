package com.cg.apps.schoolmswithoutjpa.studentms.service;

import com.cg.apps.schoolmswithoutjpa.studentms.dao.StoreHolder;
import com.cg.apps.schoolmswithoutjpa.studentms.dao.StudentDaoImpl;
import com.cg.apps.schoolmswithoutjpa.studentms.entities.Student;
import com.cg.apps.schoolmswithoutjpa.studentms.exceptions.StudentNotFoundException;
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


}