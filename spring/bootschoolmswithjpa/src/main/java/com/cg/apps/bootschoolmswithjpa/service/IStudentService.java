package com.cg.apps.bootschoolmswithjpa.service;

import com.cg.apps.bootschoolmswithjpa.entities.Student;


import java.util.List;

public interface IStudentService {

   Student addStudent(String name, int score);
    
    Student findById(int id);

    List<Student>findAll();

    Student changeName(int id, String name);

}
