package com.cg.apps.bootschoolmswithjpa.service;

import java.util.List;

import com.cg.apps.bootschoolmswithjpa.entities.Student;
import com.cg.apps.bootschoolmswithjpa.exceptions.InvalidIdException;
import com.cg.apps.bootschoolmswithjpa.exceptions.InvalidScoreException;
import com.cg.apps.bootschoolmswithjpa.dao.IStudentDao;
import com.cg.apps.bootschoolmswithjpa.exceptions.InvalidStudentNameException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
public class StudentServiceImpl implements IStudentService{

	@Autowired
	private IStudentDao dao;

	@Transactional
	@Override
	public Student addStudent(String name, int score) {
		validateName(name);
		validateScore(score);
		Student student=new Student(name,score);
		dao.add(student);
		return student;
	}

	@Transactional
	@Override
	public Student changeName(int id, String name){
        Student student=findById(id);
	    student.setName(name);
	    student=dao.update(student);
	    return student;
	}

	@Override
	public Student findById(int id) {
		validateId(id);
		Student student=dao.findById(id);
		return student;		
	}


	@Override
	public List<Student> findAll() {
		List<Student>students=dao.findAll();
		return students;
	}

	void validateScore(int score){
		if(score<0){
         throw new InvalidScoreException("score can't be negative");
		}
	}

   void validateName(String name){
		if(name==null || name.isEmpty() || name.trim().isEmpty()){
			throw new InvalidStudentNameException("name can't be null or empty");
		}
	}

	void validateId(int id){
		if(id <0){
			throw new InvalidIdException("id should not be negative");
		}
	}

}
