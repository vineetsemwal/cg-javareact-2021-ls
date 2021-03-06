package com.cg.apps.schoolmswithoutjpa.studentms.service;

import com.cg.apps.schoolmswithoutjpa.studentms.entities.Student;


import java.util.List;

public interface IStudentService {

   Student addStudent(String name, int score);
    
    Student findById(int id);

    List<Student>findAll();

    Student updateName(int id, String name);

    void deleteById(int id);

}
