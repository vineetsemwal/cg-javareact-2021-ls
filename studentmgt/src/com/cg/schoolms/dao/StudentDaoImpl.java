package com.cg.schoolms.dao;

import java.util.*;

import com.cg.schoolms.entities.Student;
import com.cg.schoolms.exceptions.StudentNotFoundException;

public class StudentDaoImpl implements IStudentDao {

	private Map<Integer,Student>store=StoreHolder.getInstance().getStore();

     public int generateId() {
    	int generatedId=store.size()+1;
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
		if(!store.containsKey(id)) {
			throw new StudentNotFoundException("student doesn't exist for id="+id);
		}
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
