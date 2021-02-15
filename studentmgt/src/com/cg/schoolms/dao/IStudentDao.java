package com.cg.schoolms.dao;

import com.cg.schoolms.entities.Student;

import java.util.List;

public interface IStudentDao {

    void add (Student student);

    Student findById(int id);

    List<Student>findAll();

}
