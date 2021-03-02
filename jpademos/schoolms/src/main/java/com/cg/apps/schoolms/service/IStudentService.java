package com.cg.apps.schoolms.service;

import com.cg.apps.schoolms.entities.Student;


import java.util.List;

public interface IStudentService {

   Student addStudent(String name, int score);
    
    Student findById(int id);

    Student updateName(int id, String name );
}
