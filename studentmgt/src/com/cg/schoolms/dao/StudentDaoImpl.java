package com.cg.schoolms.dao;

import java.util.*;

import com.cg.schoolms.entities.Student;

public class StudentDaoImpl implements IStudentDao {

	private int generatedId=0;
	private Map<Integer,Student>store=StoreHolder.getStore();

	public int generateId() {
	    generatedId++;
	    return generatedId;
	}


	@Override
	public void add(Student student) {
		int id=generateId();
		student.setId(id);
		store.put(id, student);
	}

	@Override
	public Student findById(int id) {
		Student student=store.get(id);
	    return student; 
	}

	@Override
	public List<Student> findAll() {
		Collection<Student>students=store.values();
		List<Student>list=new ArrayList<>(students);
		return list;		
	}

}
