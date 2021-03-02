package com.cg.apps.schoolms.dao;

import com.cg.apps.schoolms.entities.Student;

import javax.persistence.EntityManager;


public interface IStudentDao {

    void add (Student student);

    Student findById(int id);

    Student update(Student student);

    EntityManager getEntityManager();

}
