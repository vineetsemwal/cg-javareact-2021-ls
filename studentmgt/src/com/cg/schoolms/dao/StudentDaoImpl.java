package com.cg.schoolms.dao;

import java.util.*;

import com.cg.schoolms.entities.Student;

public class StudentDaoImpl implements IStudentDao {

	
	@Override
	public void add(Student student) {
		Map<Integer,Student>store=StoreHolder.store;
		int id=StoreHolder.generateId();
		student.setId(id);
		store.put(id, student);
	}

	@Override
	public Student findById(int id) {
		Map<Integer,Student>store=StoreHolder.store;
		Student student=store.get(id);
	    return student; 
	}

	@Override
	public List<Student> findAll() {
		Map<Integer,Student>store=StoreHolder.store;
		Collection<Student>students=store.values();
		List<Student>list=new ArrayList<>(students);
		return list;		
	}

}
