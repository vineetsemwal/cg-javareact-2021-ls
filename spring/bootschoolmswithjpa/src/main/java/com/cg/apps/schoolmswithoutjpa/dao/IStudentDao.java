package com.cg.apps.schoolmswithoutjpa.dao;

import com.cg.apps.schoolmswithoutjpa.entities.Student;

import java.util.List;

public interface IStudentDao {

    void add (Student student);

    Student update(Student student);

    Student findById(int id);

    List<Student>findAll();

}
