package com.cg.schoolms.service;

import java.util.List;

import com.cg.schoolms.dao.IStudentDao;
import com.cg.schoolms.dao.StudentDaoImpl;
import com.cg.schoolms.entities.Student;

public class StudentServiceImpl implements IStudentService{
  
	private IStudentDao dao=new StudentDaoImpl();
	
	@Override
	public Student addStudent(String name, int score) {
		Student student=new Student(name,score);
		dao.add(student);
		return student;
	}

	@Override
	public Student findById(int id) {
		Student student=dao.findById(id);
		return student;		
	}

	@Override
	public List<Student> findAll() {
		List<Student>students=dao.findAll();
		return students;
	}

}
