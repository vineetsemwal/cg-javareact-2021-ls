package com.cg.schoolms.service;

import com.cg.schoolms.entities.Student;


import java.util.List;

public interface IStudentService {

   Student addStudent(String name, int score);
    
    Student findById(int id);

    List<Student>findAll();

}
