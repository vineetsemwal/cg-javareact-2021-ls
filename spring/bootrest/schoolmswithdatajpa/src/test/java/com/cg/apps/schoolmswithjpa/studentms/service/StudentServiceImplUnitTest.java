package com.cg.apps.schoolmswithjpa.studentms.service;

import com.cg.apps.schoolmswithjpa.studentms.dao.IStudentRepository;
import com.cg.apps.schoolmswithjpa.studentms.entities.Student;
import com.cg.apps.schoolmswithjpa.studentms.util.StudentUtil;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.Spy;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.test.context.junit.jupiter.SpringExtension;

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

}
