package com.cg.apps.schoolms.service;

import java.util.List;

import com.cg.apps.schoolms.dao.*;
import com.cg.apps.schoolms.entities.*;
import com.cg.apps.schoolms.exceptions.*;

import javax.persistence.*;

public class StudentServiceImpl implements IStudentService {

    private IStudentDao dao = new StudentDaoImpl();

    public EntityManager getEntityManager() {
        return dao.getEntityManager();
    }

    @Override
    public Student addStudent(String name, int score) {
        validateName(name);
        validateScore(score);
        EntityTransaction transaction = getEntityManager().getTransaction();
        transaction.begin();
        Student student = new Student(name, score);
        dao.add(student);
        transaction.commit();
        return student;
    }

    @Override
    public Student findById(int id) {
        Student student = dao.findById(id);
        return student;
    }

    @Override
    public List<Student> findAll() {
        List<Student> list = dao.findAll();
        return list;
    }

    @Override
    public List<Student> findStudentsByScore(int score) {
        List<Student> list = dao.findStudentsByScore(score);
        return list;
    }

    @Override
    public Student updateName(int id, String newName) {
        validateName(newName);
        EntityTransaction transaction = getEntityManager().getTransaction();
        transaction.begin();
        Student student = findById(id);
        student.setName(newName);
        student = dao.update(student);
        transaction.commit();
        return student;
    }

    void validateScore(int score) {
        if (score < 0) {
            throw new InvalidScoreException("score can't be negative");
        }
    }

    void validateName(String name) {
        if (name == null || name.isEmpty() || name.trim().isEmpty()) {
            throw new InvalidStudentNameException("name can't be null or empty");
        }
    }


}
