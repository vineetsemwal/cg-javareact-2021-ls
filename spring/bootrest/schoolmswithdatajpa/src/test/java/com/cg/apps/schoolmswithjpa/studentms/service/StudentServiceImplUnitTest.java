package com.cg.apps.schoolmswithjpa.studentms.service;

import com.cg.apps.schoolmswithjpa.studentms.dao.IStudentRepository;
import com.cg.apps.schoolmswithjpa.studentms.entities.Student;
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

    @Spy
    @InjectMocks
    StudentServiceImpl service;


    /**
     * success scenario
     */
    @Test
    public void testAdd_1() {
        System.out.println("inside test add");
        System.out.println("service=" + service + " repository=" + repository);
        String name = "rohit";
        int score = 90;
        doNothing().when(service).validateName(name);
        doNothing().when(service).validateScore(score);
        Student saved = Mockito.mock(Student.class);
        when(repository.save(Mockito.any(Student.class))).thenReturn(saved);
        Student result = service.addStudent(name, score);
        Assertions.assertNotNull(result);
        Assertions.assertEquals(saved, result);
        verify(repository).save(Mockito.any(Student.class));
        verify(service).validateScore(score);
        verify(service).validateName(name);

    }

}
