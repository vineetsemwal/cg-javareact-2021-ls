package com.cg.apps.bootschoolmswithjpa.dao;

import com.cg.apps.bootschoolmswithjpa.entities.Student;

import java.util.List;

public interface IStudentDao {

    void add (Student student);

    Student update(Student student);

    Student findById(int id);

    List<Student>findAll();

}
