package com.cg.apps.schoolmswithjpa.studentms.dao;

import com.cg.apps.schoolmswithjpa.studentms.entities.Student;

import java.util.List;

public interface IStudentDao {

    void add (Student student);

    Student findById(int id);

    List<Student>findAll();

    Student update(Student  student);

    void deleteById(int id);
}
