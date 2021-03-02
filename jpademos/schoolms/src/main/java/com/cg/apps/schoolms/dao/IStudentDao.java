package com.cg.apps.schoolms.dao;

import com.cg.apps.schoolms.entities.Student;

import javax.persistence.EntityManager;
import java.util.List;


public interface IStudentDao {

    void add (Student student);

    Student findById(int id);

    Student update(Student student);

    List<Student> findAll();

    List<Student> findStudentsByScore(int age);

    EntityManager getEntityManager();
}
