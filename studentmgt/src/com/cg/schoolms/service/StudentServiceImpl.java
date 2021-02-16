package com.cg.schoolms.service;

import java.util.List;

import com.cg.schoolms.dao.IStudentDao;
import com.cg.schoolms.dao.StudentDaoImpl;
import com.cg.schoolms.entities.Student;
import com.cg.schoolms.exceptions.InvalidIdException;
import com.cg.schoolms.exceptions.InvalidScoreException;
import com.cg.schoolms.exceptions.InvalidStudentNameException;

public class StudentServiceImpl implements IStudentService{
  
	private IStudentDao dao=new StudentDaoImpl();
	
	@Override
	public Student addStudent(String name, int score) {
		validateName(name);
		validateScore(score);
		Student student=new Student(name,score);
		dao.add(student);
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
