package com.cg.apps.schoolmswithjpa.studentms.service;

import java.util.List;
import java.util.Optional;

import com.cg.apps.schoolmswithjpa.studentms.dao.IStudentRepository;
import com.cg.apps.schoolmswithjpa.studentms.entities.Student;
import com.cg.apps.schoolmswithjpa.studentms.exceptions.InvalidIdException;
import com.cg.apps.schoolmswithjpa.studentms.exceptions.InvalidScoreException;
import com.cg.apps.schoolmswithjpa.studentms.exceptions.InvalidStudentNameException;
import com.cg.apps.schoolmswithjpa.studentms.exceptions.StudentNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
public class StudentServiceImpl implements IStudentService {

    @Autowired
    private IStudentRepository repository;

    @Transactional
    @Override
    public Student addStudent(String name, int score) {
        validateName(name);
        validateScore(score);
        Student student = new Student(name, score);
        student = repository.save(student);
        return student;
    }

    @Override
    public Student findById(int id) {
        validateId(id);
        Optional<Student> optional = repository.findById(id);
        if (!optional.isPresent()) {
           throw new StudentNotFoundException("student not found for id="+id);
        }
        return optional.get();

    }


    @Override
    public List<Student> findAll() {
        List<Student> students = repository.findAll();
        return students;
    }

    @Transactional
    @Override
    public Student updateName(int id, String name) {
        validateName(name);
        Student student = findById(id);
        student.setName(name);
        student = repository.save(student);
        return student;
    }

    @Transactional
    @Override
    public void deleteById(int id) {
        repository.deleteById(id);
    }

    @Override
    public List<Student>findByName(String name){
    	List<Student>list= repository.findByName(name);
	     return list;
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

    void validateId(int id) {
        if (id < 0) {
            throw new InvalidIdException("id should not be negative");
        }
    }

}
